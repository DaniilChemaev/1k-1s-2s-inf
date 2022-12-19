public class Main {
    public static void main(String[] args) {
        // Vector2D vector = new Vector2D(2, 2);
        // Vector2D vector1 = new Vector2D(4, 3);
        // Vector2D vector2 = new Vector2D(4, 3);

        // vector.mult2(7);
        // System.out.println(Vector2D.cos(vector1, vector2));
        // System.out.println(Vector2D.scalarProduct(vector1, vector2));
        // System.out.println(Vector2D.equals(vector1, vector2));

        // RationalFraction rationalFraction1 = new RationalFraction(-4, 2);
        // RationalFraction rationalFraction2 = new RationalFraction(1, 2);
        
        // System.out.println("rf: " + rationalFraction1);

        // // System.out.println(rationalFraction2);



        // rationalFraction1.reduce();

        // System.out.println("Reduced rf: " + rationalFraction1);

        // System.out.println("Value: " + rationalFraction2.value());

        // System.out.println(RationalFraction.equals(rationalFraction1, rationalFraction2));

        // System.out.println("numberPart: " + rationalFraction2.numberPart());


        // rationalFraction1.add2(rationalFraction2);

        // ComplexNumber complexNumber1 = new ComplexNumber(0, 2);
        // ComplexNumber complexNumber2 = new ComplexNumber(1, -3);

        // System.out.println(ComplexNumber.add(complexNumber1, complexNumber2));

        // complexNumber1.mult2(complexNumber2);
        // System.out.println(complexNumber1);

        Matrix2x2 matrix2x2_1 = new Matrix2x2(2, 2, 2, 2);
        Matrix2x2 matrix2x2_2 = matrix2x2_1.inverseMatrix();

        System.out.println(matrix2x2_2);
        // matrix2x2_1.transpon();
        // System.out.println(matrix2x2_1);


        // matrix2x2_1.add2(matrix2x2_2);
        // matrix2x2_2.transpon();

        // System.out.println(matrix2x2_2.inverseMatrix);

    }
}
