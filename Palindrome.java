import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=scan.nextInt();
        int og=num;
        int reverse=0;
        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num/=10;

        }
        if(og==reverse){
            System.out.println(og+" is palindrome");
        }else{
            System.out.println(og+" is not palindrome");
        }
    }

}