using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Forms
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            this.BackColor = Color.Red;
            this.Text = "Titulo2";
            this.agregarLabel();
        }

        private void tabPage1_Click(object sender, EventArgs e)
        {

        }
        private void agregarLabel()
        {
            Label label = new Label();
            label.Name = "Label1";
            label.Text = "Hola";
            label.Location = new System.Drawing.Point(10, 10);
            label.Size = new System.Drawing.Size(200, 200);
            Font mifuente = new Font("Arial", 12);
            label.Font = mifuente;
            this.panel1.Controls.Add(label);
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void flowLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void panel4_Paint(object sender, PaintEventArgs e)
        {

        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {
            Font nose = new Font("Arial", 25);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Ejercicio boton = new Ejercicio();
            boton.Show();
            
        }

        /*
public void agregarBotonDinamico()
{
   Button boton = new Button();
   boton.Name = "boton";
   boton.Text = "Click";
   boton.Location = new System.Drawing.Point(25, 25);
   boton.Size = new System.Drawing.Size(100, 25);
   this.Controls.Add(boton);

}
*/
    }
}
