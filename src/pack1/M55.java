package pack1;

public class M55 {
    static class A extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println("run:" + i);
            }
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.setDaemon(true);
        a1.start();
        System.out.println("done");
    }
}
