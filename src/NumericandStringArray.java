import java.util.Arrays;
public class NumericandStringArray
{
    //Ans1: program to sort a numeric array and a String array
    public static void main(String[] args)  //Main Method
    {
     int[] arraydata1 = {9,3,2,8,15,7,1,6,12}; // Array contains no's.
     String[] arraydata2= {"Ferrari", "Buggati", "Mercedes", "AMG", "Rolls Royce", "Impala"}; // Array contains string
     System.out.println("Numeric array:" + Arrays.toString(arraydata1)); //method to call all number
     Arrays.sort(arraydata1);                                            //method to ascending numbers
     System.out.println("Sort Number: "+Arrays.toString(arraydata1));
     System.out.println("Random Name:"+ Arrays.toString(arraydata2));
     Arrays.sort(arraydata2);                                            //method to ascending string
     System.out.println("Sorted Name: " + Arrays.toString(arraydata2));
    }
}
