using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Globalization;
using Forms.Idiomas;

namespace Forms
{
    public partial class pruebas : Form
    {
        public pruebas()
        {
            InitializeComponent();
        }

        private void pruebas_Load(object sender, EventArgs e)
        {
            
        }

        private void label1_Click(object sender, EventArgs e)
        {
            Thread.CurrentThread.CurrentUICulture = new CultureInfo("en-US");
            Text = Generico.Saludo;
        }
    }
}
