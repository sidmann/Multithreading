package pack1;

public class M30 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());
        t1.setName("some-thread");
        System.out.println(t1.getName());
    }
}
// ID of any thread can't be change & it is also unique & random.
// Two threads will not be having same ID.
// ID is a long number.