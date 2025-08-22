import java.util.Scanner;
import java.util.Arrays;
class ArrayOperation{

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=scan.nextInt();
        int[] a=new int[n];
        System.out.println("enter array elments:");
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();

        }
        int min=a[0];
        int max=a[0];
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];

            }
            if(a[i]>max){
                max=a[i];
            }
            sum+=a[i];

        }
        System.out.println("smallest:"+min);
        System.out.println("largest:"+max);
        System.out.println("sum:"+sum);
        System.out.print("original array:");
           for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
           } 
           System.out.println();  
        Arrays.sort(a);
            System.out.print("sorted array:");
         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        scan.close();
    }
}