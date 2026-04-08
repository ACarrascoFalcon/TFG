using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace TFG
{
    public partial class FrmInicioSesion : Form
    {
        public FrmInicioSesion()
        {
            InitializeComponent();
        }
        private async void btnAceptar_Click(object sender, EventArgs e)
        { 
            await BuscarUsuario();
        }

        private async Task BuscarUsuario() { 
            try
            {
                using (var client = new HttpClient())
                {
                    // Crear objeto con los datos del usuario
                    var input = new Usuario();

                    input.nombreUsuario = txtUsuario.Text;
                    input.password = txtContrasea.Text;

                    // Serializar a JSON
                    var jsonInput = JsonConvert.SerializeObject(input);
                    var content = new StringContent(jsonInput, Encoding.UTF8, "application/json");

                    // POST al backend
                    var response = await client.PostAsync("http://localhost:8080/api/login", content);
                    response.EnsureSuccessStatusCode();

                    // Leer respuesta
                    var jsonResponse = await response.Content.ReadAsStringAsync();
                    var usuarioEncontrado = JsonConvert.DeserializeObject<Usuario>(jsonResponse);

                    if (usuarioEncontrado == null)
                    {
                        MessageBox.Show("El servidor devolvió un objeto vacío.");
                    }
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
