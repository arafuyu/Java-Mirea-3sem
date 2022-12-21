package Pract6;

import java.util.Arrays; //Этот класс содержит различные методы для работы с массивами (такие как сортировка и поиск)

public class StudentTest {

    public static void main(String[] args) {

        Student[] studArr = new Student[6];

        studArr[0] = new Student(5, "Иван");
        studArr[1] = new Student(2, "Савелий");
        studArr[2] = new Student(4, "Егор");
        studArr[3] = new Student(1, "Никита");
        studArr[4] = new Student(3, "Олег");
        studArr[5] = new Student(2, "Андрей");
        System.out.println();
        System.out.println("Неотсортированный список студентов: ");
        for (Student student : studArr) {
            System.out.println(student);
        }

        Arrays.sort(studArr, Student.idNumberComparator);
        System.out.println();
        System.out.println("Отсортированный список студентов по ID: ");
        for (Student student : studArr) {
            System.out.println(student);
        }

        Arrays.sort(studArr, Student.FirstNameComparator);
        System.out.println();
        System.out.println("Отсортированный список студентов по Имени: ");
        for (Student student : studArr) {
            System.out.println(student);
        }
    }
}