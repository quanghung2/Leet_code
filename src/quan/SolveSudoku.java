package quan;

public class SolveSudoku {
    private static final int Grid_size = 9;

    public static void main(String[] args) {
        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0 },
                {0, 0, 0, 0, 0, 3, 0, 0, 0 },
                {1, 0, 0, 0, 0, 9, 5, 0, 0 },
                {8, 0, 0, 0, 0, 0, 0, 9, 0 },
                {0, 4, 3, 0, 0, 0, 7, 5, 0 },
                {0, 9, 0, 0, 0, 0, 0, 0, 8 },
                {0, 0, 9, 7, 0, 0, 0, 0, 5 },
                {0, 0, 0, 2, 0, 0, 0, 0, 0 },
                {0, 0, 7, 0, 4, 0, 2, 0, 3 }
        };
        printBoard(board);
        if(solved(board)){
            System.out.println("solved successfully");
            printBoard(board);
        } else {
            System.out.println("can't solved");
        }

    }

    private static void printBoard(int[][] board){
        for (int i = 0; i < Grid_size; i++){
            for (int j = 0; j < Grid_size; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    private static boolean isNumberInRow(int[][] board, int row, int number){
        for (int i = 0; i < Grid_size; i++){
            if (board[row][i] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int column, int number){
        for (int i = 0; i < Grid_size; i++){
            if (board[i][column] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int column, int row, int number){
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++){
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++){
                if(board[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int column, int row, int number){
        return      !isNumberInBox(board, column, row, number)
                && !isNumberInColumn(board, column, number)
                && isNumberInRow(board, row, number);
    }

    private static boolean solved(int[][] board){
        for (int row = 0; row < Grid_size; row++){
            for (int column = 0; column < Grid_size; column++){
                if(board[row][column] == 0 ){
                    for (int numberToTry = 1; numberToTry <= 9; numberToTry++){
                        if(isValidPlacement(board, column, row, numberToTry)){
                            board[row][column] = numberToTry;
                            if (solved(board)){
                                return true;
                            } else {
                                board[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
