
class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && rowSet.contains(board[i][j])) {
                    return false;
                }
                rowSet.add(board[i][j]);
            }
            System.out.println("Row " + i + ": " + rowSet);
        }

        // Check columns
        for (int i = 0; i < 9; i++) {
            Set<Character> colSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.' && colSet.contains(board[j][i])) {
                    return false;
                }
                colSet.add(board[j][i]);
            }
            System.out.println("Column " + i + ": " + colSet);
        }

        // Check 3x3 sub-boxes
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                Set<Character> boxSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char num = board[boxRow * 3 + i][boxCol * 3 + j];
                        if (num != '.' && boxSet.contains(num)) {
                            return false;
                        }
                        boxSet.add(num);
                    }
                }
                System.out.println("Box (" + boxRow + "," + boxCol + "): " + boxSet);
            }
        }

        return true;
    }}