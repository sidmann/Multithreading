package pack1;

public class M18 extends Thread {  // current class is a subclass to Thread class.
    public void run()
    {
        for (int i = 1; i <= 1000; i++)
        {
            System.out.println(getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        new M18().start();
        new M18().start();
        new M18().start();
        new M18().start();
    }
}
