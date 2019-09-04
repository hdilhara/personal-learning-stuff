package join_isAlive;

public class Main {

    public static void main(String[] args) {
        Thread t1 =new Thread(()->{
            for(int i=0; i<5;i++)
            System.out.println("Hi....");
        });

        Thread t2 =new Thread(()->{
            for(int i=0; i<5;i++)
            System.out.println("Hello...");
        });

        t1.start();
        try{Thread.sleep(1000);}catch(InterruptedException e){}
        System.out.println("This is main method!");
        t2.start();


        try{
            t1.join();
            System.out.println("t1 is Aliva ->>>"+t1.isAlive());
            System.out.println("t2 is Aliva ->>>"+t2.isAlive());
            t2.join();
        }
        catch(Exception e){}

        System.out.println("This is main method! After join()");
        System.out.println("t1 is Aliva ->>>"+t1.isAlive());
        System.out.println("t2 is Aliva ->>>"+t2.isAlive());
    }


}
