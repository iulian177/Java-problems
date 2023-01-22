
public class MyThread extends Thread{

    //85
    int nr;

    public MyThread(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        if (nr == 1) {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread #1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //System.out.println(1/0);
            }
            System.out.println("Thread #1 is finished");


        }
        if (nr == 2) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("Thread #2: " + j);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Thread #2 is finished");
        }
    }
}
