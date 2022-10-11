using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Reflection.Emit;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Label = System.Windows.Forms.Label;

namespace Forms
{
    public partial class Ejercicio8 : Form
    {

        public Ejercicio8()
        {
            InitializeComponent();
        }


        Font basica = new Font("Arial", 20);
        TextBox textBox1 = new TextBox();
        Button button1 = new Button();


        private void Ejercicio8_Load(object sender, EventArgs e)
        {
            labelDinamica();
            textBoxDinamica();
            buttonDinamico();

            
        }

        private void labelDinamica ()
        {

            Label label1 = new Label();
            label1.Text = "Nombre";
            label1.Font = basica;
            label1.Location = new Point(12,45);

            this.Controls.Add(label1);

        }

        private void textBoxDinamica()
        {
            textBox1.Location = new Point(120, 150);
            textBox1.Width = 150;
            textBox1.MaxLength = 20;

            this.Controls.Add(textBox1);

        }

        private void buttonDinamico()
        {
            button1.Text = "Saludo";
            button1.Location = new Point(20, 100);
            button1.Width = 80;
            button1.Height = 30;
            button1.BackColor = Color.AliceBlue;

            this.Controls.Add(button1);
            button1.Click += Button1_Click;
            


        }

        private void Button1_Click(object sender, EventArgs e)
        {
               MessageBox.Show("Hola, " + textBox1.Text,
                "Saludo",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information
                );

        }

    }




}
