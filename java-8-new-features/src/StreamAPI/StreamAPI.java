package StreamAPI;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        //list.stream().forEach(i-> System.out.println(i*2));


//        Function<Integer,Integer> function=new Function<Integer,Integer>(){
//            @Override
//            public Integer apply(Integer i) {
//                i=i*2;
//                return i;
//            }
//        };
//        BinaryOperator<Integer> binaryOperator=new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return  integer+integer2;
//            }
//        };
//
//        Optional<Integer> ii=list.stream().map(i->i*2).reduce((i1, i2)->i1+i2);
//        System.out.println(ii.ifPresent(););

        Stream<Integer> stream=list.stream();
        Optional<Integer> iii=stream.map(i->2).reduce((i,ii)->i+ii);
        System.out.println(iii.get());

        Optional<Integer> ii=list.stream().map(i->2).reduce((i, j)->i+j);
        System.out.println(ii.get());

        List<Integer> list1=list.stream().map(i->2).collect(Collectors.toList());
        System.out.println(list1);

        List<String> list2=Arrays.asList("Thilina","Dilhara","Shalitha");
        Optional<String > str2=list2.stream().map(i->i.toUpperCase()).reduce((i,ji)->i+ji);
        System.out.println(str2);

        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer>250)
                    return true;
                else
                return false;
            }
        };
        List<Integer> list3=Arrays.asList(250,52,202,152,558,88,444);
        System.out.println(list3);
        list3=list3.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(list3);

        list3=Arrays.asList(250,52,202,152,558,88,444);
        System.out.println(list3);
        list3=list3.stream().map(i->i+100).filter(i->i>250).collect(Collectors.toList());
        System.out.println(list3);

        list3=Arrays.asList(250,52,202,152,558,88,444);
        System.out.println(list3);
        list3=list3.stream().filter(i->i<250).map(i->250).collect(Collectors.toList());
        System.out.println(list3);

        list3=Arrays.asList(250,52,202,152,558,88,444);
        System.out.println(list3);
        System.out.println(list3.stream().filter(i->i<250).findFirst().get());
        System.out.println(list3.stream().filter(i->i<250).findFirst().orElse(51));

        list3=Arrays.asList(250,52,202,152,558,88,444);
        System.out.println(list3);
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if (o1>o2)
                return 1;
               else if(o1<o2)
                   return -1;
               else
                   return 0;
            }
        };
        System.out.println("max Value :"+list3.stream().max(comparator));

        list3=Arrays.asList(250,52,202,152,558,88,444);
        System.out.println(list3);
        System.out.println(list3.stream().min((i,j)->{if(i>j){return 1;}else if(i<j){return -1;}else {return 0;}}) );



        //sorting look 







    }
}
