// write ajava progra to input n integer values and store them in an array if the user wants to print an element of the array
//given an index ,if the index given by the user greatre than the array length generate array outof bound exceptiion and print valid message
//in the catch block
import java.util.Scanner;
class Excephand{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array:");
      int n = sc.nextInt();
      int [] arr = new int[n];
      System.out.println("Enter element of array:");

      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }
      System.out.println("Enter the index to print:");
      int c = sc.nextInt();
      try{
         System.out.println("element at index is:"+arr[c]);

      }catch(ArrayIndexOutOfBoundsException e){
         System.out.println(e);
      }
   }
}