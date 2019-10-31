package comparatorInterface;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorInterface {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(114,7,455,47,26,9699,7);
//        list=list.stream().sorted().collect(Collectors.toList());

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(052,"Thilina",25));
        employeeList.add(new Employee(885,"Mike",55));
        employeeList.add(new Employee(041,"Shalitha",15));
        employeeList.add(new Employee(012,"Suranga",5));
        employeeList.add(new Employee(002,"Chamara",45));


        EmployeeAgeComparator employeeAgeComparator=new EmployeeAgeComparator();

        System.out.println(employeeList);

        System.out.println("AgeComparator");
        Collections.sort(employeeList,employeeAgeComparator);
        System.out.println(employeeList);


        System.out.println("RollComparator");
        Collections.sort(employeeList,(i,j)->{if(i.rolNo<j.rolNo)/**Comparator implementing using lamda**/
        return -1;
        else if (i.rolNo>j.rolNo)
            return 1;
        else
            return 0;

        });
        System.out.println(employeeList);

        System.out.println("NameComparator");
        Comparator Namecomparator =new Comparator() {/**Comparator implmenting with Annonymouse class**/
            @Override/**In here we didn't mentioned Genarics types || Comparator<Employee> comp=new Comparator()<>{};**/
            public int compare(Object o1, Object o2) {
                Employee e1=(Employee)o1;/**So we get Employees with Object classes so we have to cast it to type Employee**/
                Employee e2=(Employee)o2;

                return e1.name.compareTo(e2.name);
            }
        };
        Collections.sort(employeeList,Namecomparator);
        System.out.println(employeeList);
    }
}

class Employee{
    int rolNo;
    String name;
    int age;

    public Employee(int rolNo, String name, int age) {
        this.rolNo = rolNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rolNo=" + rolNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class EmployeeAgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.age>e2.age)
            return 1;
        else if(e1.age<e2.age)
            return -1;
        else
            return 0;
    }
}

