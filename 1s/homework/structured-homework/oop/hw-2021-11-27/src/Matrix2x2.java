/*
Создать класс Matrix2x2 - двумерная матрица из вещественных чисел. Аргументы - содержимое матрицы (лучше, разумеется, хранить двумерным массивом, а то замучаетесь). Методы:
• Matrix2x2() - конструктор для нулевой матрицы;
• Matrix2x2(double) - конструктор для матрицы, у которой каждый элемент равен поданному числу;
• Matrix2x2(double [][]) - конструктор для матрицы, содержимое подается на вход в виде массива;
• Matrix2x2(double, double, double, double) - глупый конструктор, но пусть он будет. Сами знаете, что он делает. В конструкторах устраняйте дублирование кода;
• Matrix2x2 add(Matrix2x2) - сложение матрицы с другой;
• void add2(Matrix2x2) - сложение матрицы с другой;
• Matrix2x2 sub(Matrix2x2) - вычитание из матрицы другой матрицы;
• void sub2(Matrix2x2) - вычитание из матрицы другой матрицы;
• Matrix2x2 multNumber(double) - умножение матрицы на вещественное число;
• void multNumber2(double) - умножение матрицы на вещественное число;
• Matrix2x2 mult(Matrix2x2) - умножение матрицы на другую матрицу;
• void mult2(Matrix2x2) - умножение матрицы на другую матрицу;
• double det() - определитель матрицы;
• void transpon() - транспонировать матрицу;
• Matrix2x2 inverseMatrix() - возвратить обратную матрицу для заданной. Если это невозможно, вывести сообщение об ошибке и вернуть нулевую матрицу (кто вдруг знает исключения, может их использовать).

• Matrix2x2 equivalentDiagonal() - возвратить эквивалентную диагональную матрицу;
• Vector2D multVector(Vector2D) - умножить матрицу на двумерный вектор (считая его столбцом) и возвратить получившийся столбец в виде вектора.

А теперь комбинируем! ^^ 
В дальнейших задачах все методы, которые делают операции (сложение, умножение и т.п.) всегда возвращают значения, void среди них нет. Все вспомогательные операции над компонентами должны опираться на операции, написанные в классах 46-49.
*/


public class Matrix2x2 {
    private double[][] matrix;

    public Matrix2x2() {
        matrix = new double[2][2];
    }

    public Matrix2x2(double n) {
        this.matrix = new double[][]{{n, n}, {n, n}};
    }

