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
    public partial class FParte3 : Form
    {
        public FParte3()
        {
            InitializeComponent();
        }

        private void FParte3_Load(object sender, EventArgs e)
        {
            timer1.Enabled = true;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if(progressBar1.Value == 0)
            {
                 Close();
            }
            else
            {
                progressBar1.Value--;
            }
            
        }

        private void progressBar1_Click(object sender, EventArgs e)
        {

        }
    }
}
