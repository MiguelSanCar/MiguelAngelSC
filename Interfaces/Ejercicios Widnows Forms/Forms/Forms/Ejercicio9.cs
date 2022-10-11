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
    public partial class Ejercicio9 : Form
    {
        public Ejercicio9()
        {
            InitializeComponent();
        }

        private void Ejercicio9_Load(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
        }

        private void button1_Click(object sender, EventArgs e)
        {

            String texto1 = textBox1.Text;

            String s = "";
            int numero2 = 0;

            if (!textBox1.Text.ToUpper().Equals(texto1))
            {
                errorProvider1.SetError(label1, "El nombre debe estar completamente en mayúsculas");
            }

            if(int.TryParse(textBox2.Text, out numero2) == false)
            { 
            
                errorProvider1.SetError(label2, "El contenido debe ser numérico");
            }



            if (!textBox3.Text.Contains("@")){
                errorProvider1.SetError(label3, "El campo de Email debe contener una @");
            }
        }

        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            char c = e.KeyChar;

            if(c < 'A' || c > 'Z')
            {
                e.Handled = true;

                if(c == 'Ñ')
                {
                    e.Handled = false;
                }
                if(c == Convert.ToChar(Keys.Back))
                {
                    e.Handled = false;
                }
            }
        }
    }
}
