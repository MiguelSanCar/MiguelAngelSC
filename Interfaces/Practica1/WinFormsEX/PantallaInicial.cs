using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinFormsEX
{
    public partial class PantallaInicial : Form
    {
        public PantallaInicial()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            FParte1 ejercicio1 = new FParte1();
            ejercicio1.ShowDialog();

        }

        private void button2_Click(object sender, EventArgs e)
        {
            FParte2 ejercicio2 = new FParte2();
            ejercicio2.ShowDialog();

        }

        private void button3_Click(object sender, EventArgs e)
        {
            FParte3 ejercicio3 = new FParte3();
            ejercicio3.ShowDialog();

        }

        private void button4_Click(object sender, EventArgs e)
        {
            FParte4 ejercicio4 = new FParte4();
            ejercicio4.ShowDialog();

        }
    }
}
