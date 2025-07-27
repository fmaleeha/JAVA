import java.util.Scanner;
class Calculator{
    public static void main(String args[]){
        int n1,n2,result;
        char oprtr;
        Scanner scan=new Scanner(System.in);
         System.out.print("enter first number:");
        n1=scan.nextInt();
        System.out.print("enter a operator(+,-,*,/):");
        oprtr=scan.next().charAt(0);
         System.out.print("enter second number:");
         n2=scan.nextInt();
         
         switch(oprtr){
            case'+':
            result=n1+n2;
            System.out.println(n1+"+"+n2+"="+result);
            break;
             case'-':
            result=n1-n2;
            System.out.println(n1+"-"+n2+"="+result);
            break;
             case'*':
            result=n1+n2;
            System.out.println(n1+"*"+n2+"="+result);
            break;
             case'/':
            result=n1/n2;
            System.out.println(n1+"/"+n2+"="+result);
            break;
            default:
            System.out.println("invalid operator");
         }
        
    }
}