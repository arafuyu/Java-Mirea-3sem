package Pract5;

import java.util.Scanner; //Класс Scanner используется для получения пользовательского ввода и находится в java.util пакете.

public class PR5 {
    public static void main(int max, int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max)
                main(n, 1);
            else if (n == max)
                main(max, ++count);
            else
                main(max, count);
        }
        else
            System.out.println(count);

    }
    public static void main(String[] args) {
        System.out.println("Количество элементов, равных максимуму.");
        System.out.println("Введите элементы: ");
        main(0,0);
        System.out.println();
    }
}