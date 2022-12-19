/*
Класс RationalFraction - рациональная дробь. Атрибуты - два целых числа (числитель и знаменатель). Методы:
• RationalFraction() - конструктор для дроби, равной нулю;
• RationalFraction(int, int) - конструктор дроби со значениями числителя и знаменателя; в конструкторах устраняйте дублирование кода;
• void reduce() - сокращение дроби;
• RationalFraction add(RationalFraction) - сложение дроби с другой дробью, результат возвращается как новый объект (не забудьте сократить)
• void add2(RationalFraction) - сложение дроби с другой дробью, результат сохраняется в том, у кого был вызван этот метод (не забудьте сократить);
• RationalFraction sub(RationalFraction) - вычитание из дроби другой дроби, результат возвращается как новый объект (не забудьте сократить);
• void sub2(RationalFraction) - вычитание из дроби другой дроби, результат сохраняется в том, у кого был вызван этот метод (не забудьте сократить);
• RationalFraction mult(RationalFraction) - умножение дроби на другую дробь, результат возвращается как новый объект (сократить)
• void mult2(RationalFraction) - умножение дроби на другую дробь, результат сохраняется;
• RationalFraction div(RationalFraction) - деление дроби на другую дробь, результат возвращается как новый объект (сократить)
• void div2(RationalFraction) - деление дроби на другую дробь, результат сохраняется; больше не буду писать "возвращается" или "сохраняется", думаю, уже и так понятно.
• String toString() - строковое представление дроби (например, -2/3);
• double value() - десятичное значение дроби;
• boolean equals(RationalFraction) - сравнить дробь с другой дробью 
• (не забывайте, что 2/4 и 1/2 - одна и та же дробь)
• int numberPart() - целая часть дроби;
*/

import java.lang.Math;

public class RationalFraction {

    private int numerator;  // Числитель
    private int denominator; // Знаменатель

    public RationalFraction() {
        numerator = 0;
        denominator = 1;
    }

    public RationalFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    int getNumerator() {
        return numerator;
    }
    
    int getDenominator() {
        return denominator;
    }

    void setNumerator(int numerator){
        this.numerator = numerator;
    }

    void setDenominator(int denominator){
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "" + numerator + "/" + denominator + ""; 
    }

    public void reduce(){
        if (getNumerator() > getDenominator() && getNumerator() % getDenominator() == 0){
            setNumerator(getNumerator() / getDenominator());
        }

        int limit = Math.min(getNumerator(), getDenominator());

        System.out.println("limit: " + limit);
        for (int i = limit; i >= 2; i--) {
            System.out.println("i: " + i);
            if (getNumerator() % i == 0 && getDenominator() % i == 0 && getNumerator() != 1 && getDenominator() != 1){
                setNumerator(getNumerator() / i); 
                setDenominator(getDenominator() / i);  
            }
        }

    }

    public static RationalFraction add(RationalFraction rf1, RationalFraction rf2) {
        RationalFraction rationalFractionRes = new RationalFraction((rf1.getNumerator() * rf2.getDenominator() + rf2.getNumerator() * rf1.getDenominator()), (rf1.getDenominator()*rf2.getDenominator()));
        rationalFractionRes.reduce();
        return rationalFractionRes;
    }

    public void add2(RationalFraction rationalFraction){
        setNumerator(getNumerator() * rationalFraction.getDenominator() + rationalFraction.getNumerator() * getDenominator());
        setDenominator(getDenominator() * rationalFraction.getDenominator());
        reduce();
    }

    public static RationalFraction sub(RationalFraction rf1, RationalFraction rf2) {
        RationalFraction rationalFractionRes = new RationalFraction((rf1.getNumerator() * rf2.getDenominator() - rf2.getNumerator() * rf1.getDenominator()), (rf1.getDenominator()*rf2.getDenominator()));
        rationalFractionRes.reduce();
        return rationalFractionRes;
    }

    public void sub2(RationalFraction rationalFraction){
        setNumerator(getNumerator() * rationalFraction.getDenominator() - rationalFraction.getNumerator() * getDenominator());
        setDenominator(getDenominator() * rationalFraction.getDenominator());
        reduce();
    }

    public static RationalFraction mult(RationalFraction rf1, RationalFraction rf2) {
        RationalFraction rationalFractionRes = new RationalFraction((rf1.getNumerator() * rf2.getNumerator()), (rf1.getDenominator() * rf2.getDenominator()));
        rationalFractionRes.reduce();
        return rationalFractionRes;
    }

    public void mult2(RationalFraction rationalFraction){
        setNumerator(getNumerator() * rationalFraction.getNumerator());
        setDenominator(getDenominator() * rationalFraction.getDenominator());
        reduce();
    }

    public static RationalFraction div(RationalFraction rf1, RationalFraction rf2) {
        RationalFraction rationalFractionRes = new RationalFraction((rf1.getNumerator() * rf2.getDenominator()), (rf1.getDenominator() * rf2.getNumerator()));
        rationalFractionRes.reduce();
        return rationalFractionRes;
    }

    public void div2(RationalFraction rationalFraction){
        setNumerator(getNumerator() * rationalFraction.getDenominator());
        setDenominator(getDenominator() * rationalFraction.getNumerator());
        reduce();
    }

    public double value(){
        return (double)getNumerator() / getDenominator();
    }

    public static boolean equals(RationalFraction rationalFraction1, RationalFraction rationalFraction2){
        rationalFraction1.reduce();
        rationalFraction2.reduce();

        return (rationalFraction1.getNumerator() == rationalFraction2.getNumerator() && rationalFraction1.getDenominator() == rationalFraction2.getDenominator());
    }

    public int numberPart(){
        return getNumerator() / getDenominator();
    }
}