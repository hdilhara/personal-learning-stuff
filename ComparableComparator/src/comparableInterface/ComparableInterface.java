package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {

    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();

        students.add(new Student(001,"Thilina",24));
        students.add(new Student(072,"Shalitha",26));
        students.add(new Student(055,"Mike",17));
        students.add(new Student(041,"Jackob",12));

        /**User defined classes are not defaultly comparable types
         * so we need to make it comparable by implementing comparable
         * interface
         */
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

        /** String class is already comparable type so it have compareTo() method already**/
        String str="Thilina"+" "+"Dilhara";
        System.out.println(str);
        System.out.println(str.compareTo("f"));
        System.out.println(str.compareTo("Thilina Dilhara"));//if both  strings are matched compareTo returns 0
        System.out.println(str.equals("Thilina dilhara"));
        System.out.println(str.equals("Thilina Dilhara"));

    }
}

class Student implements Comparable<Student>{/**make student comparable type**/
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override/**Override only method it has**/
    public int compareTo(Student s) {/**Sorting according to the age ascending order**/
        if(age<s.age)
            return -1;
        else if(age>s.age)
            return 1;
        else
            return 0;
    }
    /**@Override  //sorting according to the student name
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }**/

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}