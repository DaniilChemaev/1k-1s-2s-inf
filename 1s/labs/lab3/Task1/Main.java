// Вариант 2

public class Main{
	public static void main(String[] args){
	Cyrcle cyrcle1 = new Cyrcle(0, 0, 5);
	Cyrcle cyrcle2 = new Cyrcle(0, 0, 6);
	System.out.println(cyrcle1.common(cyrcle2));
	System.out.println(cyrcle1.equals(cyrcle2));
	}
}