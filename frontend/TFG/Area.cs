using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TFG
{
    internal class Area
    {
        [JsonProperty("id")] 
        public int Id { get; set; }

        [JsonProperty("nombre")]
        public string Nombre { get; set; }
    }
}
