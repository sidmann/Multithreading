package pack1;

class S
{
    synchronized void test1()
    {
        Thread t1 = Thread.currentThread();
        for (int i = 1; i <= 100; i++)
        {
            System.out.println("test1:" + i + ":" + t1.getName());
        }
    }
    synchronized void test2()
    {
        Thread t1 = Thread.currentThread();
        for (int i = 500; i <= 600; i++)
        {
            System.out.println("test2:" + i + ":" + t1.getName());
        }
    }
}
public class M43 {
    static class A extends Thread
    {
        S s1;
        A(S s1)
        {
            this.s1 = s1;
        }

        @Override
        public void run() {
            s1.test1();
        }
    }
    static class B extends Thread
    {
        S s1;
        B(S s1)
        {
            this.s1 = s1;
        }

        @Override
        public void run() {
            s1.test2();
        }
    }
    public static void main(String[] args) {
        S s1 = new S();
        S s2 = new S();
        A a1 = new A(s1);
        a1.start();
        B b1 = new B(s2);
        b1.start();
    }
}
