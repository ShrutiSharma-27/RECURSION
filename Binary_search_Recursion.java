public class Binary_search_Recursion {
    public static void main(String[] args) {
        int[] test_arr = {1,2,3,4,55,66,78};
        int target1 = 67;
        int target2 = 66;
        System.out.println(BS(test_arr, target1, 0, test_arr.length-1));
        System.out.println(BS(test_arr, target2, 0, test_arr.length-1));
    }

    static int BS (int [] arr, int target, int s, int e) {
        if (s>e) { //target not found
            return -1;
        }
        int mid = s+(e-s)/2 ;

        //3 checks that we've in binary search
        if (arr[mid]==target) return mid;
        else if (arr[mid]>target) return BS(arr, target, s, mid-1);
        return BS(arr, target, mid+1, e);
    }
}
