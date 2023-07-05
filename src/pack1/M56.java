package pack1;

public class M56 {
    static class A extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println("run:" + i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        A a1 = new A();
        a1.start();
        a1.join();
        System.out.println("done");
    }
}
