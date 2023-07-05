package pack1;

public class M7 {
    static Thread t1() {
        Thread obj = new Thread() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println(getName() + ":" + i);
                }
            }
        };
        return obj;
    }

    public static void main(String[] args) {
        Thread ref1 = t1();
        Thread ref2 = t1();
        Thread ref3 = t1();
        ref1.start();
        ref2.start();
        ref3.start();
    }
}
