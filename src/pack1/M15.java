package pack1;

public class M15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 1; i <= 1000; i++) {
                        System.out.println("run:" + i);
                    }
                }
            }).start();
        }
    }
}
