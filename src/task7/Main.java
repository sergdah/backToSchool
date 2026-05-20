package task7;

public class Main {
    public static void main(String[] args) {
        // cоздание массива из пяти студентов

        Student[] students = new Student[5];

        students[0] = new Student(1, 1, 10, "Monty", "Hamilton", "RTU", "85");
        students[1] = new Student(2, 3, 13, "Pyt", "Cherchil", "NFG", "92");
        students[2] = new Student(3, 6, 2, "Grock", "McFry", "KTF", "78");
        students[3] = new Student(4, 2, 7, "Ferdinand", "Fergusson", "ФИO", "88");
        students[4] = new Student(5, 1, 4, "Irina", "Zhakh", "KTF", "72");


        System.out.println("*** ALL STUDENTS ***\n");
        for (Student student : students) {
            student.info();
        }

        //вывод успевающих студентов
        int lowMark = 3;
        Student[] bestStudents = Student.getStudents(students, lowMark);
        System.out.println();
        System.out.println("*** BEST STUDENTS ***\n");
        for (Student student : bestStudents) {
            student.info();
        }


    }
}