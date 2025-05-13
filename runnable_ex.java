class ex implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Thread is running");
	}
}

public class runnable_ex
{
	public static void main(String[] args)
	{
		ex obj = new ex();
		Thread thread = new Thread(obj);
		thread.start();
	}
}