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
using WinFormsEX.Idiomas;

namespace WinFormsEX
{
    public partial class FParte4 : Form
    {
        public FParte4()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            Thread.CurrentThread.CurrentUICulture = new CultureInfo("es-ES");

            checkBox2.Checked = false;

        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            Thread.CurrentThread.CurrentUICulture = new CultureInfo("en-US");

            checkBox1.Checked = false;

        }

        private void checkBox1_Validating(object sender, CancelEventArgs e)
        {
            button1.Text = generico.botonAcceder;
            checkBox1.Text = generico.castellano;
            checkBox2.Text = generico.ingles;
        }
    }
}
