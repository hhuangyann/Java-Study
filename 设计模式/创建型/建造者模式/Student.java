package 设计模式.创建型.建造者模式;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;

    private String name;

    private int age;

    private int grade;

    private String college;

    private List<String> awards;

    private Student(int id, String name, int age, int grade, String college, List<String> awards) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.college = college;
        this.awards = awards;
    }

    public static StudentBuilder getStudentBuilder(){
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", college='" + college + '\'' +
                ", awards=" + awards +
                '}';
    }

    public static class StudentBuilder {
        private int id;

        private String name;

        private int age;

        private int grade;

        private String college;

        private List<String> awards = new ArrayList<>();

        public StudentBuilder id(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public StudentBuilder college(String college) {
            this.college = college;
            return this;
        }

        public StudentBuilder addAwards(String award) {
            awards.add(award);
            return this;
        }

        public Student ToStudent() {
            return new Student(id,name,age,grade,college,awards);
        }

    }
}
