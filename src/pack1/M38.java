package pack1;

public class M38 {
    static class A extends Thread
    {
        A(String name)
        {
            super(name);
        }
        @Override
        public void run() {
            Thread t1 = Thread.currentThread();
            System.out.println(t1.getId());
            System.out.println(t1.getName());
            System.out.println(t1.getPriority());
            System.out.println(t1.isDaemon());
        }
    }

    public static void main(String[] args) {
        A a1 = new A("child");
        a1.start();
    }
}
