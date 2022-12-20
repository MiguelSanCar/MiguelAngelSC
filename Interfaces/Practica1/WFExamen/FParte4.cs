using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Messaging;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFExamen
{
    public partial class FParte4 : Form
    {
        public FParte4()
        {
            InitializeComponent();
        }

        private void FParte4_Load(object sender, EventArgs e)
        {

        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {

                
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            String hola = "Saludos, " + comboBox1.SelectedItem;
            String adios = "Adios, " + comboBox1.SelectedItem;

            if (radioButton1.Checked)
            {
                MessageBox.Show(hola,
    "Mensaje de saludo",
    MessageBoxButtons.OK, MessageBoxIcon.Information);

            }
            else if(radioButton2.Checked)
            {
                MessageBox.Show(adios,
    "Mensaje de despedida",
    MessageBoxButtons.OK, MessageBoxIcon.Information);

            }
        }
    }
}
