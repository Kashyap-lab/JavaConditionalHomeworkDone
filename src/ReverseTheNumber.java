import java.util.Scanner;

public class ReverseTheNumber
{
    //Ans:5 input any five digit number and then reverse the number
    public static void main(String[] args)  //main method
    {
        int num = 0;
        int reversenum = 0;
        System.out.println("Input your number and press enter :");

        Scanner in = new Scanner(System.in);  //this statement will capture  the user input

        num = in.nextInt();  //captured input would be stored in number num
        while (num != 0)//while loop :logic to find out reverse number
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }
        System.out.println(" Reverse of the number input is  : " + reversenum);
    }
}