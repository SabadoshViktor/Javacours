public class Demo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("current thread " + Thread.currentThread().getName());
//        DemoThread thread = new DemoThread();
//     //   thread.run();  это не правильно так как это будеть не в новом потоке
//        thread.start();

        Runnable r = () -> {
            System.out.println("Hello World");
        };
        Thread t = new Thread(r);



        DemoRunnable dr = new DemoRunnable();
        Thread thread1 = new Thread(dr);
        thread1.start();
        thread1.join();
        Thread.sleep(10);
       System.out.println("is completed " + dr.isComplited);
        System.out.println(t);

    }
}
