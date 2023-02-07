using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace PruebaAPI
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public class Juego
        {
            public int id { get; set; }
            public string title { get; set; }
            public string category { get; set; }
            public string alcoholic { get; set; }
            public string instructions { get; set; }
            public string ingrediente1 { get; set; }
            public string ingrediente2 { get; set; }
            public string ingrediente3 { get; set; }
            public string ingrediente4 { get; set; }
            public string ingrediente5 { get; set; }
            public string ingrediente6 { get; set; }
            public string ingrediente7 { get; set; }
            public string ingrediente8 { get; set; }
            public string ingrediente9 { get; set; }
            public string ingrediente10 { get; set; }
            public string ingrediente11 { get; set; }
            public string ingrediente12 { get; set; }
            public string ingrediente13 { get; set; }
            public string ingrediente14 { get; set; }
            public string ingrediente15 { get; set; }
        }

        public MainWindow()
        {
            InitializeComponent();
            List<Juego> listaJuegos;
            var client = new RestClient("www.thecocktaildb.com");
            var request = new RestRequest("/api/json/v1/1/random.php");
            listaJuegos = client.Execute<List<Juego>>(request).Data;


        }

    }
}
