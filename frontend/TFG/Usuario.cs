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
        // C# usa PascalCase para las propiedades, pero para que Newtonsoft.Json
        // las asocie automáticamente con el JSON de Java (que usa camelCase),
        // lo mejor es definirlas así:

        public int id { get; set; }
        public string nombre { get; set; }
        public string primerApellido { get; set; }
        public string segundoApellido { get; set; }
        public string nombreUsuario { get; set; }
        public string password { get; set; }



        // Constructor vacío (necesario para la deserialización)
        public Usuario() { }
    }
}
