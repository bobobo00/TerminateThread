package thread;
/**
 * ��ֹ�߳�
 * 1���߳�����ִ�����--������
 * 2���ⲿ����--�������ʶ
 * ��Ҫʹ��stop(),destroy()����
 * @author dell
 *
 */
public class TerminateThread implements Runnable{
    private  boolean flag=true;
    private String name;
	public TerminateThread(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(flag) {
			System.out.println(name+"--->"+i++);
		}
		
	}
	public void terminate() {
		this.flag=false;
	}
	public static void main(String[] args) {
		TerminateThread thread=new TerminateThread("aa");
		new Thread(thread).start();
		for(int i=0;i<=99;i++) {
			if(i==88) {
				thread.terminate();
				System.out.println("game over");
			}
			System.out.println("main-->"+i);
		}
	}

}
