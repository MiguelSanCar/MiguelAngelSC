using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WFExamen.Properties;

namespace WFExamen
{
    public partial class FParte5 : Form
    {
        public FParte5()
        {
            InitializeComponent();
        }

        private void FParte5_Load(object sender, EventArgs e)
        {
            buttondinamico();
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }
        private void buttondinamico()
        {

            Button button1 = new Button();
            button1.Text = "Cambiar";
            button1.Location = new Point(347, 150);
            button1.Size = new Size(96, 96);

            button1.Click += new EventHandler(buttondinamico_Click);

            this.Controls.Add(button1);

        }

        private void buttondinamico_Click(Object sender, EventArgs e)
        {

            Image imagen1 = pictureBox1.Image;
            Image imagen2 = pictureBox2.Image;

            pictureBox1.Image = imagen2;
            pictureBox2.Image = imagen1;
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }
    }
}
