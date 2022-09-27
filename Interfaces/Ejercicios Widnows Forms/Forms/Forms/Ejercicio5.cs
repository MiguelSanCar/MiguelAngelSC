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
    public partial class Ejercicio5 : Form
    {
        int contador;
        public Ejercicio5()
        {
            InitializeComponent();
        }

        private void timer3_Tick(object sender, EventArgs e)
        {

        }

        private void Ejercicio5_Load(object sender, EventArgs e)
        {

        }

        private void timer7_Tick(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            contador = Int32.Parse(textBox1.Text);
            label1.Text = contador.ToString();
            label1.Visible = true;
            timer1.Enabled = true;

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

            
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            contador--;
            label1.Text = contador.ToString();
            

            if (contador == 0)
            {
                timer1.Enabled = false;
                this.Close();
            }
        }
    }
}
