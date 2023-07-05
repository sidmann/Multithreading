package pack1;

public class M3 {
	static class C extends Thread
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
		C c1 = new C();
		c1.start();
		
		C c2 = new C();
		c2.start();
		
		C c3 = new C();
		c3.start();
	}
}
