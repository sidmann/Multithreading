package pack1;

public class M8 {
    static Thread f1()
    {
        return new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 1; i < 1000; i++)
                {
                    System.out.println(getName() + ":" + i);
                }
            }
        };
    }

    public static void main(String[] args) {
//        Thread obj;
//        for (int i = 1; i <= 4; i++)
//        {
//            obj = f1();
//            obj.start();
//        }

        for (int i = 1; i <= 4; i++)
        {
            f1().start();
        }
    }
}
