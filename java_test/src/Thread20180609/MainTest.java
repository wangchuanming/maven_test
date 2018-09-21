package Thread20180609;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    /*  RunnableDemo R1 = new RunnableDemo( "Thread-1");
     
      RunnableDemo R2 = new RunnableDemo( "Thread-2");
      Thread qw=new Thread(R1);
      Thread qw1=new Thread(R2);
      qw.start();
      qw1.start();
      
	 System.out.println("来啊");*/
    
		Runnable myRunnable = new Runnable(){
			   public void run(){
				   try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			     System.out.println("Runnable running");
			   }
			};
			Thread thread = new Thread(myRunnable);
			thread.start();
			System.out.println("laia");
	}
	public class Qaq implements Runnable
	{

		@Override
		public void run() {
			// TODO 自动生成的方法存根
			
		}
		
	}
	
	
}
