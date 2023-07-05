package pack1;

public class M35 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getPriority());
        t1.setPriority(11);
        System.out.println(t1.getPriority());
    }
}

