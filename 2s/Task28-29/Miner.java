import java.util.*;

class Cell {
    int x, y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Miner {

    final static int M = 10;
    final static int N = 10;
    int x;
    int y;

    public Miner(int x, int y) {
        this.x = x - 1;
        this.y = y - 1;
    }

    public static int checkMinesAround(int i, int j, int[][] mines) {
        int k = 0;
        for (int i1 = -1; i1 <= 1; i1++) {
            for (int j1 = -1; j1 <= 1; j1++) {
                if (i1 != 0 || j1 != 0) {  // Проверка той точки, которую открыли
                    try {
                        k += mines[i + i1][j + j1];
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                }
            }
        }
        return k;
    }

    public static void initField(String[][] field) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                field[i][j] = "#";
            }
        }
    }

    public static void printField(String[][] field) {
        System.out.print("   ");
        for (int i = 0; i < field[0].length; i++) {
            if (i + 1 < 10) {
                System.out.print(i + 1 + "  ");
            } else {
                System.out.print(i + 1 + " ");
            }
        }

        System.out.print("\n");

        for (int i = 0; i < M; i++) {
            if (i + 1 < 10) {
                System.out.print(i + 1 + "  ");
            } else {
                System.out.print(i + 1 + " ");
            }
            for (int j = 0; j < N; j++) {
                if (j < 10) {
                    System.out.print(field[i][j] + "  ");
                } else {
                    System.out.print(field[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static boolean start() {
        int[][] mines = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}
        };
        String[][] field = new String[M][N];
        initField(field);

        int i = 5;
        int j = 5;

        // !TODO Если юзер с первого раза попал на мину
        if (mines[i][j] == 1) {
            System.out.println("Game Over");
            return true;
        } else {
            int k = checkMinesAround(i, j, mines);
            if (k > 0) {  // Если вокруг точки есть хотя бы одна мина -- выводим в открытой клетке число мин вокруг
                field[i][j] = k + "";
                printField(field);
            } else {  // Если мин вокруг точки нет
                Queue<Cell> q = new LinkedList<>();
                for (int i1 = -1; i1 <= 1; i1++) {
                    for (int j1 = -1; j1 <= 1; j1++) {
                        if (i1 != 0 || j1 != 0) {
                            try {
//                                int w = mines[i + i1][j + j1];
                                Cell c = new Cell(i + i1, j + j1);
                                q.offer(c);
                            } catch (ArrayIndexOutOfBoundsException e) {
                            }
                        }
                    }
                }
                System.out.println(q);
                field[i][j] = "_";
//                printField(field);
                while (!q.isEmpty()) {
//                    System.out.println(q.size());
                    Cell c = q.remove();
                    k = checkMinesAround(c.x, c.y, mines);
                    if (k > 0) {
                        field[c.x][c.y] = k + "";
//                        printField(field);
                    } else {
                        for (int i1 = -1; i1 <= 1; i1++) {
                            for (int j1 = -1; j1 <= 1; j1++) {
                                if (i1 != 0 || j1 != 0) {
                                    try {
                                        int w = mines[c.x + i1][c.y + j1];
                                        if (field[c.x + i1][c.y + j1].equals("#")) {
                                            Cell c1 = new Cell(c.x + i1, c.y + j1);
                                            q.offer(c1);
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                    }
                                }
                            }
                        }
                        field[c.x][c.y] = "_";
//                        printField(field);
                    }
                }
                printField(field);
            }
            return true;
        }
    }


}
