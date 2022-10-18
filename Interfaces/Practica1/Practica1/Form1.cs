using Practica1.Properties;
using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Windows.Forms.VisualStyles;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace Practica1
{
    public partial class Form1 : Form
    {
        int cont = 55;
        int cont2 = 0;
        int cont3 = 0;
        Random aleatorio = new Random();

        int numRandom = 0;
        int numRandom2 = 0;

        int randomAnterior = 0;


        Boolean exit = false;

        int pareja1 = 0;
        int pareja2 = 0;
        int pareja3 = 0;
        int pareja4 = 0;
        int pareja5 = 0;
        int pareja6 = 0;

        int[] orden = new int[6];
        int[] randomList = new int[6];

        int[] randomList2 = new int[12];


        PictureBox[] imagenes = new PictureBox[13];

        public Form1()
        {
            InitializeComponent();
        }

        private void pictureBox8_Click(object sender, EventArgs e)
        {

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
        }
        private void Form1_Load(object sender, EventArgs e)
        {

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


            for (int i=0; i<orden.Length; i++)
            {
                orden[i] = i;
            }



            for (int i=0; i<6; i++)
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
                        pareja1 = orden[i];
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                imagenes[numRandom2].Image = Resources.laura_cara_sf;
                                randomList2[cont3] = numRandom2;
                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 !=2);
                        cont2 = 0;
                        break;
                    case 2:
                        pareja1 = orden[i];
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                imagenes[numRandom2].Image = Resources.manolo_cara_sf;
                                randomList2[cont3] = numRandom2;
                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 !=2);
                        cont2 = 0;
                        break;
                    case 3:
                        pareja1 = orden[i];
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                imagenes[numRandom2].Image = Resources.nelson_cara_sf;
                                randomList2[cont3] = numRandom2;
                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 != 2);
                        cont2 = 0;
                        break;
                    case 4:
                        pareja1 = orden[i];
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                imagenes[numRandom2].Image = Resources.oscar_cara_sf;
                                randomList2[cont3] = numRandom2;
                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 != 2);
                        cont2 = 0;
                        break;
                    case 5:
                        pareja1 = orden[i];
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                imagenes[numRandom2].Image = Resources.uxi_cara_sf;
                                randomList2[cont3] = numRandom2;
                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 != 2);
                        cont2 = 0;
                        break;
                    case 6:
                        pareja1 = orden[i];
                        do
                        {
                            numRandom2 = aleatorio.Next(1, 13);
                            if (!randomList2.Contains(numRandom2))
                            {
                                imagenes[numRandom2].Image = Resources.laurita_cara_sf;
                                randomList2[cont3] = numRandom2;
                                cont2++;
                                cont3++;

                            }


                        } while (!randomList2.Contains(numRandom2) || cont2 != 2);
                        cont2 = 0;
                        break;
                }


            }





            /*
            for(int i=0; i<6; i++)
            {
                numRandom = aleatorio.Next(1, 6);


            }
            
            for (int i=0; i<13; i++)
            {
                
                switch (numRandom)
                {
                    case 1:
                        imagenes[i].Image = Resources.laura_cara_sf;
                        break;
                    case 2:
                        imagenes[i].Image = Resources.laurita_cara_sf;
                        break;
                    case 3:
                        imagenes[i].Image = Resources.manolo_cara_sf;
                        break;
                    case 4:
                        imagenes[i].Image = Resources.nelson_cara_sf;
                        break;
                    case 5:
                        imagenes[i].Image = Resources.uxi_cara_sf;
                        break;
                    case 6:
                        imagenes[i].Image = Resources.oscar_cara_sf;
                        break;

                    default:
                        imagenes[i].Image = Resources.image;
                        break;
                }

            }
            */


        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if(cont >= 0)
            {
                label1.Text = cont.ToString();
                cont--;
            }
            else
            {
                timer1.Enabled = false;
                label1.Text = "0";
                MessageBox.Show("FIN DEL JUEGO, ",
             "Game Over",
             MessageBoxButtons.OKCancel,
             MessageBoxIcon.Information
             );


            }
        }
        

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox4_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox5_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox6_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox7_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox8_Click_1(object sender, EventArgs e)
        {

        }

        private void pictureBox9_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox10_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox11_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox12_Click(object sender, EventArgs e)
        {

        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

    }

}
