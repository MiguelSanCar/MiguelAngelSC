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
    /// Lógica de interacción para Ejercicio2.xaml
    /// </summary>
    public partial class Ejercicio2 : Window
    {
        public Ejercicio2()
        {
            InitializeComponent();
        }

        private void CheckBox_Checked(object sender, RoutedEventArgs e)
        {
            if(check1.IsChecked == true)
            {
                label1.Visibility = Visibility.Visible;
            }
            else
            {
                label1.Visibility = Visibility.Collapsed;
            }
        }

        private void CheckBox_Checked2(object sender, RoutedEventArgs e)
        {
            if (check2.IsChecked == true)
            {
                label2.Visibility = Visibility.Visible; 
            }
            else
            {
                label2.Visibility = Visibility.Collapsed;
            }

        }

        private void check2_Checked(object sender, RoutedEventArgs e)
        {

        }
    }
}
