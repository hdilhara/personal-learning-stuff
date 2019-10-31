package comparableTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTypes {
    public static void main(String[] args) {

        /**String and wrapper classess (Object class) implement Comparable interface defaultly
         * so they are Comparable types
         */

        List<Integer> integerList= Arrays.asList(125,484,647,2,378,3,77) ;
        List<String> stringList=Arrays.asList("fdfsd","sdsf","Thilina","Shalitha","Hida","Lsfsd");

        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
        Collections.sort(integerList,Collections.reverseOrder());
        System.out.println(integerList);

        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);
    }
}
