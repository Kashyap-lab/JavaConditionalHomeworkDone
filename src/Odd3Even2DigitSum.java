import java.util.Scanner;

public class Odd3Even2DigitSum
{
    // Ans 4: input any five digit number then count total no of odd and even digit and find sum of them
    public static void main(String[] args) //main method
    {
        int n, sumE = 0, sumO = 0;
        Scanner scanner =new Scanner(System.in);  // total for even and odd number array using scanner method
        System.out.print("Enter the number for total digit (array).: ");   // user will be asked  number for array
        n = scanner.nextInt();      // reads user input value
        int []a = new int[n];       // integer array object
        System.out.println("Enter the number(s).:");   //number sorted in an array
        for (int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++)         //sorting the element
        {
            if (a[i] % 2 == 0)
            {
                sumE = sumE + a[i];     // '+' of even number
            } else
            {
                sumO = sumO + a[i];     // '+' of odd number
            }
        }
        System.out.println("Sum of Even Numbers:" + sumE);  // This will display total of even numbers
        System.out.println("Sum of Odd Numbers:" + sumO);   // This will display total of odd numbers
    }
}
