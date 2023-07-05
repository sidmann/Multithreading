package pack1;

class B extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++)
        {
            System.out.println(getName() + ":" + i);
        }
    }
}
public class M2 {
    public static void main(String[] args) {
        B b1 = new B();  // for the same class B we can develop any number of threads.
        b1.start();

        B b2 = new B();
        b2.start();

        B b3 = new B();
        b3.start();
        for (int i = 2000; i <= 3000; i++)
        {
            System.out.println("main:" + i);
        }
    }
}
