import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=scan.nextInt();
        long factorial=1;
        int i=1;
        while(i<=num){
            factorial*=i;
            i++;
        }
        System.out.println("factorial of "+num+" is:"+factorial);
    }
}