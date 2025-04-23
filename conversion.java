/*public class conversion {
    public static void  main(String[] args){
        short s= 7;
        byte b = (byte) s;
        System.out.println(b);


       int a = s;
       System.out.println(a);

        char c = (char)s;
        System.out.print(c);


        //3. Convert an int to float and print both
        int i=20;
        float e = (float)i;
        System.out.println(e);

    }
    
}*/
import java.util.Scanner;

public class switch {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter a first number");
      int var2 = var1.nextInt();
      System.out.println("Enter a second number");
      int var3 = var1.nextInt();
      System.out.println("Enter your operators value");
      char var4 = var1.next().charAt(0);
      switch(var4) {
      case '*':
         System.out.println(var2 * var3);
         break;
      case '+':
         System.out.println(var2 + var3);
      case ',':
      case '.':
      default:
         break;
      case '-':
         System.out.println(var2 - var3);
         break;
      case '/':
         System.out.println(var2 / var3);
      }

   }
}


