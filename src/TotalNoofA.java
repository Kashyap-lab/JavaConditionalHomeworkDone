import java.util.Scanner;

    public class TotalNoofA
{
    // Ans 9: enter any String and count total number of 'a' in that String.
    public static void main(String[] args) // main method
    {
        String str = " ";
        int count =0;
        Scanner scanner=new Scanner(System.in);
        System.out.print( "Enter any sentence :-"); //will ask user to enter any sentence
        str=scanner.nextLine(); //count the string character
        for (int i = 0; i <str.length() ; ++i) //method to find specific string
        {
            switch (str.charAt(i))
            {
                case 'a':
                case 'A':
                    count++;
            }
        }
        System.out.println( "The total number of 'A' in the string are :"+ count);//this will count the total no's of 'A'
    }
}
