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
using System.Windows.Shapes;

namespace Simulacro
{
    /// <summary>
    /// Lógica de interacción para SimulacroWPF.xaml
    /// </summary>
    public partial class SimulacroWPF : Window
    {
        public SimulacroWPF()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Ejercicio1 ej1 = new Ejercicio1();
            ej1.Show();
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            Ejercicio2 ej2 = new Ejercicio2();
            ej2.Show();
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            Ejercicio3 ej3 = new Ejercicio3();
            ej3.Show();

        }

        private void Button_Click_3(object sender, RoutedEventArgs e)
        {
            Ejercicio4 ej4 = new Ejercicio4();
            ej4.Show();

        }
    }
}
