package Pract6;

import java.util.Comparator;

public class Student {

    private String firstName;
    private int idNumber;

    public Student (int iDNumber, String firstName) {
        this.idNumber = iDNumber;
        this.firstName = firstName;
    }

    public int getIDNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public static Comparator<Student> FirstNameComparator
            = Comparator.comparing(Student::getFirstName);
    public static Comparator<Student> idNumberComparator
            = Comparator.comparing(Student::getIDNumber);

    @Override
    public String toString() {
        return "Student (IDnumber: " + idNumber + ", First Name: " + firstName;
    }
}
