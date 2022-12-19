import models.Calculator;

import java.io.*;
import java.lang.reflect.Method;

public class Main {

    private static void task1() {
        Calculator calculator = new Calculator();
        Class<?> calculatorClass = calculator.getClass();

        System.out.println(calculatorClass.getMethods().length);  // Количество public методов
        System.out.println(calculatorClass.getFields().length);  // Количество атрибутов

        Method[] methods = calculatorClass.getDeclaredMethods();  // Список перегруженных методов
        for (int i = 0; i < methods.length; i++) {
            for (int j = i + 1; j < methods.length; j++) {
                if (methods[i].getName().equals(methods[j].getName())) {
                    System.out.println(methods[i]);
                }
                break;
            }
        }

    }

    private static void task2(String[] array) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/files/blablaBinary.txt"));
        for (String value : array) {
            oos.writeBytes(value);
        }
        oos.flush();
        oos.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/files/blabla.txt"));
        for (String s : array) {
            bw.write(s);
        }
        bw.flush();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        /*
        Task 1:
            На вход подается имя класса. Нужно дать по этому классу некоторую сводку:
            кол-во public methods, кол-во атрибутов, вывести список перегруженных методов
            (при одном названии нескольких реализаций, вывести сигнатуру методов (имя и список типов))

         */
        task1();


        /*
          Task 2:
              ArraySerialize - интерфейс
                      method - serralize(int[] array, filename) (это сохранение данных объекта в потоке. Сохраняем данные в файле)
                   BinaryArrayToFileSerializes (записывает данные в байтах, наследник)
                   TextArrayFileSerializes (записывает данные в строке, наследник)
              Входные данные: имя сериализатора
              Нужно создать массив и сериализовать его. Написать код, который меняет поведение, в зависимости от того, что нам нужно.
              Мы не должны вызывать конструктор в явном виде
              (то есть по имени класса)
         */
        String[] array = {"1", "2", "3", "4", "5", "1", "2", "3", "4", "5", "1", "2", "3", "4", "5"};
        task2(array);

    }
}
