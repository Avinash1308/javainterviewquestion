public class Main {
    public static void main(String[] args) {
        int n = 4; // number of rows
        int[][] arr = new int[n][n]; // create a 2D array to store the pattern
        
        // initialize variables for filling the array
        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;
        int num = 1;
        
        // loop to fill the array with numbers
        while (num <= n * n) {
            // fill the top row
            for (int i = leftCol; i <= rightCol; i++) {
                arr[topRow][i] = num;
                num++;
            }
            topRow++;
            
            // fill the right column
            for (int i = topRow; i <= bottomRow; i++) {
                arr[i][rightCol] = num;
                num++;
            }
            rightCol--;
            
            // fill the bottom row
            for (int i = rightCol; i >= leftCol; i--) {
                arr[bottomRow][i] = num;
                num++;
            }
            bottomRow--;
            
            // fill the left column
            for (int i = bottomRow; i >= topRow; i--) {
                arr[i][leftCol] = num;
                num++;
            }
            leftCol++;
        }
        
        // print the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
