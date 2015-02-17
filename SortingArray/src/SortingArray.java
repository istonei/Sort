import java.util.Scanner;
public class SortingArray
{
public static void main(String args[])
    {
		Scanner keyboard = new Scanner(System.in);
        int numbers[]=new int[6];
        int arranged[]=new int[6];
        int n;
        int option;

        //receive input
        System.out.println("Enter 6 integers: ");
        for (int i=0;i<numbers.length;i++)
        {
            System.out.print(" ");
            numbers[i] = keyboard.nextInt();
        }
        System.out.println();

        //sorting array algorithm
        for(int j=0;j<numbers.length;j++)
        {
            n=0;
            for(int r=0;r<numbers.length;r++)
            {
                if(numbers[j]>numbers[r])
                {
                    n++;
                }
            }
            while (arranged[n] == numbers[j]) n++;
            arranged[n]=numbers[j];
        }

        //ask for ascending or descending order
        System.out.print("Enter 0 for ascending order or enter 1 for descending order: ");
        option = keyboard.nextInt();

        //output order user chose
        if(option == 0)
        {
            for(n=0;n<arranged.length;n++)
            {
                System.out.print(arranged[n]+" ");
            }
        }
        else if(option == 1)
        {
            for(n=5;n>-1;n--)
            {
                System.out.print(arranged[n]+" ");
            }
        }
    }
}