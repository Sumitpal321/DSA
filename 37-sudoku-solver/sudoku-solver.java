class Solution {
    public boolean isValid(char[][] board, int row, int col, char num){
        //check row
        for(int j=0;j<9;j++){
            if(board[row][j]==num) return false;
        }
        //check col
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        //check 3*3 board
        int sRow = row/3*3;
        int sCol = col/3*3;
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    public boolean solve(char[][] board, int row, int col){
        if(row == 9) return true;

        else if(board[row][col]!='.'){
            if(col!=8){
                return solve(board, row, col+1);
            }
            else return solve(board, row+1, 0);
        }
        else{
            for(char ch='1';ch<='9';ch++){
                if(isValid(board, row, col, ch)){
                    board[row][col] = ch;
                    if(col!=8){
                        if(solve(board, row, col+1)) return true;
                    }
                    else{
                        if(solve(board, row+1, 0)) return true;
                    }
                    board[row][col]='.';//backtracking
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}