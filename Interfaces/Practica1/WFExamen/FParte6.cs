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
    public partial class FParte6 : Form
    {
        public FParte6()
        {
            InitializeComponent();
        }

        private void FParte6_Load(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }
        int cont = 0;

        List<Image> imagenes = new List<Image>
            {
                Resources.image,
                Resources.kisspng_royalty_free_clip_art_person_5ac6285375df15_9224565815229358914828,
                Resources.png_transparent_computer_icons_contact_monochrome_silhouette_internet_thumbnail
            };

        

        private void timer1_Tick(object sender, EventArgs e)
        {
            List<PictureBox> pictureboxList = new List<PictureBox>
            {
                pictureBox1,
                pictureBox2,
                pictureBox3
            };

            if (cont < imagenes.Count)
            {
                pictureboxList[cont].Image = imagenes[cont];
            }



            pictureBox1.Image = imagenes[cont];
            pictureBox2.Image = imagenes[cont];
            pictureBox3.Image = imagenes[cont];

            cont++;


        }
    }
}
