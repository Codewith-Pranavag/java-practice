class Solution {
    private boolean checkrow(char row[]){
        boolean found[]=new boolean[9];
        for(char c: row){
            if(c=='.') continue;
            int digit=c-'1';
            if(found[digit]) return false;
            found[digit]=true;
        }
        return true;
    }
    private boolean checkcol(char board[][],int j){
        boolean found[]=new boolean[9];
        for(int i=0;i<9;i++){
            char c=board[i][j];
            if(c=='.') continue;
            int digit=c-'1';
            if(found[digit]) return false;
            found[digit]=true;
        }
        return true;
    }
    private boolean checkbox(char[][] board,int boxnumber){
        boolean found[]=new boolean[9];
        int i=3*(boxnumber/3);
        int j=3*(boxnumber%3);
        for(int a=i;a<i+3;a++){
            for(int b=j;b<j+3;b++){
                char c=board[a][b];
                if(c=='.') continue;
                int digit=c-'1';
                if(found[digit]) return false;
                found[digit]=true;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!checkrow(board[i])) return false;
        }
        for(int j=0;j<9;j++){
            if(!checkcol(board,j)) return false;
        }
        for(int box=0;box<9;box++){
            if(!checkbox(board,box)) return false;
        }
        return true;
    }
}
