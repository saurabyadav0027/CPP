class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {

        // check row
        unordered_set<int> row;
        for (int i = 0; i < 9; i++) {
            row.clear();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;

                int x = board[i][j] - '0';
                if (row.count(x)) return false;
                row.insert(x);
            }
        }

        // check column
        unordered_set<int> column;
        for (int i = 0; i < 9; i++) {
            column.clear();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') continue;

                int x = board[j][i] - '0';
                if (column.count(x)) return false;
                column.insert(x);
            }
        }

        // check every 3x3 grid
        unordered_set<int> grid;

        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                grid.clear();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if (board[boxRow + i][boxCol + j] == '.') continue;

                        int x = board[boxRow + i][boxCol + j] - '0';

                        if (grid.count(x)) return false;
                        grid.insert(x);
                    }
                }
            }
        }

        return true;
    }
};