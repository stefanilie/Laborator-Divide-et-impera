import java.util.*;
import java.io.*;

class Inversiune
{
	static int nArrayLimit;
	static int[] array;

	public static void init()
	{
		array = new int[nArrayLimit];
		System.out.print("\nAm initializat array-ul, cu " + 
			nArrayLimit + " campuri!");
	}

	public static void main(String[] args)
	{
		try
		{
			File file = new File("intrare.txt");
			Scanner sc = new Scanner(file);
			nArrayLimit = sc.nextInt();
			init();
			int i = 0;
			while(sc.hasNextInt() && i<nArrayLimit)
			{
				array[i] = sc.nextInt();
				i++;
			}
			if(sc.hasNextInt() && i>=nArrayLimit)
			{
				throw new Exception("\nFisier intrare gresit!\n"+
				 	"Elemente in plus, necitite!\n");
			}

			System.out.print("\nArray-ul dupa citire:{");
			for(i=0; i<nArrayLimit; i++)
			{
				System.out.print(array[i] + " ");
			}
			System.out.print("}");
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