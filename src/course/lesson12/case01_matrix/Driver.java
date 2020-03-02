package course.lesson12.case01_matrix;

public class Driver {
    public static void main(String[] args) {
        {
            int[][] map = new int[10][10];
            map[1][2] = 1;
            map[1][3] = 2;

        /*
            _ _ _ _ _
            _ _ T F _
            _ _ _ _ _
         */
        }

        {
            Cell[][] map = new Cell[10][10];
            for (Cell[] cells : map) {
                for (int i = 0; i < cells.length; i++) {
                    cells[i] = new Cell();
                }
            }

            map[1][2].setType(Cell.typeFlat);
        }

    }
}
