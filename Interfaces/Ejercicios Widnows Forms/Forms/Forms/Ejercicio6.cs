using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Forms
{
    public partial class Ejercicio6 : Form
    {
        int cont = 0;
        public Ejercicio6()
        {
            InitializeComponent();
        }

        private void trackBar1_Scroll(object sender, EventArgs e)
        {
            label1.Text = trackBar1.Value.ToString();
            progressBar1.Value = trackBar1.Value;
            cont = trackBar1.Value;

            timer1.Enabled = true;
            label3.Text = cont.ToString();
            label3.Visible = true;

        }

        private void progressBar1_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {
            
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            cont--;
            label3.Text = cont.ToString();
            progressBar1.Value--;


            if (cont == 0)
            {
                timer1.Enabled = false;
            }
        }
    }
}
