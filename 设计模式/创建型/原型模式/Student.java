package 设计模式.创建型.原型模式;

public class Student implements Cloneable {
    int id;
    String name;

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }


    /**
     * 原型模式要实现深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.name = new String(name);
        return student;

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(1,"小明");
        Student student2 = (Student) student1.clone();
        System.out.println(student1.name );
    }
}
