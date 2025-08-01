import java.util.Scanner;
class  limitEven{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the limit:");
        int limit=scan.nextInt();
        for( int i=2;i<=limit;i+=2){
            System.out.println(i);
        }
    }
}