package pack1;

public class M26 {
    static class A extends Thread
    {
        @Override
        public void run() {
            for (int i = 1; i <= 1000; i++)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.start();
        System.out.println("------------");
//        a1.start(); // exception occurs
        System.out.println("main end");
    }
}
// same thread can't be started more than one time.