import java.util.Scanner;
class Triangle{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enetr the 3 sides of the triangle:");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        if(a+b>c&&a+c>b&&b+c>a){
            if(a==b&&b==c){
                System.out.println(" the triangle is equilatoral:");

            }else if(a==b||b==c||a==c){
                System.out.println("the triangle is isosceles:");
            }else{
                System.out.println("the triangle is scalene:");
            }
            double s=(a+b+c)/2;
            double area=Math.sqrt(s *(s-a)*(s-b)*(s-c));
            System.out.println("area of the triangle:"+area);
        }else{
            System.out.println("its not valid");
        }
         scanner.close();
    }
}