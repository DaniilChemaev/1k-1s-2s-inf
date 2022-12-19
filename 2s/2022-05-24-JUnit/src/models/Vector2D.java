package models;/*
Класс models.Vector2D - двумерный вектор. Атрибуты - два вещественных числа (координаты). Далее (здесь и в последующих подобных задачах) указываю методы с типом возвращамых значений, а в скобках пишу только типы параметров. get- и set- методы создавать по необходимости (тоже здесь и далее).
• models.Vector2D() - конструктор для нулевого вектора;
• models.Vector2D(double, double) - конструктор вектора с координатами; в конструкторах устраняйте дублирование кода;
• models.Vector2D add(models.Vector2D) - сложение вектора с другим вектором, результат возвращается как новый объект.
• void add2(models.Vector2D) - сложение вектора с другим вектором, результат сохраняется в том, у кого был вызван этот метод;
• models.Vector2D sub(models.Vector2D) - вычитание из вектора другого вектора, результат возвращается как новый объект;
• void sub2(models.Vector2D) - вычитание из вектора другого вектора, результат сохраняется в том векторе, у кого был вызван этот метод;
• models.Vector2D mult(double) - умножение вектора на вещественное число, результат возвращается как новый объект;
• void mult2(double) - умножение вектора на вещественное число, результат сохраняется в векторе;

• String toString() - строковое представление вектора;
• double length() - длина вектора;
• double scalarProduct(models.Vector2D) - скалярное произведение вектора на другой вектор;
• double cos(models.Vector2D) - косинус угла между этим и другим вектором;
• boolean equals(models.Vector2D) - сравнить вектор с другим вектором
 */

public class Vector2D {
    private double x;
    private double y;

    public Vector2D() {
        x = 0;
        y = 0;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }

    public static Vector2D add(Vector2D vector1, Vector2D vector2) {
        return new Vector2D(vector1.getX() + vector2.getX(), vector1.getY() + vector2.getY());
    }

    public void add2(Vector2D vector) {
        setX(getX() + vector.getX());
        setY(getY() + vector.getY());
    }

    public static Vector2D sub(Vector2D vector1, Vector2D vector2) {
        return new Vector2D(vector1.getX() - vector2.getX(), vector1.getY() - vector2.getY());
    }

    public void sub2(Vector2D vector) {
        setX(getX() - vector.getX());
        setY(getY() - vector.getY());
    }

    public static Vector2D mult(Vector2D vector, double n) {
        return new Vector2D(vector.getX() * n, vector.getY() * n);
    }

    public void mult2(double n) {
        setX(getX() * n);
        setY(getY() * n);
    }

    public double length() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    public static double scalarProduct(Vector2D vector1, Vector2D vector2) {
        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY();
    }

    public static double cos(Vector2D vector1, Vector2D vector2) {
        return scalarProduct(vector1, vector2) / (vector1.length() * vector2.length());
    }

    public static boolean equals(Vector2D vector1, Vector2D vector2) {
        return vector1.length() == vector2.length();
    }
}