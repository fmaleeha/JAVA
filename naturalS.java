import java.util.Scanner;
class naturalS{
    public static void main(String args[]){
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("enter number limit:");
        int n=scan.nextInt();
        while(n>0){
            sum+=n;
            n--;
        
        }
        System.out.println("sum="+sum);

    }
}