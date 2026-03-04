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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private async Task CargarUsuario()
        {
            try
            {
                using (var client = new HttpClient())
                {
                    var response = await client.GetAsync("http://localhost:8080/api/details");
                    response.EnsureSuccessStatusCode();

                    var json = await response.Content.ReadAsStringAsync();

                    Usuario usuario = JsonConvert.DeserializeObject<Usuario>(json);

                    nombre.Text = usuario.nombre;
                    apellido.Text = usuario.primerApellido;

                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private async void button1_Click(object sender, EventArgs e)
        {
            await CargarUsuario();
        }

        private async void button2_Click(object sender, EventArgs e)
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

                    input.nombreUsuario = nombre.Text;
                    input.password = apellido.Text;

                    // Serializar a JSON
                    var jsonInput = JsonConvert.SerializeObject(input);
                    var content = new StringContent(jsonInput, Encoding.UTF8, "application/json");

                    // POST al backend
                    var response = await client.PostAsync("http://localhost:8080/api/login", content);
                    response.EnsureSuccessStatusCode();

                    // Leer respuesta
                    var jsonResponse = await response.Content.ReadAsStringAsync();
                    var usuarioEncontrado = JsonConvert.DeserializeObject<Usuario>(jsonResponse);

                    if (usuarioEncontrado != null)
                    {
                        id.Text = usuarioEncontrado.id.ToString();
                    }
                    else
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
