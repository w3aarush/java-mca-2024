/**
 * Syntax of creating a single thread

class My_thread_name extends Thread
{
	// data will go here
	// -- data declarations
	public void run()	// method of runnable interface
	{
		// override the method to write statement of thread
	}
}

class My_class_name
{
	public static void main(String[] args) {
		My_thread_name t = new My_thread_name();
		t.start();
	}
}
==========================================================================================
------------------------------------------------------------------------------------------
*/

/*
Q.-> WAP to define a thread to produce 1 to 10 with running single thread name and value.
==========================================================================================
------------------------------------------------------------------------------------------
*/

class MyThread extends Thread
{
	String tname;
	MyThread(String x)
	{
		tname = x;
	}
	public void run()
	{
		int i;
		try
		{
			System.out.println("Running thread : " + tname);
			for(i=1; i<=10; i++)
			{
				System.out.println("Value = " + i);
				Thread.sleep(100);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Thread interupted " + ex.getMessage());
		}
	}
}

class ExampleThread
{
	public static void main(String[] args) {
		MyThread mt = new MyThread("Print");
		mt.start();
	}
}