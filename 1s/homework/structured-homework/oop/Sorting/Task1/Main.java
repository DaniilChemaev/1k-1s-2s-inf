public class Main {
    public static void main(String[] args) {
        Matrix2x2 matrix2x2 = new Matrix2x2(1, 2, 3, 4);
        ComplexNumber complexNumber = new ComplexNumber(1, 2);
        Multiplicable[] elems = {matrix2x2, complexNumber};

        for (Multiplicable elem : elems) {
            elem.multNumber2(5);
        }
        for (int i = 0; i < elems.length; i++) {
            System.out.println(elems[i]);
        }
    }
}
