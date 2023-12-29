package arrays_hashing.valid_sudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {

    public boolean isValidSudoku(char[][] board) {
        if (!checkRows(board)) return false;
        if (!checkColumns(board)) return false;
        System.out.println(checkSubBoxes(board));
        if (!checkSubBoxes(board)) return false;
        return true;
    }
    private boolean checkRows(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            set.clear();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    if (!set.add(board[i][j])) return false;
                }
            }
        }
        return true;
    }

    private boolean checkColumns(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            set.clear();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.') {
                    if (!set.add(board[j][i])) return false;
                }
            }
        }
        return true;
    }

    private boolean checkSubBoxes(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0) set.clear();
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != '.') {
                    if (!set.add(board[i][j])) return false;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0) set.clear();
            for (int j = 3; j < 6; j++) {
                if (board[i][j] != '.') {
                    if (!set.add(board[i][j])) return false;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0) set.clear();
            for (int j = 6; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!set.add(board[i][j])) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(solution.isValidSudoku(board));
    }
}
