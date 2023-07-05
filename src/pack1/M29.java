package pack1;

public class M29 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName()); // for main thread it always gives name.
        System.out.println(t1.getId()); // for main thread it gives random number.
        System.out.println(t1.getPriority()); // for main thread it always gives 5.
        System.out.println(t1.isDaemon()); // for main thread it always gives false.
    }
}
// user thread is a thread which is not depending on its parent.
// main thread is always user.
// main thread can't be converted into daemon because main thread is already started.
// In java by default every thread is a user thread.
// Before starting, you can convert into daemon.