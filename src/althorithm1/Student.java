package althorithm1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;
    int age;
    Student() {
    }
    Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, 19, "Hung");
        Student s2 = new Student(2, 20, "QUan");
        Student s3 = new Student(3, 30, "An");
        Student s4 = new Student(3, 31, "An");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //Todo: return id;

        //Todo: return age max

        //Todo: return về tên và tuổi sắp xếp giảm dần
    }
}
