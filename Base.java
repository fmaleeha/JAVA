import java.util.Scanner;

class Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Convert to different bases
        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        String hex = Integer.toHexString(num);

        // Output
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " +hex);

        sc.close();
    }
}




