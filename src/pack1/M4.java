package pack1;

public class M4 {
    class D extends Thread
    {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++)
            {
                System.out.println(getName() + ":" + i);
            }
        }
    }

    public static void main(String[] args) {
        M4 obj = new M4();
        D d1 = obj.new D();
        d1.start();
        D d2 = obj.new D();
        d2.start();
        D d3 = obj.new D();
        d3.start();
    }
}
