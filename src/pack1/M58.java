package pack1;

public class M58 {
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
        System.out.println("state1:" + a1.getState());
        a1.start();
        System.out.println("state2:" + a1.getState());
        Util.sleep(1);
        System.out.println("state3:" + a1.getState());
        Util.sleep(1000);
        System.out.println("state4:" + a1.getState());
    }
}
