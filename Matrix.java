import java.util.Scanner;

class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

       
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

      
        if (rows == cols) {
            int trace = 0;
            for (int i = 0; i < rows; i++) {
                trace += a[i][i];
            }
            System.out.println("\nTrace = " + trace);
        } else {
            System.out.println("\nTrace not possible (matrix not square)");
        }

       
        System.out.println("\nTranspose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}




