import java.util.Scanner;

public class ValuesOfArray
{
    // Ans 2.: program to sum values of an array
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];// codes for integer value
        int sum = 0;// codes for integer sum
        System.out.println("Enter the value of Array :"); //code for output result
        for (int i=0; i<10; i++) // code for functionality
        {
            array[i] = scanner.nextInt();
        }
        for( int num : array)
        {
            sum = sum+num; //codes for sum value result
        }
        System.out.println("Sum value of an Array is:"+sum); //This will give the sum values of an Array.
    }
}
