public class RotationOfMatrix {
     
      public static int[][] rotateMatrix(int matrix[][]) {
          
        // transpose of Matrix 
        System.out.println("Transpose");

        transpose(matrix);
        printMatrix(matrix);

        // 2. swap between cols 
         swap(matrix); 

        return matrix;
      } 

      public static void transpose(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i< matrix.length; i++) {
            for(int j = i+1; j<n; j++) {
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }
      } 
        
      // Swaping the cols 
      public static void swap(int matrix[][]) {
        int n = matrix.length; 

        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j < n/2; j++) {
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp; 
            }
        }                            
    } 

    public static void printMatrix(int matrix[][]) {

        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            } 
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // So here we are going to rotate a matrix by 90 

        int matrix[][] = {{1,2,3}, 
                        {4,5,6}, 
                        {7,8,9} }; 

        System.out.println("Input");

        printMatrix(matrix);

         rotateMatrix(matrix);

         System.out.println("OutPut");

         printMatrix(matrix);
        
    }
}
