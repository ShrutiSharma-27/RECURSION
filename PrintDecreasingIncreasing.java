import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no : ");
        int number = input.nextInt();
        printDI(number);
    }

    public static void printDI(int n){
        if (n==0) return;
        System.out.println(n);
        printDI(n-1);
        System.out.println(n);
    }
}
// Terminal -
// enter no : 5

// Output :

// 5
// 4
// 3
// 2
// 1
// 1
// 2
// 3
// 4
// 5
