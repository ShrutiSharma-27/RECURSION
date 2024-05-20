import java.util.Scanner;

public class Factorial_Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no : ");
        int number = input.nextInt();
        System.out.println(factorial(number));
    }

    public static int factorial(int n){
        if (n==1) return 1;
        else return n * factorial(n-1);
    }
}

// Output :

// enter no : 5
// 120
