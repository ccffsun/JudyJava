package thread;

public class Ticket extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            if(ticket > 0) {
                System.out.println(Thread.currentThread().getName()+".... sale: "+ ticket--);
            }
        }
    }
}