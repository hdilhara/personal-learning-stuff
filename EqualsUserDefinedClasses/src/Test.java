import java.util.Objects;

public class Test {

    public static void main(String[] args) {
        Employee employee=new Employee(11,52,"Mike");

        employee.test();

    }
}

class Employee{
    int rollNo,age;
    String name;


    public void test(){
        System.out.println(this);
        System.out.println(getClass());
        System.out.println(Objects.hash("subcd",1122,"fdfd"));
        System.out.println(Objects.hash("sdsfdfd",1122,"fdfd"));
        System.out.println(Objects.hash(rollNo,age,name));
        System.out.println(Objects.hash(rollNo,age,name));
    }


    public Employee(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
