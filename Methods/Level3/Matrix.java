
package level3;
import java.util.*;

public class Matrix {
	
	  public static void main(String[] args) {
	        double[][] matrix2x2 = generateMatrix(2, 2);
	        double[][] matrix3x3 = generateMatrix(3, 3);

	        displayMatrix(matrix2x2, "Random 2x2 Matrix");
	        displayMatrix(transpose(matrix2x2), "Transpose of 2x2 Matrix");
	        System.out.println("Determinant (2x2): " + determinant2x2(matrix2x2));
	        double[][] inv2x2 = inverse2x2(matrix2x2);
	        if (inv2x2 != null) displayMatrix(inv2x2, "Inverse of 2x2 Matrix");
	        else System.out.println("Matrix 2x2 is not invertible\n");

	        displayMatrix(matrix3x3, "Random 3x3 Matrix");
	        displayMatrix(transpose(matrix3x3), "Transpose of 3x3 Matrix");
	        System.out.println("Determinant (3x3): " + determinant3x3(matrix3x3));
	        double[][] inv3x3 = inverse3x3(matrix3x3);
	        if (inv3x3 != null) displayMatrix(inv3x3, "Inverse of 3x3 Matrix");
	        else System.out.println("Matrix 3x3 is not invertible\n");
	    }
	
	
	    public static double[][] generateMatrix(int rows, int cols) {
	        Random rand = new Random();
	        double[][] matrix = new double[rows][cols];
	        for (int i = 0; i < rows; i++)
	            for (int j = 0; j < cols; j++)
	                matrix[i][j] = rand.nextInt(10); // 0-9
	        return matrix;
	    }

	    
	    public static void displayMatrix(double[][] matrix, String label) {
	        System.out.println(label + ":");
	        for (double[] row : matrix) {
	            for (double val : row)
	                System.out.print(val + "\t");
	            System.out.println();
	        }
	        System.out.println();
	    }

	  
	    public static double[][] transpose(double[][] matrix) {
	        int rows = matrix.length, cols = matrix[0].length;
	        double[][] transposed = new double[cols][rows];
	        for (int i = 0; i < rows; i++)
	            for (int j = 0; j < cols; j++)
	                transposed[j][i] = matrix[i][j];
	        return transposed;
	    }

	  
	    public static double determinant2x2(double[][] m) {
	        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
	    }

	   
	    public static double determinant3x3(double[][] m) {
	        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
	             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
	             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
	    }

	   
	    public static double[][] inverse2x2(double[][] m) {
	        double det = determinant2x2(m);
	        if (det == 0) return null;
	        double[][] inverse = {
	            { m[1][1]/det, -m[0][1]/det },
	            { -m[1][0]/det, m[0][0]/det }
	        };
	        return inverse;
	    }

	   
	    public static double[][] inverse3x3(double[][] m) {
	        double det = determinant3x3(m);
	        if (det == 0) return null;

	        double[][] cofactor = new double[3][3];

	        
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                double[][] minor = new double[2][2];
	                int r = 0, c;
	                for (int ii = 0; ii < 3; ii++) {
	                    if (ii == i) continue;
	                    c = 0;
	                    for (int jj = 0; jj < 3; jj++) {
	                        if (jj == j) continue;
	                        minor[r][c++] = m[ii][jj];
	                    }
	                    r++;
	                }
	                cofactor[i][j] = Math.pow(-1, i + j) * determinant2x2(minor);
	            }
	        }

	        double[][] adjoint = transpose(cofactor);
	        double[][] inverse = new double[3][3];

	        for (int i = 0; i < 3; i++)
	            for (int j = 0; j < 3; j++)
	                inverse[i][j] = adjoint[i][j] / det;

	        return inverse;
	    }



}
