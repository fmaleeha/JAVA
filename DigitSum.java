import java.util.Scanner;
class DigitSum{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=scan.nextInt();
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("sum of digit is:"+sum);
    }
}