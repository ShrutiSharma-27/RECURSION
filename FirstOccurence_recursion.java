import java.util.Scanner;

public class FirstOccurence_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no of elements : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("enter element : ");
            arr[i] = input.nextInt();
        }

        System.out.print("which element's first index you want : ");
        int x = input.nextInt();

        System.out.println(firstIndex(arr,0, x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        //base case :
        if (idx==arr.length) return -1;

        if (arr[idx]==x) return idx;
        else {
            int fiisa = firstIndex(arr,idx+1,x); //fiisa - first index in smaller array
            return fiisa;
        }
    }
}

// Output :

// enter no of elements : 4
// enter element : 12
// enter element : 4
// enter element : 4
// enter element : 4
// which element's first index you want : 4
// 1
