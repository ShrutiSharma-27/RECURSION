import java.util.Scanner;

public class Power_lognTC_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no : ");
        int number = input.nextInt();
        System.out.print("enter power : ");
        int pow = input.nextInt();

        System.out.println(powerInLogTime(number,pow));
    }

    public static int powerInLogTime(int x, int n){
        if (n==1) return x;
        else if (n%2 == 0) return powerInLogTime(x,n/2) * powerInLogTime(x, n/2);
        else return x * powerInLogTime(x,n/2) * powerInLogTime(x, n/2);
    }
}
