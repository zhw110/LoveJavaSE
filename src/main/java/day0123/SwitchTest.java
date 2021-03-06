package day0123;

class SwitchTest
{
	public static void main(String[] args)
	{

		/*
		 * 用户输入的数据对应的出星期。
		 */
		int week = -1;
		switch (week)
		{
			default:
				break;
			case 1:
				System.out.println(week + "对应的是星期一");
				break;
			case 2:
				System.out.println(week + "对应的是星期二");
				// break;
				// ...以此类推。
		}
		/**
		 * <pre>
		季节的示例。
		春季：3  4  5
		夏季：6  7  8
		秋季：9  10 11
		冬季：12 1  2
		 * </pre>
		 */

		int month = 13;
		switch (month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(month + "月对应的是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "月对应的是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "月对应的是秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month + "月对应的是冬季");
				break;
			default:
				System.out.println(month + "月没有对应的季节");
		}
	}
}
