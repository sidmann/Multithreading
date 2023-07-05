package pack1;

public class M23 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 1; i <= 1000; i++)
            {
                System.out.println(i);
            }
        }).start();
        new Thread(() -> {
            for (int i = 1000; i <= 2000; i++)
            {
                System.out.println(i);
            }
        }).start();
    }
}
