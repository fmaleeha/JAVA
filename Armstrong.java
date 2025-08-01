import java.util.Scanner;
class Armstrong{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=scan.nextInt();
        int og=num;
        int sum=0;
        int digit;
        while(num>0){
            digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if(sum==og){
            System.out.println(og+" is armstrong");
        }else{
            System.out.println(og+" not amstrong");
        }
    }
}