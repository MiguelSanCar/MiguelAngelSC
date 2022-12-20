using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFExamen
{
    public partial class FParte2 : Form
    {
        public FParte2()
        {
            InitializeComponent();
        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void FParte2_Load(object sender, EventArgs e)
        {

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void checkBox3_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

            String manana = checkBox1.Text;
            String tarde = checkBox2.Text;
            String noche = checkBox3.Text;


            List<String> lista = new List<String>(3);


                if (listBox1.Items.Count == 0)
                {
                        if (checkBox1.Checked)
                        {
                            lista.Add(manana);
                        }
                        else if (checkBox2.Checked)
                        {
                            lista.Add(tarde);
                        }
                        else if (checkBox3.Checked)
                        {
                            lista.Add(noche);
                        }

                }
            else
            {
                if (checkBox1.Checked)
                {
                    lista.Add(" + " + manana);
                }
                if (checkBox2.Checked)
                {
                    lista.Add(" + " + tarde);
                }
                if (checkBox3.Checked)
                {
                    lista.Add(" + " + noche);
                }

            }




        }
    }
}
