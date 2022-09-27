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
    public partial class Ejercicio4 : Form
    {
        public Ejercicio4()
        {
            InitializeComponent();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if(listBox1.SelectedItem == "Pop1")
            {
                wplayer.URL = "C:\\Users\\FP\\Desktop\\Github\\MiguelAngelSC\\Interfaces\\Ejercicios Widnows Forms\\Forms\\Musica\\sfx-pop1.mp3";
                wplayer.controls.play();
                wplayer.controls.stop();
                wplayer.controls.pause();

                wplayer.URL = "C:\\Users\\FP\\Desktop\\Github\\MiguelAngelSC\\Interfaces\\Ejercicios Widnows Forms\\Forms\\Musica\\sfx-pop2.mp3";
                wplayer.controls.play();
                wplayer.controls.stop();
                wplayer.controls.pause();

            }else if(listBox1.SelectedItem == "Metal")
            {
                wplayer.URL = "C:\\Users\\FP\\Desktop\\Github\\MiguelAngelSC\\Interfaces\\Ejercicios Widnows Forms\\Forms\\Musica\\sfx-metal1.mp3";
                wplayer.controls.play();
                wplayer.controls.stop();
                wplayer.controls.pause();

                wplayer.URL = "C:\\Users\\FP\\Desktop\\Github\\MiguelAngelSC\\Interfaces\\Ejercicios Widnows Forms\\Forms\\Musica\\sfx-metal2.mp3";
                wplayer.controls.play();
                wplayer.controls.stop();
                wplayer.controls.pause();

            }else if( listBox1.SelectedItem == "Piano")
            {
                wplayer.URL = "C:\\Users\\FP\\Desktop\\Github\\MiguelAngelSC\\Interfaces\\Ejercicios Widnows Forms\\Forms\\Musica\\sfx-piano-arpeggio.mp3";
                wplayer.controls.play();
                wplayer.controls.stop();
                wplayer.controls.pause();

                wplayer.URL = "C:\\Users\\FP\\Desktop\\Github\\MiguelAngelSC\\Interfaces\\Ejercicios Widnows Forms\\Forms\\Musica\\sfx-piano-bar.mp3";
                wplayer.controls.play();
                wplayer.controls.stop();
                wplayer.controls.pause();

            }
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (comboBox1.SelectedItem == "Pop")
            {
                listBox1.Items.Add("Pop1");
                listBox1.Items.Add("Pop2");

            }
            else if (comboBox1.SelectedItem == "Clásica")
            {
                listBox1.Items.Add("Metal1");
                listBox1.Items.Add("Metal2");

            }
            else if(comboBox1.SelectedItem == "Electrónica")
            {
                listBox1.Items.Add("Piano1");
                listBox1.Items.Add("Piano2");

            }
        }
    }
}
