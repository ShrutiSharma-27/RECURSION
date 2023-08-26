# RECURSION

1. What is recursion ?
* Function calling itself.

2. Why we need recursion ? (Use of recursion)
* It helps us in solving bigger/complex problems in a simple/easy way.
* You can convert the recursion solutions into iterations(not using any function calls, only loops) and vice-versa
  Tip : First solve complex problems using recursion then convert it into iteration to get a more optimised answer. Because
  directly solving using iterations is difficult that's why we use recursion.
* Space complexity isn't constant because of recursive calls.
* It helps us in breaking down bigger problems into smaller problems.

3. Visualising Recursion :

* Print_numbers_Recursion.java
* <img width="1379" alt="Screenshot 2023-07-16 at 7 18 53 PM" src="https://github.com/ShrutiSharma-27/RECURSION/assets/53565103/b72ddb6b-514f-48a6-b733-257a86938175">

4. How to identify if we can solve a problem using recursion ?
* If you're able to break the pronblem into smaller subproblems then yes.
* For example : Fibonacci(N) = Fibonacci(N-1) + Fibonacci(N-2) , 1 problem is broken down into 2 subproblems and those 2 can be further divided to another subproblems.
* Basically, above expression is called as recurrence relation (recursionn in a formula).
* Recursive tree for N=4 :
* <img width="1027" alt="Screenshot 2023-07-17 at 1 39 13 PM" src="https://github.com/ShrutiSharma-27/RECURSION/assets/53565103/1008b319-80dc-4e5e-bfcb-18c66ecc0a61">
* The base condition is represented by the answers we already have. In this case we already know that F(0) = 0 & F(1) = 1. This is base condition.

5. How to understand and approach a problem ?
* identify if you can break down problem into smaller problems.
* write the recurrence relation if needed.
* draw the recursive tree.
* about the tree :
  * see the flow of functions, how they're getting in stack
  * identify and focus on left tree calls and right tree calls
  * draw the tree and pointer again and again using pen and paper
  * use debugger to see the flow
* see how the values and what type of values (int, String, etc.) are returned at each step. see where the function call will come out. in the end you'll come out of the main function.

6. Working with variables in recursion :
* Variables :
  1. Arguments : whatever you put here will be used in next function call like in binary search we'll reduce the size of array and the reduced size of the array can be determined by start and end integer variables so they'll go for argument.
  2. Return type
  3. Body of function : the variable which is specific to body for each function call, for example mid in binary search. this mid value is not useful for the future function calls 
* To get a better understanding, we're solving binary search question using recursion. Binary search involves :
  * Comparing (whether mid is equal/smaller/greater than the target) -> O(1) 
  * Dividing-> dividing into 2 halves //problem can be broken down into smaller ones
  * Recurrence relation for this :

    F(N) = O(1) + F(N/2) , where F is a function for binary search and is applied to an array of size N
    
    O(1) is for 'Comparison'
    
    F(N/2) is for 'Dividing'

7. Types of recurrence relation :
   1. Linear Recurrence Relation | Example : Fibonacci Number (here search space N is not divided but it is being subtracted linearly by 1 and 2)
      * Very inefficient because a bigger N will get smaller in very large number of steps (slowly).
      * Let's consider F(50), fibonacci number at 50th position, but IntelliJ will not give the output beacuse of so many repeated function calls. You can see youself by drawing recursive tree for F(50).
      * The correct time complexity for above fibonacci number case is (Golden Ratio)^n = (1.618)^n | exponential | very bad
      * This problem can be solved by Dynamic Programming.
      * DP : if in the recursion calls, 2 or more recursion calls are doing the same work then don't compute it again and again.
      
   2. Divide and Conquer Recurrence Relation | Example : Binary Search (because search space N is reduced by a factor, here it is 2 otherwise it can be 3, 4, etc.)
      * Very efficient because a bigger N will get smaller in lesser number of steps as compared to linear.

8. TIP : Make sure to return the result of a function call of the return type

### High Level Thinking in Recursion :

Step 1 : Establish EXPECTATION.
Step 2 : Establish FAITH (that it'll work for the values smaller than the passed value). 
Step 3 : Link expectation and faith.
