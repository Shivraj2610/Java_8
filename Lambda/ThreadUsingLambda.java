package Lambda;

public class ThreadUsingLambda {
    public static void main(String[] args) {
        Runnable thread1 = () -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("the value of i is: " + i);

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        };
        Thread t1 = new Thread(thread1);
        t1.start();
    }
}
