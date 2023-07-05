package pack1;

class A extends Thread
{
	public void run()
	{
		for (int i = 1; i <= 1000; i++)
		{
			System.out.println("run:" + i);
		}
	}
}
public class M1 {
	public static void main(String[] args) {  // main thread is executing (parent thread)
		System.out.println("main begin");
		A a1 = new A();  // new thread is creating (child thread) [a1 is pointing to one thread & that thread acting as a child to main thread]
		a1.start();  // start() method is inherited method from the thread class.
		for (int i = 2000; i <= 3000; i++)
		{
			System.out.println("main:" + i);
		}
		System.out.println("main end");
	}
}
