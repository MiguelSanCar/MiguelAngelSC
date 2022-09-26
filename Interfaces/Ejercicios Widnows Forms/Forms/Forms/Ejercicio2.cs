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
    public partial class Ejercicio2 : Form
    {
        public Ejercicio2()
        {
            InitializeComponent();
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Font negrita = new Font("Times New Roman", 14, FontStyle.Bold);
            Font noNegrita = new Font("Times New Roman", 14);

            if (checkBox1.Checked == true)
            {
                checkBox1.Font = negrita;
            }
            else
            {
                checkBox1.Font = noNegrita;
            }
            if(checkBox2.Checked == true)
            {
                checkBox2.Font = negrita;
            }
            else
            {
                checkBox2.Font = noNegrita;
            }

        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void Ejercicio2_Load(object sender, EventArgs e)
        {

        }
    }
}
