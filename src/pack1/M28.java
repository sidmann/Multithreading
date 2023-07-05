package pack1;

public class M28 {
    static class A extends Thread
    {
        @Override
        public void run() {
            System.out.println("child started");
            System.out.println("child ended");
        }
    }

    public static void main(String[] args) {
        System.out.println("main started");
        A a1 = new A();
        a1.start();
        int i = 10 / 0;
        System.out.println("main ended");
    }
}
