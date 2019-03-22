public class DemoRunnable implements Runnable {

    public boolean isComplited;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Runnable demo");
        isComplited = true;
    }
}
