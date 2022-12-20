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
using static System.Windows.Forms.VisualStyles.VisualStyleElement.Button;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace WinFormsEX
{
    public partial class FParte2 : Form
    {

        //variable para la validacion de los errores
        int numero2 = 0;

        //variable para la validación de los datos, hasta que sea 2 no se considerarán completos
        int comprobar = 0;

        //lista de datos
        BindingList<Datos> listadoDatos = new BindingList<Datos>();






        public FParte2()
        {
            InitializeComponent();
        }

        private void textBox1_Validating(object sender, CancelEventArgs e)
        {
            //validar el primer textbox

            if (textBox1.Text.Length == 0)
            {
                errorProvider1.SetError(textBox1, "Este campo no puede esta vacío");
            }
            else
            {
                comprobar++;
            }
            if (textBox2.Text.Length == 0)
            {
                errorProvider2.SetError(textBox2, "Este campo no puede esta vacío");
            }
            else if (int.TryParse(textBox2.Text, out numero2) == true)
            {
                errorProvider2.SetError(textBox2, "Este campo no puede contener caracteres no numéricos");

            }
            else
            {
                comprobar++;
            }



        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_Validating(object sender, CancelEventArgs e)
        {
            if (textBox2.Text.Length == 0)
            {
                errorProvider2.SetError(textBox2, "Este campo no puede esta vacío");
            }
            else if (int.TryParse(textBox2.Text, out numero2) == true)
            {
                errorProvider2.SetError(textBox2, "Este campo no puede contener caracteres no numéricos");

            }
            else
            {
                comprobar++;
            }

            if (comprobar == 2)
            {
                Datos obj = new Datos
                {
                    Nombre = textBox1.Text,
                    Edad = Int32.Parse(textBox2.Text),
                };
                listadoDatos.Add(obj);

            }


            //validar el primer textbox
            if (textBox1.Text.Length == 0)
            {
                errorProvider1.SetError(textBox1, "Este campo no puede esta vacío");
            }
            else
            {
                comprobar++;
            }

            if (comprobar == 2)
            {
                Datos obj = new Datos
                {
                    Nombre = textBox1.Text,
                    Edad = Int32.Parse(textBox2.Text),
                };
                listadoDatos.Add(obj);

                errorProvider1.SetError(textBox1, "");
                errorProvider1.Clear();
                errorProvider2.Clear();

                textBox1.Text = "";
                textBox2.Text = "";


            }



        }

        private void textBox1_Validated(object sender, EventArgs e)
        {

        }

        private void textBox2_Validated(object sender, EventArgs e)
        {

        }

        private void FParte2_Load(object sender, EventArgs e)
        {
            dataGridView1.DataSource = listadoDatos;

        }
    }
}
