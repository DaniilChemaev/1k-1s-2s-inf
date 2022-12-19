/*
62. Задача fractional knapsack problem.
Вводится вместимость рюĸзаĸа, пары чисел для ĸаждой вещи в рюĸзаĸе - вес и ценность.
Заполнить рюĸзаĸ маĸсимально ценно, при этом вещи можно делить на части.
 */


public class Task62 {
    public static void task(double capacity, double[] knapsack) {
        while (capacity > 0) {
            double maxValue = 0;
            int indexMax = 0;
            for (int i = 0; i < knapsack.length; i += 2) {
                if (knapsack[i + 1] / knapsack[i] > maxValue) {
                    maxValue = knapsack[i + 1] / knapsack[i];
                    indexMax = i;
                }
            }
            if (capacity - knapsack[indexMax] >= 0) {
                capacity -= knapsack[indexMax];
                System.out.println("Из элемента с индексом " + indexMax + " мы взяли " + knapsack[indexMax] + " кг");
                knapsack[indexMax] = 0;
                knapsack[indexMax + 1] = 0;
            } else {
                System.out.println("Из элемента с индексом " + indexMax + " мы взяли " + capacity + " кг");
                capacity -= capacity;
            }
        }
    }

    public static void main(String[] args) {
        double capacity = 20;
        double[] knapsack = {20, 10, 30, 40, 3, 70};
        task(capacity, knapsack);
    }

}
