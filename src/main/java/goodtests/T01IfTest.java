package goodtests;

public class T01IfTest 
{
	public static void main(String[] args) 
	{

		/*
		���󣺸����û�ָ���ľ������ݣ��жϸ����ݶ�Ӧ�����ڡ�
		1-����һMonday

		˼·��
		�û������޷���ȡ������ֻ�Ǿ������ݵ�һ�ֻ�ȡ�ֶζ��ѡ�
		������Ҫ���Ĺ��ܽ����Ƕ��û�ָ�������ݽ��ж�Ӧ���ڵĴ�ӡ���ѡ�

		���Ծ�������ݲ�ȷ������ɿ���ʹ�ñ�������ʾ��

		����ֻ�Ա������в������ɡ����ڱ�����ֵ���������û�������

		��Ϊ���ݵĲ�ȷ���ԣ�����Ҫ�����ݽ����жϡ�
		ʹ��if��䡣
		*/

		int inputData = 111;
		if(inputData==1) 
			System.out.println(inputData + " Monday");
		else if (inputData ==2)              
			System.out.println(inputData + " Tunesday");
		else if (inputData ==3)              
			System.out.println(inputData + " Wednesday");
		else if (inputData ==4)              
			System.out.println(inputData + " Thursday");
		else if (inputData ==5)              
			System.out.println(inputData + " Friday");
		else if (inputData ==6)              
			System.out.println(inputData + " Saturday");
		else if (inputData ==7)              
			System.out.println(inputData + " Sunday");
		else {
			System.out.println(inputData + " No specific data");
		}
		
		
		int week = 10;
		if(week==1)
			System.out.println(week+"��Ӧ����������һ");
		else if(week==2)
			System.out.println(week+"��Ӧ���������ڶ�");
		else if(week==3)
			System.out.println(week+"��Ӧ������������");
		else if(week==4)
			System.out.println(week+"��Ӧ������������");
		else if(week==5)
			System.out.println(week+"��Ӧ������������");
		else if(week==6)
			System.out.println(week+"��Ӧ������������");
		else if(week==7)
			System.out.println(week+"��Ӧ������������");
		else
			System.out.println(week+"û�ж�Ӧ������");
		
	}
}
