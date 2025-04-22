import java.util.Scanner;
class array {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter arr value");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        } int sum =0;
        for(int j=0;j<arr.length;j++){
           // System.out.print(arr[j]);
            sum+=arr[j];
            
        }
        
        
    }
}
