package day15.p1.string;

/*
 * 4��ģ��һ��trim����һ�µķ�����ȥ���ַ������˵Ŀհ�
 *
 * ˼·��
 * 1����������������
 * һ��������Ϊ��ͷ��ʼ�ж��ַ����ո�ĽǱꡣ����++��
 * һ��������Ϊ��β��ʼ�ж��ַ����ո�ĽǱꡣ����--��
 * 2,�жϵ����ǿո�Ϊֹ��ȡͷβ֮����ַ������ɡ�
 */
public class StringTest_4
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		String s = "       abc    ";

		s = StringTest_4.myTrim(s);
		System.out.println(s);

	}

	public static String myTrim(String s)
	{

		int start = 0, end = s.length() - 1;

		while (start <= end && s.charAt(start) == ' ')
		{
			start++;
		}
		while (start <= end && s.charAt(end) == ' ')
		{
			end--;
		}
		return s.substring(start, end + 1);
	}

}