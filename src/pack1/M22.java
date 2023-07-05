package pack1;

public class M22 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 1000; i++)
                {
                    System.out.println(i);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++)
                {
                    System.out.println(i);
                }
            }
        }).start();
    }
}
