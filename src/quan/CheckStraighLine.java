package quan;

public class CheckStraighLine {
    private static boolean checkRadian (int[] A, int[] B, int[] C){
        return (A[0] - B[0]) * (A[1] - C[1]) == (A[0] - C[0]) * (A[1] - B[1]);
    }
    public static boolean checkStraightLine(int[][] coordinates){
        for(int[] A: coordinates){
            for(int[] B: coordinates){
                if(!checkRadian(A, B, coordinates[0])){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(checkStraightLine(coordinates));
    }
}
