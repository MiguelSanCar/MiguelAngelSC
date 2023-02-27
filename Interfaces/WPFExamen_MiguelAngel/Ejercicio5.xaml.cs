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
    /// Lógica de interacción para Ejercicio5.xaml
    /// </summary>
    public partial class Ejercicio5 : Window
    {
        public Ejercicio5()
        {
            InitializeComponent();
        }

        private void Slider_ValueChanged(object sender, RoutedPropertyChangedEventArgs<double> e)
        {
            
            switch (slider.Value)
            {
                case 0:
                    btn1.Background = Brushes.AliceBlue;
                    btn3.Background = Brushes.AliceBlue;
                    btn4.Background = Brushes.AliceBlue;
                    btn2.Background = Brushes.AliceBlue;
                    break;
                case 1:
                    btn1.Background = Brushes.Aqua;
                    btn3.Background = Brushes.AliceBlue;
                    btn4.Background = Brushes.AliceBlue;
                    btn2.Background = Brushes.AliceBlue;
                    break;
                case 2:
                    btn2.Background = Brushes.Aqua;
                    btn4.Background = Brushes.AliceBlue;
                    btn3.Background = Brushes.AliceBlue;
                    break;
                case 3:
                    btn3.Background = Brushes.Aqua;
                    btn4.Background = Brushes.AliceBlue;
                    break;
                case 4:
                    btn4.Background = Brushes.Aqua;
                    break;
            }
        }
    }
}
