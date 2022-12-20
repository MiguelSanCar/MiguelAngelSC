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
    public partial class FParte3 : Form
    {
        public FParte3()
        {
            InitializeComponent();
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            listBox1.SelectedItem = "Azul";
            trackBar1.Value++;

        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            listBox1.SelectedItem = "Rojo";

        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
            listBox1.SelectedItem = "Verde";

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if(listBox1.Text == "Azul")
            {
                radioButton2.Checked = false;
                radioButton3.Checked = false;
                radioButton1.Checked = true;

                trackBar1.Value++;

            }else if (listBox1.Text == "Rojo")
            {
                radioButton1.Checked = false;
                radioButton3.Checked = false;
                radioButton2.Checked = true;
            }
            else if (listBox1.Text == "Verde")
            {
                radioButton2.Checked = false;
                radioButton1.Checked = false;
                radioButton3.Checked = true;

            }
        }
    }
}
