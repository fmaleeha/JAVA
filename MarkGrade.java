import java.util.Scanner;
class MarkGrade{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the score:");
        int score=scan.nextInt();
        if(score>=90&&score<=100){
            System.out.println("A");
        }if(score>=75&&score<=89){
            System.out.println("B");
        }if(score>=60&&score<=74){
            System.out.println("C");
        }if(score>=50&&score<=59){
            System.out.println("D");
        }if(score<=50){
            System.out.println("failed!");
        }
    }
}