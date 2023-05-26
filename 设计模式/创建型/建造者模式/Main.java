package 设计模式.创建型.建造者模式;

public class Main {
    public static void main(String[] args) {
        Student student = Student.getStudentBuilder()
                .id(1)
                .name("君陌")
                .age(18)
                .grade(3)
                .college("书院")
                .addAwards("LPL 2023春季赛冠军")
                .addAwards("LPL 2023夏季赛冠军")
                .ToStudent();
        System.out.println(student.toString());
    }
}
