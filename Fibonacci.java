import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=scan.nextInt();
        int first=0;
        int second=1;
        System.out.println("fibonacci series up to " +num+ " numbers:");
        for(int i=0;i<num;i++){
            System.out.println(first+" ");
            int sum= first+second;
            first=second;
            second=sum;
        }
        scan.close();
        
    }
}