using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement.Button;

namespace Forms
{
    public partial class Ejercicio3 : Form
    {
        String ruta = "C:\\Users\\FP\\Desktop";
        public Ejercicio3()
        {
            InitializeComponent();
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)

        {
            ifs();

        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
            ifs();

        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            ifs();

        }

        private void Ejercicio3_Load(object sender, EventArgs e)
        {

        }

        private void radioButton12_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton1.Checked == true)
            {
                ifs();
            }
            else if (radioButton2.Checked == true)
            {
                ifs();

            }
            else if (radioButton3.Checked == true)
            {
                ifs();

            }

        }

        private void radioButton11_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton1.Checked == true)
            {
                ifs();

            }
            else if (radioButton2.Checked == true)
            {
                ifs();

            }
            else if (radioButton3.Checked == true)
            {
                ifs();

            }

        }

        private void radioButton10_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton1.Checked == true)
            {
                ifs();

            }
            else if (radioButton2.Checked == true)
            {
                ifs();


            }
            else if (radioButton3.Checked == true)
            {
                ifs();


            }
        }
        private void ifs()
        {
            if (radioButton1.Checked == true && radioButton10.Checked == true)
            {
                pictureBox1.Image = Image.FromFile("C:\\Users\\FP\\Desktop\\ferrariamarillo.jfif");

            }
            if (radioButton1.Checked == true && radioButton11.Checked == true)
            {
                pictureBox1.Image = Image.FromFile("C:\\Users\\FP\\Desktop\\ferrari.jfif");

            }
            if (radioButton1.Checked == true && radioButton12.Checked == true)
            {
                pictureBox1.Image = Image.FromFile("C:\\Users\\FP\\Desktop\\ferrarinegro.jfif");

            }

            if (radioButton2.Checked == true && radioButton10.Checked == true)
            {
                pictureBox1.Image = Image.FromFile("C:\\Users\\FP\\Desktop\\bugattiamarillo.jfif");

            }
            if (radioButton2.Checked == true && radioButton11.Checked == true)
            {
                pictureBox1.Image = Image.FromFile("C:\\Users\\FP\\Desktop\\bugattinegro.jfif");

            }
            if (radioButton2.Checked == true && radioButton12.Checked == true)
            {
                pictureBox1.Image = Image.FromFile("C:\\Users\\FP\\Desktop\\bugattirojo.jfif");

            }

            if (radioButton3.Checked == true && radioButton10.Checked == true)
            {
                pictureBox1.Image = Image.FromFile("C:\\Users\\FP\\Desktop\\maserattiamarillo.jfif");

            }
            if (radioButton3.Checked == true && radioButton11.Checked == true)
            {
                pictureBox1.Image = Image.FromFile("C:\\Users\\FP\\Desktop\\maserattinegro.jfif");

            }
            if (radioButton3.Checked == true && radioButton12.Checked == true)
            {
                pictureBox1.Image = Image.FromFile("C:\\Users\\FP\\Desktop\\maserattirojo.jfif");

            }

        }
    }
}
