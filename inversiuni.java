import java.util.*;
import java.io.*;

class Inversiune
{
	static int nArrayLimit;
	static int[] array;
	static int i, j, p;
	static HashMap<Integer, Integer> hashInv;

	public static void init()
	{
		array = new int[nArrayLimit];
		hashInv = new HashMap<Integer, Integer>();
		System.out.print("\nAm initializat array-ul, cu " + 
			nArrayLimit + " campuri!");
	}

	public static void divetimp(int x, int y)
	{
		if(x!=y)
		{
			System.out.print("\nAm intrat in divImp cu x=" + x +
		 		" si y="+ y);
		}
		if(x==y) return;
		int middle = (x+y)/2;
		i=x; j=middle+1; p=0;
		divetimp(x, middle);
		divetimp(j, y);
		while(i<middle || j<y)
		{
			if(array[i] > 2*array[j] && j<y || i>middle)
			{
				hashInv.put(array[i], array[j]);
				System.out.print("\nAm gasit si adaugat inversiunea"+
					array[i] + ">2*" +array[j]);
			}
		}
	}

	public static void printResults()
	{
		System.out.print("\n!\n!\n!Result:"+hashInv.toString()
			+"\n!\n!\n!");
	}

	public static void main(String[] args)
	{
		try
		{
			File file = new File("intrare.txt");
			Scanner sc = new Scanner(file);
			nArrayLimit = sc.nextInt();
			init();
		    i = 0;
			while(sc.hasNextInt() && i<nArrayLimit)
			{
				array[i] = sc.nextInt();
				i++;
			}

			divetimp(0, nArrayLimit);
			printResults();
		}
		catch (InputMismatchException e) 
  		{
 		   System.out.print(e.getMessage()); //try to find out specific reason.
		}
		catch(Exception e)
		{
			System.out.print("\nException: " + e);
		}
	}
}