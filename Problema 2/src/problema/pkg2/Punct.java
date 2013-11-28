/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Ilie
 */
public class Punct 
{
    int _x;
    int _y;
   public static ArrayList<Punct> _listPuncte = null;
    
    public Punct()
    {
        this._x = 0;
        this._y = 0;
    }
    
    public Punct(int x, int y)
    {
        this._x = x;
        this._y = y;
    }
    
    public void print()
    {
        System.out.println("("+this._x+","+ this._y + ")");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     
        File moloz = new File("puncte.txt");
        try
        {
            ArrayList<Punct> listPoints = new ArrayList<Punct>();
            Scanner sc = new Scanner(moloz);
            Punct p1 = new Punct(sc.nextInt(), sc.nextInt());
            Punct p2 = new Punct(sc.nextInt(), sc.nextInt());
            Punct p3 = new Punct(sc.nextInt(), sc.nextInt());
            Punct p4 = new Punct(sc.nextInt(), sc.nextInt());
            int nMaxX = 0;
            int nMaxY = 0;
            int nArray = 0;

            while(sc.hasNext())
            {
                String isRead = sc.next();
                Punct toAdd = new Punct(Integer.parseInt(isRead.split(",")[0]), Integer.parseInt(isRead.split(",")[1]));
                listPoints.add(toAdd);
            }
            for(Punct parser : listPoints)
            {
               if(nMaxX < parser._x)
               {
                   nMaxX = parser._x;
               }
               if(nMaxY < parser._y)
               {
                   nMaxY = parser._y;
               }
            }
            double half = (p1._x + p2._x)/2;
            if(nMaxX > half)
            {
                nMaxX = p2._x - nMaxX;
            }
            else if(nMaxX < half)
            {
                nMaxX = nMaxX - p1._x;
            }
            
            half = (p3._y + p4._y) / 2;
            if(nMaxY > half)
            {
                nMaxY = p2._x - nMaxX;
            }
            else if(nMaxX < (p1._x + p2._x)/2)
            {
                nMaxX = nMaxX - p1._x;
            }
            
            
        }
        catch(Exception mori)
        {
            
        }
    }
}
