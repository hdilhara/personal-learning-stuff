import org.w3c.dom.ls.LSOutput;


        /**Threads can be created by using two mechanisms :
                1. Extending the Thread class
        2. Implementing the Runnable Interface
        **/
public class Main {

    public static void main(String[] args) {
        Hi hi=new Hi();
        Hello hello = new Hello();

        hi.start();
        hello.start();
    }

}

class Hi extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi...");
            try {Thread.sleep(500); } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class Hello extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello...");
            try {Thread.sleep(500);} catch (Exception e){}
        }
    }
}
