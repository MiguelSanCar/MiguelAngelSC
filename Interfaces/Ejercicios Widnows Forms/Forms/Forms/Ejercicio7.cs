using stdole;
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
       
    public partial class Ejercicio7 : Form

    {
        BindingList<Alumno> listado = new BindingList<Alumno>();

        public Ejercicio7()
        {
            InitializeComponent();
            
        }



        
        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            if(listado.Count != 0)
            {
                dataGridView1.Rows.RemoveAt(dataGridView1.CurrentCell.RowIndex);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                Alumno obj = new Alumno
                {
                    Nombre = textBox1.Text,
                    Edad = Int32.Parse(textBox2.Text),
                    Alta = dateTimePicker1.Value.Date,
                    Turno = comboBox1.Text,
                    Comedor = checkBox1.Checked
                };
                listado.Add(obj);
            }catch (Exception E)
            {
                label6.Visible = true;
                label6.Text = E.ToString();
            }


        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            
        }

        private void Ejercicio7_Load(object sender, EventArgs e) {

            try
            {
                listado.Add(new Alumno
                {
                    Nombre = "Miguel",
                    Edad = 32,
                    Alta = DateTime.Parse("5/12/2018"),
                    Comedor = true,
                    Turno = "Mañana"
                });
                dataGridView1.DataSource = listado;
            }catch(Exception E)
            {
                label6.Visible = true;
                label6.Text = E.ToString();
            }

            
        }

        private void label6_Click(object sender, EventArgs e){

        }
    }
}
