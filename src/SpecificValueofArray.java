import java.util.Scanner;

public class SpecificValueofArray
{
    // Ans 3.: program to test if an array contains a specific value
        public static void main(String[] args) // main method
    {
        int[] arraynumbers = {1}; //Assigned value of Array
        Scanner sc = new Scanner(System.in);  //calling scanner method
        System.out.println("Enter a value"); //This will ask user to type the value
        int num = sc.nextInt();
        for (int x = 0; x < arraynumbers.length; x++)
        {
         if (arraynumbers[x] == num)
         {
             System.out.println("Value exists in array!"); // will print the entered value is exist in array
         }
         else
         {
             System.out.println("Value doesn't exists in array!");  // will print the entered value is not exist in array
         }
        }
    }
}
