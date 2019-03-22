public class DemoThread extends Thread {

    String name;
    int counter;

    public void run(){
        System.out.println(currentThread().getName() + "Thread name");
    }

}
