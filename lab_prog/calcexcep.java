//write a java program to design a simple calculator using switch statement,handle arithmetic exceptions
//where ever necessary

import java.util.Scanner;

class calcexcep{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      char c = sc.next().charAt(0);
      switch(c){
         case '+':   int k = a+b;
                     System.out.println("Addition="+k);
                     break;
         case '-':   k = a-b;
                     System.out.println("subtract="+k);
                     break;
         case '*':   k = a*b;
                     System.out.println("multiply="+a+b);
                     break;
         case '/': try{
                     k = a/b;
                     System.out.println("division="+k);
                  }catch(ArithmeticException e){
                     System.out.println("something is wrong");
                  }
   }
}}

