import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your cash amount: ");

int cash = sc.nextInt();
if(cash < 10){ 
    System.out.println("you can't buy anything");}
    else if(cash == 10 && cash == 50){
        System.out.println("you can buy only one thing");
    }
    else { 
        System.out.println("you can buy everything");
}

    }
    
}
