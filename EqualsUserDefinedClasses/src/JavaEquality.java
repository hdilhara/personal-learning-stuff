import java.util.Objects;

public class JavaEquality {
    public static void main(String[] args) {
/**
 * https://www.javatpoint.com/java-string-equals
 * https://www.geeksforgeeks.org/difference-equals-method-java/
 * https://www.geeksforgeeks.org/data-types-in-java/
 */
        int a=1218;
        int b=1218;
        System.out.println(a==b);

        Integer i=127;
        Integer j=127;
        Integer i1=128;
        Integer j1=128;


        String s1="Thilina";
        String s2="Thilina";

        Object o1="sdfdsf";
        Object o2="sdfdsf";

        Student student1=new Student(14,25,"Thilina");
        Student student2=new Student(14,25,"Thilina");


        System.out.println(i.equals(j));
        System.out.println(i==j);
        System.out.println(i1.equals(j1));
        System.out.println(i1==j1);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(o1.equals(o2));
        System.out.println(student1.equals(student2));

    }
}

class Student{

    int rollNo,age;
    String name;

    public Student(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo &&
                age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, age, name);
    }
}