package Thinking4.initialization;

import Thinking4.net.mindview.util.Print;

class Cup
{
	Cup(int marker)
	{
		Print.print("Cup(" + marker + ")");
	}

	void f(int marker)
	{
		Print.print("f(" + marker + ")");
	}
}

class Cups
{
	static Cup cup1;
	static Cup cup2;
	static
	{
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	Cups()
	{
		Print.print("Cups()");
	}
}

public class ExplicitStatic
{
	public static void main(String[] args)
	{
		Print.print("Inside main()");
		Cups.cup1.f(99); // (1)
	}
	// static Cups cups1 = new Cups(); // (2)
	// static Cups cups2 = new Cups(); // (2)
} /*
	 * Output: Inside main() Cup(1) Cup(2) f(99)
	 */// :~