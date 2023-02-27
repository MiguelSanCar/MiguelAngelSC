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
    /// Lógica de interacción para Ejercicio_3.xaml
    /// </summary>
    public partial class Ejercicio3 : Window
    {
        public Ejercicio3()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            progressbar1.IsIndeterminate = true;

        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            if(progressbar1.IsEnabled == true)
            {
                progressbar1.IsIndeterminate = false;
            }
        }
    }
}
