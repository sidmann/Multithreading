package pack1;

public class M21 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 1; i < 1000; i++)
            {
                System.out.println(i);
            }
        };
        new Thread(r1).start();
        new Thread(r1).start();
        new Thread(r1).start();
        new Thread(r1).start();
    }
}
