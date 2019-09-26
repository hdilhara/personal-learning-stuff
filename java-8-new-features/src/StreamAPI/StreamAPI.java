package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,333333,4,5);
        //list.stream().forEach(i-> System.out.println(i*2));


        System.out.println(list.stream());


    }
}
