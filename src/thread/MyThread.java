package thread;

public class MyThread implements Runnable {
    int k;
    public MyThread(int i ){
        k=i;
    }

    @Override
    public void run() {
        System.out.println("Thread "+k);
    }
}
