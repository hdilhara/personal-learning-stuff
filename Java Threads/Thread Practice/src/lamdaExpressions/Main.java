package lamdaExpressions;


public class Main {

    public static void main(String[] args) {
//        Runnable hi=new Hi();  /*****Craeting runnable objects ****/
//        Runnable hello = new Hello();

        Thread t1 =new Thread(()->{         /****** Create Thread objects for pass Runnables */
            for(int i=0;i<5;i++){
                System.out.println("Hi...");
                try {Thread.sleep(500); } catch (Exception e){}
            }
        });
        Thread t2 =new Thread(()->{
                for(int i=0;i<5;i++){
                System.out.println("Hello...");
                try {Thread.sleep(500);} catch (Exception e){}
        }
        });

        t1.start();
        t2.start();
    }

}


//
//class Hi implements Runnable{   /***** implementing Runnable interface ***/
//public void run(){
//    for(int i=0;i<5;i++){
//        System.out.println("Hi...");
//        try {Thread.sleep(500); } catch (Exception e){}
//    }
//}
//}
//
//class Hello implements Runnable{
//    public void run(){
//        for(int i=0;i<5;i++){
//            System.out.println("Hello...");
//            try {Thread.sleep(500);} catch (Exception e){}
//        }
//    }
//}
//
