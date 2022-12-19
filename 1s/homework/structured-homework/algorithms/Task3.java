/*
  03 Разложить введенное число n на множители, вывести их на экран.
  Выводить все делители, не только уникальные (т.е., например, для 12 нужно вывести 2 2 3).
*/

class Task3{

	public static void main(String[] args){
		findAllMultipliers(112413512);
	}

	public static void findAllMultipliers(int n) {
		int i = 2;
        while (n != 1) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            } else i++;
        }
	}
}