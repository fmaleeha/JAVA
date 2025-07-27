import java.util.Scanner;
class PosNegZero{

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=scan.nextInt();
        if(num==0){
            System.out.println("zero");
        }else if(num<0){
            System.out.println("-ve");
           
        } else{
            System.out.println("+ve");
        }
    } 
}