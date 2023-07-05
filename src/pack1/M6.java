package pack1;

public class M6 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 1000; i++) {
                    System.out.println(getName() + ":" + i);
                }
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    System.out.println(getName() + ":" + i);
                }
            }
        };
        t2.start();
        Thread t3 = new Thread() {
            @Override
            public void run() {
                for (int i = 2000; i < 3000; i++) {
                    System.out.println(getName() + ":" + i);
                }
            }
        };
        t3.start();
    }
}

