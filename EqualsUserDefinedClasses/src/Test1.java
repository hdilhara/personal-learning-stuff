import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {



        Integer i1=-129;
        Integer i2=-129;

        Integer i3=128;
        Integer i4=128;

        System.out.println(i1==i2);
        System.out.println(i3==i4);
        System.out.println(i3.equals(i4));
        System.out.println(Objects.equals(i3,i4));
    }
}
