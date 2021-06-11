
public class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 500; i < 550; i++) {
            System.out.println(i + "------------------------" + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
