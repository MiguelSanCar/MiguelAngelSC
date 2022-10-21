using Practica1.Properties;
using System;
using System.Collections;
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
using System.Windows.Forms.VisualStyles;
using static System.Net.Mime.MediaTypeNames;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;
using Image = System.Drawing.Image;
using Practica1.Idiomas;


namespace Practica1
{
    public partial class Form1 : Form
    {
        Image laura;
        Image laurita;
        Image oscar;
        Image uxia;
        Image manolo;
        Image nelson;

        //al dar click ene l boton se pondra en true
        Boolean start = false;

        //contadores
        int cont = 55;
        int cont2 = 0;
        int cont3 = 0;
        //funcion aleatorio
        Random aleatorio = new Random();

        //numeros aleatorios
        int numRandom = 0;
        int numRandom2 = 0;

        //variables para comprobarParejas
        int contTag = 0;
        Object tagAnterior = 0;
        List<PictureBox> pictureboxList = new List<PictureBox>();

        //comprobar la salida del bucle
        Boolean exit = false;

        //variables para load
        int[] orden = new int[6];
        int[] randomList = new int[6];

        int[] randomList2 = new int[12];

        //arraylist para guardar los picturebox y meterle imagenes mas adelante
        PictureBox[] imagenes = new PictureBox[13];

        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            switch (comboBox1.Text)
            {
                case "Medio":
                    cont = 40;
                    break;
                case "Dificil":
                    cont = 25;
                    break;
                case "Insane":
                    cont = 10;
                    break;
                default:
                    cont = 55;
                    break;
            }
            label1.Text = cont.ToString();
            timer1.Start();
            label1.Enabled = true;
            label1.Visible = true;
            start = true;
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            laura = Resources.laura_cara_sf;
            laurita = Resources.laurita_cara_sf;
            uxia = Resources.uxi_cara_sf;
            nelson = Resources.nelson_cara_sf;
            oscar = Resources.oscar_cara_sf;
            manolo = Resources.manolo_cara_sf;


            imagenes[1] = pictureBox1;
            imagenes[2] = pictureBox2;
            imagenes[3] = pictureBox3;
            imagenes[4] = pictureBox4;
            imagenes[5] = pictureBox5;
            imagenes[6] = pictureBox6;
            imagenes[7] = pictureBox7;
            imagenes[8] = pictureBox8;
            imagenes[9] = pictureBox9;
            imagenes[10] = pictureBox10;
            imagenes[11] = pictureBox11;
            imagenes[12] = pictureBox12;


            for (int i = 0; i < orden.Length; i++)
            {
                orden[i] = i;
            }



