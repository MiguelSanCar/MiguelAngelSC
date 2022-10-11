using Forms.Idiomas;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Forms
{
    public partial class Ejercicio10: Form
    {
        public Ejercicio10()
        {
            InitializeComponent();
        }

        private void Ejercicio10_Load(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int posicion = 0;

            if(comboBox1.SelectedIndex == 0)
            {
                Thread.CurrentThread.CurrentUICulture = new CultureInfo("es-ES");
                posicion = 0;
            }
            else
            {
                Thread.CurrentThread.CurrentUICulture = new CultureInfo("en-US");
                posicion = 1;

            }


            label1.Text = Generico.label;
            button1.Text = Generico.Saludo;

            comboBox1.Items.Clear();
            comboBox1.Items.Add(Generico.espanol);
            comboBox1.Items.Add(Generico.ingles);

            comboBox1.SelectedIndex = posicion;
            
        }

        private void label1_Click(object sender, EventArgs e)
        {
        }
    }
}
