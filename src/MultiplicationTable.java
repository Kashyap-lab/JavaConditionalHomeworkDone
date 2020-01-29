import java.util.Scanner;

public class MultiplicationTable
{
    //Ans 7: multiplication table till n using do while loop (value of n will come through scanner class)
    public static void main(String[] args)  //main method
    {
        Scanner scanner = new Scanner(System.in);  // program is using scanner and do while method
        System.out.print("Enter the number for timetable want :- ");  // user will choose the preferred Times Table
        int a = scanner.nextInt();
        System.out.print("Enter the ending number for timetable :- ");   // user will be asked for end no. for it's timetable
        int b = scanner.nextInt();
        int i = 1;
        do
        {
            System.out.println(+a + "x" + i + "=" + a * i);  // display the chosen digit's time table
            i++;
        }
        while(i <= b);
    }
}
