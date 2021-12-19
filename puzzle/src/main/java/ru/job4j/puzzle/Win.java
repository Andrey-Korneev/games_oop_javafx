package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1 && (checkHorizontal(board, index)
                    || checkVertical(board, index))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    private static boolean checkHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int col = 0; col < board[row].length; col++) {
            if (board[row][col] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    private static boolean checkVertical(int[][] board, int col) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][col] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
