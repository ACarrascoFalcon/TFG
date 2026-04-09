using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TFG
{
    public class Usuario
    {

        public int id { get; set; }
        public string nombre { get; set; }
        public string primerApellido { get; set; }
        public string segundoApellido { get; set; }
        public string nombreUsuario { get; set; }
        public string password { get; set; }

        public Usuario() { }
    }
}
