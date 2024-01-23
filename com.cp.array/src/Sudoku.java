import java.util.HashSet;

public class Sudoku {

    static public boolean isValidSudoku(char[][] board) {
        HashSet<String> c = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if (board[i][j] != '.'){
                    if(!c.add(board[i][j]+"element found in row"+i) ||
                            !c.add(board[i][j]+"element found in col"+i) ||
                            c.add(board[i][j]+"element found in subBox"+(i/3)+"-"+(j/3))){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /*static public boolean isValidSudokuRowWise(char[][] board) {
        for(int row=0;row<9;row++){
            char temp=board[row][0];
            //System.out.println(temp);
            for(int col=row+1;col<9;col++){
                System.out.print(board[row][col]+" ");
                if(board[row][col]==temp && board[row][col]!='.'){
                    return false;
                }
            }
            System.out.println();
        }
        return true;
    }

    static public boolean isValidSudokuColWise(char[][] board) {

    }*/
    public static void main(String[] args) {
        char[][] sudokuBoard = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '3', '8', '.', '2', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(sudokuBoard));
    }
}
