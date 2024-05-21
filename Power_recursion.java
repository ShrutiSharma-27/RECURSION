import java.util.Scanner;

public class Power_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no : ");
        int number = input.nextInt();
        System.out.print("enter power : ");
        int pow = input.nextInt();
        System.out.println(power(number, pow));
    }

    public static int power(int x,int n){
        if (n==0) return 1;
        return x*power(x,n-1);
    }
}

// Output :

// enter no : 2
// enter power : 5
// 32
