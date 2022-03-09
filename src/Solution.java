public class Solution {
    public static void main(String[] args) {
        //boolean a = isPalindrome(1000001);
        //System.out.println(a);

        //int a = lengthOfLastWord("Helloo World Caaat222s");
        //System.out.println(a);

        //int a = mySqrt(15);
        //System.out.println(a);

        //int a = FizzBuzz(5);
        //System.out.println(a);

        //int a = Fibonacci(8);
        //System.out.println(a);

        //int a = WithOutDivMod(111,10);
        //System.out.println(a);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0){ //exclude negative numbers due the minus
            return false;
        }
        int number = x, reversed_number = 0;

        for(int n = number;n != 0; n /= 10) { //reverse number by last number in cycle
            int digit = n % 10;
            reversed_number = reversed_number * 10 + digit;
        }
        return reversed_number == x; // return and check palindrome


    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) { //go through the cycle
            for (int j = i + 1; j < nums.length; j++) { //go through the cycle +1
                if (nums[i] + nums[j] == target) { //comparison of the sum of numbers with the target
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public static int lengthOfLastWord(String s) {
        int length_last_word = 0;
        s = s.trim(); // delete spaces in start and int the end
        for(int t = s.length()-1; t >= 0; t--){ //go througt cycle from the end
            if (s.charAt(t) == ' '){ // if the character is equal to a space then break the cycle
                break;
            }
            else {
                length_last_word++; // else count +1
            }
        }
        return length_last_word;
    }
    public static int mySqrt(int x){
        double doubleValue = Math.sqrt(x); //use double for floating-point numbers and take sqrt
        return (int) doubleValue; // return intenger value
    }
    public static int FizzBuzz(int x){
        if (x % 15 == 0) { // here i dont know I need output only one word or all if fit for all the targets
            System.out.println("FIZZ-BUZZ");
        }
            else if (x % 5 == 0){
                System.out.println("BUZZ");
            }
            else if (x % 3 == 0){
            System.out.println("FIZZ");
        }
       return x;
    }
    public static int Fibonacci(int x){
        if(x == 0) //exclude 0
            return 0;
        else if(x == 1) //exclude 1
            return 1;
        else if (x < 0){
            System.out.println("a negative number");
            return -1;}
        else
            return Fibonacci(x - 1) + Fibonacci(x - 2); //count with recursion

    }
    public static int WithOutDivMod(int x, int y){
        int result_div = 0;
        for (int i = x; i >= y; i = i - y){
            result_div++;
        }
        System.out.println(result_div); // div
        return x - (result_div*y);//mod
    }
}

