package itcastday12;

/*
1:definition  -- 01-���߳�(����).avi (12: 6)
	���̣����ڽ����еĳ���(ֱ��). ֻ���俪Ӧ�ó����Ӧ�ÿռ�
	�̣߳����ǽ�����һ���������ִ�еĿ��Ƶ�Ԫ(ִ��·��)��һ�������п��Զ�ִ��·������֮Ϊ���̡߳�
		 ÿһ���̶߳����Լ����е����ݡ�������ݿ��Գ�Ϊ�߳�Ҫִ�е�����
	��ϵ��һ������������Ҫ��һ���̣߳���������߳���Ϊ��ͬʱ���жಿ�ִ��롣

2��Pro and Con -- 02-���߳�(�ô���׶�).avi ( 9:31)
	�ô�������˶ಿ��ͬʱ���е����⡣
	�׶ˣ��߳�̫��ص�Ч�ʵĽ��͡���ʵӦ�ó����ִ�ж���cpu�����ſ��ٵ��л���ɵġ�����л�������ġ�

3: JVM multithreading --  03-���߳�(JVM�еĶ��߳̽���).avi (17:13)
	JVM����ʱ�������˶���̣߳������������߳̿��Է����ĳ�����
		1��ִ��main�������̣߳�
				���̵߳�������붼������main�����С�
		2�������������յ��̡߳�
	eg: ThreadDemo ����main�Ͷ������������������һ���������������͵��ű����յġ�
		tips:�������ջ�û������������Ϳ���ֱ�ӹرգ��Ͳ������������ˣ�������ʱֻ���һ��������ֵ�� ThreadDemo �еĽ����
*/

class Demo extends Object
{
	public void finalize()
	{
		System.out.println("demo ok");
	}
}


class  ThreadDemo
{
	public static void main(String[] args) 
	{

		System.out.println("Hello World!");
		new Demo();
		new Demo();
		new Demo();
		System.gc();
	}
}