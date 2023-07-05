package pack1;

public class M19 extends Thread {  // current class is a subclass to Thread class.
    M19()
    {
        start();
    }
    public void run()
    {
        for (int i = 1; i <= 1000; i++)
        {
            System.out.println(getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        new M19();
        new M19();
        new M19();
        new M19();
    }
}