            for (int i = 0; i < 6; i++)
            {


                do
                {
                    numRandom = aleatorio.Next(1, 7);
                    if (!randomList.Contains(numRandom))
                    {
                        randomList[i] = numRandom;
                        exit = true;

                    }

                } while (!exit);
                exit = false;

                switch (numRandom)
                {
                    case 1:
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                randomList2[cont3] = numRandom2;
                                imagenes[numRandom2].Tag = numRandom;
                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 != 2);
                        cont2 = 0;
                        break;
                    case 2:
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                randomList2[cont3] = numRandom2;
                                imagenes[numRandom2].Tag = numRandom;


                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 != 2);
                        cont2 = 0;
                        break;
                    case 3:
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                randomList2[cont3] = numRandom2;
                                imagenes[numRandom2].Tag = numRandom;

                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 != 2);
                        cont2 = 0;
                        break;
                    case 4:
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                randomList2[cont3] = numRandom2;
                                imagenes[numRandom2].Tag = numRandom;

                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 != 2);
                        cont2 = 0;
                        break;
                    case 5:
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                randomList2[cont3] = numRandom2;
                                imagenes[numRandom2].Tag = numRandom;

                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 != 2);
                        cont2 = 0;
                        break;
                    case 6:
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                randomList2[cont3] = numRandom2;
                                imagenes[numRandom2].Tag = numRandom;

                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 != 2);
                        cont2 = 0;
                        break;
                }
                for (int z=1; z<imagenes.Count(); z++) {
                    {
                        imagenes[z].BackgroundImage = null;

                    }

                }



            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if (cont >= 0)
            {
                label1.Text = cont.ToString();
                cont--;
            }
            else
            {
                timer1.Enabled = false;
                label1.Text = "0";
                MessageBox.Show(generico.end,
             "Game Over",
             MessageBoxButtons.OKCancel,
             MessageBoxIcon.Information
             );


            }
        }


        private void pictureBox1_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox1);
                pictureboxList.Add(pictureBox1);
                comprobarParejas(pictureBox1);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }

        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox2);
                pictureboxList.Add(pictureBox2);
                comprobarParejas(pictureBox2);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }


        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox3);
                pictureboxList.Add(pictureBox3);
                comprobarParejas(pictureBox3);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }



        }

        private void pictureBox4_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox4);
                pictureboxList.Add(pictureBox4);
                comprobarParejas(pictureBox4);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }


        }

        private void pictureBox5_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox5);
                pictureboxList.Add(pictureBox5);
                comprobarParejas(pictureBox5);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }


        }

        private void pictureBox6_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox6);
                pictureboxList.Add(pictureBox6);
                comprobarParejas(pictureBox6);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }


        }

        private void pictureBox7_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox7);
                pictureboxList.Add(pictureBox7);
                comprobarParejas(pictureBox7);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }


        }

        private void pictureBox8_Click_1(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox8);
                pictureboxList.Add(pictureBox8);
                comprobarParejas(pictureBox8);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }


        }

        private void pictureBox9_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox9);
                pictureboxList.Add(pictureBox9);
                comprobarParejas(pictureBox9);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }


        }

        private void pictureBox10_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox10);
                pictureboxList.Add(pictureBox10);
                comprobarParejas(pictureBox10);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }



        }

        private void pictureBox11_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox11);
                pictureboxList.Add(pictureBox11);
                comprobarParejas(pictureBox11);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }



        }

        private void pictureBox12_Click(object sender, EventArgs e)
        {
            if (start == true)
            {
                asignarImagen(pictureBox12);
                pictureboxList.Add(pictureBox12);
                comprobarParejas(pictureBox12);
            }
            else
            {
                MessageBox.Show(generico.error1,
                "ERROR",
                MessageBoxButtons.OKCancel,
                MessageBoxIcon.Information);

            }



        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }
        private void asignarImagen(PictureBox picturebox)
        {
            switch (picturebox.Tag)
            {
                case 1:
                    picturebox.Image = laura;
                    break;
                case 2:
                    picturebox.Image = laurita;

                    break;
                case 3:
                    picturebox.Image = nelson;

                    break;
                case 4:
                    picturebox.Image = oscar;

                    break;
                case 5:
                    picturebox.Image = manolo;

                    break;
                case 6:
                    picturebox.Image = uxia;

                    break;
            }

        }

        private void comprobarParejas(PictureBox picturebox)
        {
            if (pictureboxList.Count() != 1)
            {
                if (pictureboxList[0].Image != pictureboxList[1].Image)
                    { 
                    foreach (PictureBox pictureboxActual in pictureboxList)
                    {
                        pictureboxActual.Image = Resources.image1;
                    }
                }
                pictureboxList.Clear();

            }

        }

        private void devolverDefault(PictureBox picturebox)
        {
            picturebox.Image = Resources.image1;
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (comboBox1.SelectedIndex == 0)
            {
                Thread.CurrentThread.CurrentUICulture = new CultureInfo("es-ES");
            }
            else
            {
                Thread.CurrentThread.CurrentUICulture = new CultureInfo("en-US");

            }
        }

        private void label3_Click(object sender, EventArgs e)
        {
            label3.Text = generico.idioma;
        }
    }
}


