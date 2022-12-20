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
    public partial class FParte1 : Form
    {

        int cont = 0;

        //variable para incrementar o decrementar, en false es incremento
        bool cambio = false;

        public FParte1()
        {
            InitializeComponent();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if (!cambio)
            {
                cont++;
            }
            else
            {
                cont--;
            }

            label1.Text = cont.ToString();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //incrementar
            cambio = false;


        }

        private void button2_Click(object sender, EventArgs e)
        {
            //decrementar
            cambio = true;
        }
    }
}
