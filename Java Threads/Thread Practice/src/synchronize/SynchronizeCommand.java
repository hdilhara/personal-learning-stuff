package synchronize;

public class SynchronizeCommand {

    public static int count=0;
    public static int scount=0;
    /** non-Synchronize method**/
    public static void increCount(){
        count++;/**count=count+1;**/
    }       /** we cannot pass count as a argument to this method**/
                                                      /**because java pass by value **/
    /** Synchronize method**/
    public static synchronized void sinncrrCount(){scount++;}

   private static Thread t1=new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i=0;i<50000;i++)
            {increCount();
            sinncrrCount();
            }
        }
    });
    private static Thread t2=new Thread(()->{
        for(int i=0;i<10000;i++)
        {increCount();
        sinncrrCount();}});

    public static void main(String[] args) {

        t1.start();
        t2.start();


        System.out.println(count);/**This one gives random values **/
        System.out.println(scount);/**This one gives exact value because it run as synchronized**/
    }

}

