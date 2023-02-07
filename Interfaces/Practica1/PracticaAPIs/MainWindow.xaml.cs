using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Emit;
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
using static PracticaAPIs.Coctel;

namespace PracticaAPIs
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            
        }


        Coctel coctel1;

        void onclick1(Object sender, RoutedEventArgs e)
        {
            reutilizar();

        }
        void onclick2(Object sender, RoutedEventArgs e)
        {
            IsEnabled = true;
            if (boton2.Content.Equals("Non Alcoholic")){
                boton2.Content = "Alcoholic";

                do
                {
                    coctel1 = rellenar();
                } while (coctel1.drinks[0].strAlcoholic == "Non Alcoholic" || coctel1.drinks[0].strAlcoholic == "Optional alcoholic");
            }
            else
            {
                boton2.Content = "Non Alcoholic";
                do
                {
                    coctel1 = rellenar();
                } while (coctel1.drinks[0].strAlcoholic == "Alcoholic" || coctel1.drinks[0].strAlcoholic == "Optional alcoholic");
            }
        }

        Coctel rellenar()
        {
            var client = new RestClient("https://www.thecocktaildb.com");
            var request = new RestRequest("/api/json/v1/1/random.php");
            coctel1 = client.Execute<Coctel>(request).Data;
            return coctel1;
        }

        Coctel reutilizar()
        {
            coctel1 = rellenar();
            List<String> ingredientes = new List<String>();

            ingredientes.Add(coctel1.drinks[0].stringredient1);
            ingredientes.Add(coctel1.drinks[0].stringredient2);
            ingredientes.Add(coctel1.drinks[0].stringredient3);
            ingredientes.Add(coctel1.drinks[0].stringredient4);
            ingredientes.Add(coctel1.drinks[0].stringredient5);
            ingredientes.Add(coctel1.drinks[0].stringredient6);
            ingredientes.Add(coctel1.drinks[0].stringredient7);
            ingredientes.Add(coctel1.drinks[0].stringredient8);
            ingredientes.Add(coctel1.drinks[0].stringredient9);
            ingredientes.Add(coctel1.drinks[0].stringredient10);
            ingredientes.Add(coctel1.drinks[0].stringredient11);
            ingredientes.Add(coctel1.drinks[0].stringredient12);
            ingredientes.Add(coctel1.drinks[0].stringredient13);
            ingredientes.Add(coctel1.drinks[0].stringredient14);
            ingredientes.Add(coctel1.drinks[0].stringredient15);


            labelIngredients.Text = "";
            for (int i = 0; i < 15; i++)
            {
                if (ingredientes[i] != null)
                {
                    labelIngredients.Text = labelIngredients.Text + ingredientes[i] + "\n";
                }
            }


            label1.Content = coctel1.drinks[0].strDrink;
            textBoxInstructions.Text = coctel1.drinks[0].strInstructions;
            ImageSource imagenInterfaz = new ImageSourceConverter().ConvertFromString(coctel1.drinks[0].strDrinkThumb) as ImageSource;
            imagenCoctel.Source = imagenInterfaz;

            return coctel1;
        }

    }
}
