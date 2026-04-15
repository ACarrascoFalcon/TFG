using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TFG
{
    public partial class FrmPrincipal : Form
    {
        public FrmPrincipal()
        {
            InitializeComponent();
        }
        private void MostrarControlEnPanel(UserControl controlHijo)
        {
            panelContenedor.Controls.Clear();

            controlHijo.Dock = DockStyle.Fill;

            panelContenedor.Controls.Add(controlHijo);

            controlHijo.BringToFront();
        }

        private void añadirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AgregarPreEmpr agregar = new AgregarPreEmpr();
            MostrarControlEnPanel(agregar);
        }
    }
}
