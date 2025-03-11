class MyT extends Thread
{
	@Override
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Thread running: " + i);
				
			try
			{
				Thread.sleep(1000);
			} 
			catch(InterruptedException e)
			{
				System.out.println("Thread interrupted");
			}
		}
	}
}

public class Sleep_func
{
	public static void main(String[] args)
	{
		MyT myT = new MyT();
		myT.start();
	}
}