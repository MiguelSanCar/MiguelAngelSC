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
    public partial class FParte1 : Form
    {
        public FParte1()
        {
            InitializeComponent();
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }
        private void labelDinamica()
        {

            Label label1 = new Label();
            label1.Text = "Examen Windows Forms";
            label1.Location = new Point(12, 45);
            this.panel1.Controls.Add(label1);

        }

        private void FParte1_Load(object sender, EventArgs e)
        {
            labelDinamica();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            FParte2 ejercicio2 = new FParte2();
            ejercicio2.ShowDialog();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            FParte3 ejercicio3 = new FParte3();
            ejercicio3.ShowDialog();

        }

        private void button3_Click(object sender, EventArgs e)
        {
            FParte4 ejercicio4 = new FParte4();
            ejercicio4.ShowDialog();

        }

        private void button4_Click(object sender, EventArgs e)
        {
            FParte5 ejercicio5 = new FParte5();
            ejercicio5.ShowDialog();

        }

        private void button5_Click(object sender, EventArgs e)
        {
            FParte6 ejercicio6 = new FParte6();
            ejercicio6.ShowDialog();

        }
    }
}
