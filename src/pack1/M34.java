package pack1;

public class M34 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getPriority());
        t1.setPriority(6);
        System.out.println(t1.getPriority());
    }
}
