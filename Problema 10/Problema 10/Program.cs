using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problema_2
{
    class Punct 
    {
        int _x = 0;
        int _y;
        int nMaxArray;
        List<Punct> listPuncte = new List<Punct>();

        public Punct(int x, int y)
        {
            this._x = x;
            this._y = y;
        }

        public Punct()
        {
            this._x = 0;
            this._y = 0;
            this.listPuncte = null;
            this.nMaxArray = 0;
        }

        static void Main(string[] args)
        {

        }
    }
}
