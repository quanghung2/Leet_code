package althorithm1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;

    public int getId() {
        return id;
    }

    int age;
    Student() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
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

    public static Object main(String[] args) {
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
        public void listId(List<Student> list){
          list.stream().forEach(i -> System.out.println(i.getId());
        }

        //Todo: return age max
        public int maxAge(List<Student> list){
            return list.stream().reduce(Integer::max);
        }
        //Todo: return về tên và tuổi sắp xếp giảm dần
        public List<Student> sortByNameAndAge(List<Student> list){
            List<Student> result = list.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName()));
            return result;
        }
    }
}