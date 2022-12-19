// "Практика от 04 мар. Дедлайн - 14 марта 22:00

//31. Создать Comparator, который сравнивает сроки по количеству символов в них
//32. Реализовать класс StringHashTable - хэш-таблица из строк с методами ""добавить"", ""удалить"", ""найти"".
//33. Реализовать класс StringPriorityQueue, унаследовав его от Queue. Внутри использовать реализованную в 32 хэш-таблицу. Для сравнения строк использовать Comparator из задачи 31."

public class Test {
    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D(1, 2);
        Vector2D vector2 = new Vector2D(3, 3);

        //30. Переделать класс Vector2D из предыдущего семестра, сделать его Comparable (сравнивать по длине(модулю) вектора)
        System.out.println(vector1.compareTo(vector2));

        StringHashTable stringHashTable = new StringHashTable();
        stringHashTable.put("123");
        stringHashTable.put("123");
        stringHashTable.put("123");
        System.out.println(stringHashTable.find("123"));

        stringHashTable.remove("123");
        stringHashTable.remove("123");
        stringHashTable.remove("123");

        System.out.println(stringHashTable.find("123"));


    }
}
