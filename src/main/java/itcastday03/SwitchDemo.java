package itcastday03;

class SwitchDemo
{
	public static void main(String[] args)
	{

		/**
		 * <pre>
		 *  four types keywords
		switch(����ʽ)
		{
			case ȡֵ1:
				ִ����䣻
				break��
			case ȡֵ2:
				ִ����䣻
				break��
			��...
			default:
				ִ����䣻
				break��
		}
		 * </pre>
		 */
		int x = 2;
		switch (x)
		{// byte,short,int,char.
			default:
				System.out.println("d");
				// break
			case 4:
				System.out.println("a");
				// break;
			case 1:
				System.out.println("b");
				// break;
			case 3:
				System.out.println("c");
				// break;
		}

		int a = 4, b = 2;
		char opr = '+';
		// lecture
		switch (opr)
		{
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;
			default:
				System.out.println("�޷�����,���Ų�֧��");
				break;
		}

		String aString = "a";
		switch (aString)
		{
			case "a":
				break;
			case "b":
				break;
			default:
				break;
		}
	}
}