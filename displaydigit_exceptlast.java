import java.util.Arrays; // Import the Arrays class

public class Main {
  public static void main(String[] arg) {
    int num = 153; // Initialize the variable num to 153
    int last_digit = num % 10; // Extract the last digit of num (i.e., 3)
    int temp = num; // Create a temporary variable temp and set it equal to num
    String num1 = Integer.toString(num); // Convert num to a string
    int len = num1.length() - 1; // Determine the length of the digit array (i.e., 2)
    int[] digit_arr = new int[len]; // Create an array to store the digits of num (excluding the last digit)
    int i=len-1;                    // counter variable
    while (temp > 0) { // Loop through the digits of num
      int digit = temp % 10; // Extract the current digit
      if (digit != last_digit) { // Check if the current digit is not the last digit
        
          digit_arr[i] = digit;
          i--;
       
      }
      temp /= 10; // Remove the current digit from temp
    }
    
    System.out.print(Arrays.toString(digit_arr)); // Print the digit array
  }
}
// output --> [1,5]
// 
