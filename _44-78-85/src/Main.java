
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /////
//        Exception gg = new Exception();
//        gg.ExceptionHandling();

        /////
//        Outside out = new Outside();
//        Outside.Inside in = out.new Inside();
//        in.Greeting();

        /////

        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);

        thread1.start();
        thread1.join(3000);  //wait until the other thread dies
        thread2.start();
        }
    }
