import java.util.Scanner;

public class ArmstrongNumber
{
    //Ans 6: Input any 3 digit number and check if it is Armstrong number or not
    public static void main(String[] args)  //main method
    {
        // This programme is done with the help of Loop & Scanner Method.
        int num, number, temp, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 3 digit number: "); // Used need to define any three no(s).
        num=scanner.nextInt(); //this will read the entered value.
        scanner.close();
        number = num;
        for (; number!=0; number/=10) //Sorting out the elements
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }
        if (total == num)
        {
            System.out.println(num + " : is an Armstrong Number"); //This will tells you if provided no(s). is Armstrong
        }
        else
        {
            System.out.println(num + " : is not an Armstrong number"); ////This will tells you if provided no(s). is not Armstrong
        }
    }
}
