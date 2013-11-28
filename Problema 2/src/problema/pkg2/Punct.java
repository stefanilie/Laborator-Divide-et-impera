/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg2;

import java.io.File;
import java.util.ArrayList;
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

            while(sc.hasNext())
            {
                String isRead = sc.next();
                Punct toAdd = new Punct(Integer.parseInt(isRead.split(",")[0]), Integer.parseInt(isRead.split(",")[1]));
                listPoints.add(toAdd);
            }
            _listPuncte = listPoints;
            
        }
        catch(Exception mori)
        {
            
        }
    }
}
