package day045;

class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[] arr = new int[3];
		// �����ʵ������в����ڵĽǱ�ʱ���ͻᷢ�����쳣��
		System.out.println(arr[3]);// ArrayIndexOutOfBoundsException:

		// �������ͱ���û���κ�ʵ��ָ��ʱ�������������ʵ�塣�ͻᷢ�����쳣��
		arr = null;
		System.out.println(arr[0]);// NullPointerException

		System.out.println(arr);// [I@c17164

	}
}