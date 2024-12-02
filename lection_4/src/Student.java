import java.util.Arrays;

class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageScore() {
        return Arrays.stream(grades).average().orElse(0);
    }

    public  void printStudents() {
        System.out.println("Student{name='" + name + "', group='" + group + "', course=" + course +
                ", grades=" + Arrays.toString(grades) + '}');
    }

}