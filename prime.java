import java.util.Scanner;
class prime{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=scan.nextInt();
        for(int i=2;i*i<=num;i++){
        if(num%i==0){
                System.out.println(num+" is not a prime number"); 
                return;
            }
        }
         System.out.println(num+" is a prime number");
    }


}