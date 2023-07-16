//Recursion :
//* Calling one function by another function (Repetitions).
//* all the function calls that happen in a programming language will go to the STACK memory.
//* while the function is not finished executing and is ongoing then it'll remain in the stack.
//* main function is the function that goes first into the stack and comes out at the last from the stack.
//* when a function has finished it's execution then it is removed from the stack and flow of program is restored to where that function was called.

//* why are you having different functions with same definition? what if you want to print the numbers 1 lakh times?
//* so the solution is that the function should call itself.

public class Print_numbers {
    public static void main(String[] args) {
        //print n numbers
        //suppose n=5 so 1,2,3,4,5 will get printed
        print1(1);
    }
    //body and function definition of every function below is same
    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(2);
    }
    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }
    static void print5(int n) {
        System.out.println(n);
    }
}

//Output :

// 1
// 2
// 3
// 4
// 5
