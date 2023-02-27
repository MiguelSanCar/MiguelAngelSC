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

namespace WPFExamen
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

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Ejercicio1 ventana = new Ejercicio1();
            ventana.Show();

        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            Ejercicio2 ventana2 = new Ejercicio2();
            ventana2.Show();
        
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            Ejercicio3 ventana3 = new Ejercicio3();
            ventana3.Show();
        }

        private void Button_Click_3(object sender, RoutedEventArgs e)
        {
            Ejercicio4 ventana4 = new Ejercicio4();
            ventana4.Show();
        }

        private void Button_Click_4(object sender, RoutedEventArgs e)
        {
            Ejercicio5 ventana5 = new Ejercicio5();
            ventana5.Show();
        }

        private void Button_Click_5(object sender, RoutedEventArgs e)
        {
            Ejercicio6 ventana6 = new Ejercicio6();
            ventana6.Show();
        }
    }
}
