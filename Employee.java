import java.util.Scanner;
class Employee{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter name:");
        String name=scan.nextLine();
        System.out.print("enter age:");
        int age=scan.nextInt();
        System.out.print("enter salary:");
        double salary=scan.nextDouble();
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("salary:"+salary);
    }
}