import java.util.Scanner;

public class WordsandSpaceCount
{
    // Ans 10: enter any String and count how many total number of words and total number of spaces in that sentence
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence"); // user will be asked to enter any sentence
        String str = scanner.nextLine();          // reads user input value
        int word = 1;
        for (int i = 0; i < str.length(); i++)    // sorting  the elements
        {
            if (str.charAt(i)==' ')
                word++;
        }
        System.out.println("Number of words:" + word);          // This will display the no. of words in sentence(string)
        System.out.println("Number of space:" + (word-1));       // This will display the no. of spaces in sentence
    }
}
