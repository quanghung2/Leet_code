package althorithm1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, 19, "Hung");
        Student s2 = new Student(2, 20, "QUan");
        Student s4 = new Student(3, 31, "An");
        Student s3 = new Student(3, 30, "An");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s4);
        list.add(s3);

        //Todo: return id;
        getId(list).forEach(System.out::println);

        //Todo: return age max
        System.out.println(getAgeMax(list));

        //Todo: return về tên và tuổi sắp xếp giảm dần
        getNameAndAgeIsDes(list).forEach(p -> System.out.println(p.age));

    }

    public static List<Integer> getId(List<Student> list) {
        return list.stream().map(s -> s.id).collect(Collectors.toList());
    }

    public static int getAgeMax(List<Student> list) {
        return list.stream().map(s -> s.age).reduce(0, Integer::max);
    }

    public static List<Response> getNameAndAgeIsDes(List<Student> list) {
        return list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).map(Response::new).collect(Collectors.toList());
    }

    public static class Response {
        String name;
        int age;
        Response() {}
        Response(Student student) {
            this.name = student.name;
            this.age = student.age;
        }
    }
}
