package pack1;

public class M31 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getPriority());
        t1.setPriority(10); // we can modify/ set between 1 (min. priority) to 10 (max. priority)
        System.out.println(t1.getPriority());
    }
}
// main thread priority by default is a 5 (normal priority), but we can change it.