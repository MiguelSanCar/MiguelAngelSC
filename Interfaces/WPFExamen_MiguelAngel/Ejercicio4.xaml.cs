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

namespace WPFExamen
{
    /// <summary>
    /// Lógica de interacción para Ejercicio4.xaml
    /// </summary>
    public partial class Ejercicio4 : Window
    {
        public Ejercicio4()
        {
            InitializeComponent();
        }

        private void cb1_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if(cb1.SelectedItem.Equals("Colores"))
            {
                cb2.Items.Add("Blanco");
                cb2.Items.Add("Negro");
                cb2.Items.Add("Rojo");
            }else if(cb1.SelectedItem.Equals("Números"))
            {
                cb2.Items.Add(1);
                cb2.Items.Add(2);
                cb2.Items.Add(3);

            }
        }
    }
}
