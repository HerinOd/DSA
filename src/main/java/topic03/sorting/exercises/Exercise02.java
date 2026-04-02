package topic03.sorting.exercises;

import java.util.Scanner;
/*
Given a list of n students including student’s name and student’s mark (an integer in the range 0..10).
We want to find m students who have the highest marks.

Please write a Java program to solve this problem. Your program should:

Ask user to input n, list of student including name and mark.

Ask user to input an integer m

Show the name of m students who has the highest mark.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentsNumber = input.nextInt(); input.nextLine();
        Student[] students = new Student[studentsNumber];
        System.out.println("Enter the students' name and their marks: ");
        for (int i = 0; i < studentsNumber; i++) {
            System.out.println("Student " + (i+1) + ":");
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Mark: ");
            double mark = input.nextDouble(); input.nextLine();
            Student student = new Student(name, mark);
            students[i] = student;
        }
        sortStudentsDescendingMark(students);
        System.out.print("Enter the number of the highest marks and the students (m): ");
        int m = input.nextInt();
        System.out.println("Top " + m + ": ");
        for (int i = 0; i < m; i++) {
            System.out.println(students[i].getName() + ": " + students[i].getMark());
        }
    }

    public static void sortStudentsDescendingMark(Student[] students) {
        int arrayLength = students.length;
        for (int i = 1; i < arrayLength; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getMark() < key.getMark()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }
}

class Student {
    private final String name;
    private final double mark;

    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }
}
