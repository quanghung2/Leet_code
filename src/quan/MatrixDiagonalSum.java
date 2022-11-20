package quan;
import org.junit.Test;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(calculateSum(matrix));
    }
    public static int calculateSum(int[][] mat){
        int n = mat.length;
        int sum = 0;
        for (int i= 0; i < n; i++){
                sum += mat[i][i];
                if (n - i - i != 0){
                    sum += mat[i][n-i];
                }
            }
        return sum;
        }
    }

