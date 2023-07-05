package pack1;

class Test {
    int i;
}

public class M51 {
    static class A extends Thread {
        Test t;

        A(Test t) {
            this.t = t;
        }

        public void run() {
            System.out.println("A1:" + t.i);
            t.i = 10;
            Util.sleep(200);

            System.out.println("A2:" + t.i);
            t.i = 20;
            Util.sleep(200);

            System.out.println("A3:" + t.i);
            t.i = 30;
            Util.sleep(200);

            System.out.println("A4:" + t.i);
            t.i = 40;
            Util.sleep(200);
        }
    }

    static class B extends Thread {
        Test t;

        B(Test t) {
            this.t = t;
        }

        public void run() {
            System.out.println("B1:" + t.i);
            t.i = 110;
            Util.sleep(200);

            System.out.println("B2:" + t.i);
            t.i = 120;
            Util.sleep(200);

            System.out.println("B3:" + t.i);
            t.i = 130;
            Util.sleep(200);

            System.out.println("B4:" + t.i);
            t.i = 140;
            Util.sleep(200);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.i = 900;
        A a1 = new A(t);
        a1.start();
        Util.sleep(100);
        B b1 = new B(t);
        b1.start();
    }
}
