//Input1 - 1
//Output1 - 1 1 1
//
//Input2 - 2
//Output2 - 2 1 1 1 2 1 1 1 2
//
//Input2 - 3
//Output3 - 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

import java.util.Scanner;

public class PrintZigZag_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no : ");
        int number = input.nextInt();
        pzz(number);
    }

    public static void pzz(int n){
        if (n==0) return;

        System.out.println(n); //pre region
        pzz(n-1);           //left call
        System.out.println(n); //in region
        pzz(n-1);           //right call
        System.out.println(n); //post region
    }
}
