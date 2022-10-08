/*
Составляем список студентов
Метод main должен добавлять двух студентов в массив и выводить их
в консоль с помощью метода printStudents.
Сделай исправления в методе main, чтобы программа заработала.
*/

public class University {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        University university = new University();
        university.addStudent("Максим Федоренко");
        university.addStudent("Олег Кесарчук");
        university.printStudents();
    }
}