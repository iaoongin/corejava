package exercises;

public class ThreadGroupTest extends Thread{

	public ThreadGroupTest(ThreadGroup group,String name) {
		super(group, name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			i++;
		}
	}
	
	public static void main(String[] args) {

		// 获得main方法所在线程组
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		// 打印主线程所在组 名字，是否为后台线程
		System.out.println("主线程所在组 " + group.getName());
		System.out.println("是否为后台线程 " + group.isDaemon());

		// 创建新的线程组
		ThreadGroup tgDaemon = new ThreadGroup("苹果树线程组");
		tgDaemon.setDaemon(true);
		// 创建新的线程到指定线程组
		Thread thread = new ThreadGroupTest(tgDaemon, "苹果线程");
		thread.start();
		ThreadGroup group2 = thread.getThreadGroup();
		System.out.println(thread.getName()+" 所在线程组 "+group2.getName());
		System.out.println(thread.getName()+" 是否为后台线程"+thread.isDaemon());//后台线程组内线程可以有非后台线程
		System.out.println(group2.getName()+" 是否为后台线程组 "+group2.isDaemon());
		
		
		System.out.println("------");
		
		// 创建新的线程组
		ThreadGroup tgNormal = new ThreadGroup("普通线程组");
		// 创建新的线程到指定线程组
		Thread tDaemon = new ThreadGroupTest(tgNormal, "后台线程");
		tDaemon.setDaemon(true);
		tDaemon.start();
		System.out.println(tDaemon.getName()+" 所在线程组 "+tgNormal.getName());
		System.out.println(tDaemon.getName()+" 是否为后台线程"+tDaemon.isDaemon());//后台线程组内线程可以有非后台线程
		System.out.println(tgNormal.getName()+" 是否为后台线程组 "+tgNormal.isDaemon());
	}

}
