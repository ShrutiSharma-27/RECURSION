import java.util.Scanner;

public class TowerOfHanoi_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no. of disks : ");
        int n = input.nextInt();
        System.out.print("enter tower1 id : ");
        int t1 = input.nextInt();
        System.out.print("enter tower2 id : ");
        int t2 = input.nextInt();
        System.out.print("enter tower3 id : ");
        int t3 = input.nextInt();

        toh(n, t1,t2,t3);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if (n==0) return ;

        toh(n-1, t1id, t3id, t2id);
        System.out.println(n+"["+t1id+" -> "+t2id+"]");
        toh(n-1, t3id, t2id, t1id);
    }
}
