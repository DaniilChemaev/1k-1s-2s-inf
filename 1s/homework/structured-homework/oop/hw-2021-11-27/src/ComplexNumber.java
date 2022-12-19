/*
Если вы не в теме, прочитайте: https://ru.wikipedia.org/wiki/Комплексное_число
Создать класс ComplexNumber - комплексное число. Атрибуты - действительная и мнимая части (два числа). Методы:
• ComplexNumber() - конструктор для нулевого комплексного числа;
• ComplexNumber(double, double) - конструктор комплексного числа с заданными значениями вещественной и мнимой части; в конструкторах устраняйте дублирование кода;
• ComplexNumber add(ComplexNumber) - сложение комплексного числа с другим комплексным числом;
• void add2(ComplexNumber) - сложение комплексного числа с другим комплексным числом;
• CompexNumber sub(ComplexNumber) - вычитание из комплексного числа  другого комплексного числа;
• void sub2(ComplexNumber) - вычитание из комплексного числа другого комплексного числа;
• ComplexNumber multNumber(double) - умножение комплексного числа на вещественное число;
• void multNumber2(double) - умножение комплексного числа на вещественное число;
• ComplexNumber mult(ComplexNumber) - умножение комплексного числа на другое комплексное число;
• void mult2(ComplexNumber) - умножение комплексного числа на другое комплексное число;
• ComplexNumber div(ComplexNumber) - деление на другое комплексное число;
• void div2(ComplexNumber) - деление на другое комплексное число;
• double length() - модуль комплексного числа; 
• String toString() - строковое представление комплексного числа.  Только без всяких "2 * i + - 3". Проверяйте знаки, чтобы было красиво: 2 * i - 3.
• double arg() - аргумент комплексного числа (может понадобиться тригонометрическое представление (читайте ссылку) и арктангенс Math.atan);

• ComplexNumber pow(double) - возвести в степень по Формуле Муавра (иные способы запрещены). Внимание - разрешено использование Math.pow для возведения аргумента в степень (т.к. оба аргумента double), также вам понадобятся Math.cos, Math.sin.
*/

import java.lang.Math;


public class ComplexNumber{
	private double x;
	private double y;

	public ComplexNumber(){
		x = 0;
        y = 0;
	}

	public ComplexNumber(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y; 
	}

	public void setX(double x){
		this.x = x;
	}

	public void setY(double y){
		this.y = y;
	}

	@Override
	public String toString(){
		if (y < 0) {
			return x + " - " + (-y) + "i";
		}
		else if (y == 0){
			return x + "";
		}
		else if (x == 0){
			return y + "i";
		}
		else{
			return x + " + " + y + "i";
		}
	}

	public static ComplexNumber add(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
		return new ComplexNumber(complexNumber1.getX() + complexNumber2.getX(), complexNumber1.getY() + complexNumber2.getY());
	}

	public void add2(ComplexNumber complexNumber){
		setX(getX() + complexNumber.getX());
		setY(getY() + complexNumber.getY());
	}

	public static ComplexNumber sub(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
		return new ComplexNumber(complexNumber1.getX() - complexNumber2.getX(), complexNumber1.getY() - complexNumber2.getY());
	}

	public void sub2(ComplexNumber complexNumber){
		setX(getX() - complexNumber.getX());
		setY(getY() - complexNumber.getY());
	}

	public static ComplexNumber multNumber(ComplexNumber complexNumber1, double n){
		return new ComplexNumber(complexNumber1.getX() * n, complexNumber1.getY() * n);
	}

	public void multNumber2(double n){
		setX(getX() * n);
		setY(getY() * n);
	}

	public static ComplexNumber mult(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
		return new ComplexNumber((complexNumber1.getX() * complexNumber2.getX() - complexNumber1.getY() * complexNumber2.getY()), (complexNumber1.getY() * complexNumber2.getX() + complexNumber1.getX() * complexNumber2.getY()));
	}

	public void mult2(ComplexNumber complexNumber){
		setX(getX() * complexNumber.getX() - getY() * complexNumber.getY());
		setY(getY() * complexNumber.getX() + getX() * complexNumber.getY());
	}

	public static ComplexNumber div(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
		return new ComplexNumber((complexNumber1.getX() * complexNumber2.getX() + complexNumber1.getY() * complexNumber2.getY()) / complexNumber2.getX() * complexNumber2.getX() + complexNumber2.getY() * complexNumber2.getY(), (complexNumber1.getY() * complexNumber2.getX() + complexNumber1.getX() * complexNumber2.getY()) / complexNumber2.getX() * complexNumber2.getX() + complexNumber2.getY() * complexNumber2.getY());
	}

	public void div2(ComplexNumber complexNumber){
		setX((getX() * complexNumber.getX() - getY() * complexNumber.getY()) / complexNumber.getX() * complexNumber.getX() + complexNumber.getY() * complexNumber.getY());
		setY((getY() * complexNumber.getX() + getX() * complexNumber.getY()) / complexNumber.getX() * complexNumber.getX() + complexNumber.getY() * complexNumber.getY());
	}

	public double length(){
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    public double arg(){
        return Math.atan(getY() / getX());
    }

}