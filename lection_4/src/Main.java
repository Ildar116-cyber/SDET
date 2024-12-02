
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Создаем список студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "ИС-22", 3, new int[]{4, 3, 5, 4, 4}));
        students.add(new Student("Биба", "ПМ-21", 4, new int[]{2, 2, 2, 3, 1}));
        students.add(new Student("Боба", "ПМ-22", 3, new int[]{5, 5, 5, 4, 4}));
        students.add(new Student("Ильдар", "КБ-21", 4, new int[]{4, 4, 5, 3, 4}));
        students.add(new Student("Артем", "ИС-23", 2, new int[]{2, 4, 5, 2, 0}));
        students.add(new Student("Антон", "КБ-24", 1, new int[]{5, 4, 5, 5, 5}));

        System.out.println("Список студентов до сессии:");
        students.forEach(Student::printStudents);
        System.out.println();

        sessionStudents(students, 3);

        System.out.println("\nСписок студентов после сессии:");
        students.forEach(Student::printStudents);




        int courseToPrint = 2;
        System.out.println("\nСтуденты, обучающиеся на курсе " + courseToPrint + ":");
        printStudents(students, courseToPrint);
    }


    public static void sessionStudents(List<Student> students, int limit) {
        System.out.println("Список отчисленных студентов : ");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageScore() < limit) {
                System.out.println(student.getName() + "    " +student.getGroup());
                iterator.remove();
            } else if (student.getAverageScore()>=3){
                student.setCourse(student.getCourse() + 1);
            }
        }
    }


    public static void printStudents(List<Student> students, int course) {

        students.stream()
                .filter(student -> student.getCourse() == course)
                .map(Student::getName)
                .forEach(System.out::println);
    }
}