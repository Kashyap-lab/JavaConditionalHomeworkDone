import java.util.Scanner;

public class FibonacciNumber
{
    //Ans 8: Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
    public static void main(String[] args)  //main method
    {
    int n, first = 0,next = 1;
        // Using Scanner method & while loop
            System.out.println("Enter how may Fibonacci numbers to print"); // user will be asked how many fibonacci number they want
    Scanner scanner = new Scanner(System.in); //this will read the entered value
    n = scanner.nextInt();
            System.out.print("The first " + n + " Fibonacci numbers are: ");
            System.out.print(first + " " + next);
    int i = 1;
            while (i<n-1)  //sorting the element out
    {
        int sum = first + next;
        first = next;
        next = sum;
        System.out.print(" " + sum);  //This will display the Fibonacci no.s as shown
        i++;
    }
    }
}