    public Matrix2x2(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix2x2(double a, double b, double c, double d) {
        this.matrix = new double[][]{{a, b}, {c, d}};
    }

    public double[][] getMatrix() {
        return matrix;
    }

    void setMatrix(double[][] matrix){
        this.matrix = matrix;
    }

    public Matrix2x2 add(Matrix2x2 matrix2x2_1, Matrix2x2 matrix2x2_2){
        double oneOne = matrix2x2_1.getMatrix()[0][0] + matrix2x2_2.getMatrix()[0][0];
        double oneTwo = matrix2x2_1.getMatrix()[0][1] + matrix2x2_2.getMatrix()[0][1];
        double twoOne = matrix2x2_1.getMatrix()[1][0] + matrix2x2_2.getMatrix()[1][0];
        double twoTwo = matrix2x2_1.getMatrix()[1][1] + matrix2x2_2.getMatrix()[1][1];
        return new Matrix2x2(oneOne, oneTwo, twoOne, twoTwo);
    }

    public void add2(Matrix2x2 matrix2x2_2){
        double oneOne = getMatrix()[0][0] + matrix2x2_2.getMatrix()[0][0];
        double oneTwo = getMatrix()[0][1] + matrix2x2_2.getMatrix()[0][1];
        double twoOne = getMatrix()[1][0] + matrix2x2_2.getMatrix()[1][0];
        double twoTwo = getMatrix()[1][1] + matrix2x2_2.getMatrix()[1][1];
        double[][] matrixRes = new double[][]{{oneOne, oneTwo}, {twoOne, twoTwo}};
        setMatrix(matrixRes);
    }

    public Matrix2x2 sub(Matrix2x2 matrix2x2_1, Matrix2x2 matrix2x2_2){
        double oneOne = matrix2x2_1.getMatrix()[0][0] - matrix2x2_2.getMatrix()[0][0];
        double oneTwo = matrix2x2_1.getMatrix()[0][1] - matrix2x2_2.getMatrix()[0][1];
        double twoOne = matrix2x2_1.getMatrix()[1][0] - matrix2x2_2.getMatrix()[1][0];
        double twoTwo = matrix2x2_1.getMatrix()[1][1] - matrix2x2_2.getMatrix()[1][1];
        Matrix2x2 matrixRes = new Matrix2x2(oneOne, oneTwo, twoOne, twoTwo);
        return matrixRes;
    }

    public void sub2(Matrix2x2 matrix2x2_2){
        double oneOne = getMatrix()[0][0] - matrix2x2_2.getMatrix()[0][0];
        double oneTwo = getMatrix()[0][1] - matrix2x2_2.getMatrix()[0][1];
        double twoOne = getMatrix()[1][0] - matrix2x2_2.getMatrix()[1][0];
        double twoTwo = getMatrix()[1][1] - matrix2x2_2.getMatrix()[1][1];
        double[][] matrixRes = new double[][]{{oneOne, oneTwo}, {twoOne, twoTwo}};
        setMatrix(matrixRes);
    }

    public Matrix2x2 multNumber(Matrix2x2 matrix2x2_1, double n){
        double oneOne = matrix2x2_1.getMatrix()[0][0] * n;
        double oneTwo = matrix2x2_1.getMatrix()[0][1] * n;
        double twoOne = matrix2x2_1.getMatrix()[1][0] * n;
        double twoTwo = matrix2x2_1.getMatrix()[1][1] * n;
        Matrix2x2 matrixRes = new Matrix2x2(oneOne, oneTwo, twoOne, twoTwo);
        return matrixRes;
    }

    public void multNumber2(double n){
        double oneOne = getMatrix()[0][0] * n;
        double oneTwo = getMatrix()[0][1] * n;
        double twoOne = getMatrix()[1][0] * n;
        double twoTwo = getMatrix()[1][1] * n;
        double[][] matrixRes = new double[][]{{oneOne, oneTwo}, {twoOne, twoTwo}};
        setMatrix(matrixRes);
    }

    public Matrix2x2 mult(Matrix2x2 matrix2x2_1, Matrix2x2 matrix2x2_2){
        double oneOne = matrix2x2_1.getMatrix()[0][0] * matrix2x2_2.getMatrix()[0][0] + matrix2x2_1.getMatrix()[0][1] * matrix2x2_2.getMatrix()[1][0];
        double oneTwo = matrix2x2_1.getMatrix()[0][0] * matrix2x2_2.getMatrix()[0][1] + matrix2x2_1.getMatrix()[0][1] * matrix2x2_2.getMatrix()[1][1];
        double twoOne = matrix2x2_1.getMatrix()[1][0] * matrix2x2_2.getMatrix()[0][0] + matrix2x2_1.getMatrix()[1][1] * matrix2x2_2.getMatrix()[1][0];
        double twoTwo = matrix2x2_1.getMatrix()[1][0] * matrix2x2_2.getMatrix()[0][1] + matrix2x2_1.getMatrix()[1][1] * matrix2x2_2.getMatrix()[1][1];
        Matrix2x2 matrixRes = new Matrix2x2(oneOne, oneTwo, twoOne, twoTwo);
        return matrixRes;
    }

    public void mult2(Matrix2x2 matrix2x2_2){
        double oneOne = getMatrix()[0][0] * matrix2x2_2.getMatrix()[0][0] + getMatrix()[0][1] * matrix2x2_2.getMatrix()[1][0];
        double oneTwo = getMatrix()[0][0] * matrix2x2_2.getMatrix()[0][1] + getMatrix()[0][1] * matrix2x2_2.getMatrix()[1][1];
        double twoOne = getMatrix()[1][0] * matrix2x2_2.getMatrix()[0][0] + getMatrix()[1][1] * matrix2x2_2.getMatrix()[1][0];
        double twoTwo = getMatrix()[1][0] * matrix2x2_2.getMatrix()[0][1] + getMatrix()[1][1] * matrix2x2_2.getMatrix()[1][1];
        double[][] matrixRes = new double[][]{{oneOne, oneTwo}, {twoOne, twoTwo}};
        setMatrix(matrixRes);
    }

    public double det(){
        return getMatrix()[0][0] * getMatrix()[1][1] - getMatrix()[0][1] * getMatrix()[1][0];
    }

    public void transpon(){
        double oneOne = getMatrix()[0][0];
        double oneTwo = getMatrix()[1][0];
        double twoOne = getMatrix()[0][1];
        double twoTwo = getMatrix()[1][1];
        double[][] matrixRes = new double[][]{{oneOne, oneTwo}, {twoOne, twoTwo}};
        setMatrix(matrixRes);
    }

    public Matrix2x2 inverseMatrix(){
        if (det() != 0){
            Matrix2x2 matrixRes = new Matrix2x2(getMatrix()[1][1], -getMatrix()[1][0], -getMatrix()[0][1], getMatrix()[0][0]);
            matrixRes.transpon();
            return multNumber(matrixRes, 1/det());
        }   
        else{
            return new Matrix2x2();
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res += matrix[i][j] + "\t";
            }
            res += "\n";

        }
        return res;
    }


}