package ThinkingInJava4.io;

import static ThinkingInJava4.net.mindview.util.Print.print;

//: io/DirectoryDemo.java
// Sample use of Directory utilities.
import java.io.File;

import ThinkingInJava4.net.mindview.util.Directory;
import ThinkingInJava4.net.mindview.util.PPrint;

public class DirectoryDemo
{
	public static void main(String[] args)
	{
		// All directories:
		PPrint.pprint(Directory.walk(".").dirs);
		// All files beginning with 'T'
		for (File file : Directory.local(".", "T.*"))
		{
			print(file);
		}
		print("----------------------");
		// All Java files beginning with 'T':
		for (File file : Directory.walk(".", "T.*\\.java"))
		{
			print(file);
		}
		print("======================");
		// Class files containing "Z" or "z":
		for (File file : Directory.walk(".", ".*[Zz].*\\.class"))
		{
			print(file);
		}
	}
} /*
	 * Output: (Sample) [.\xfiles] .\TestEOF.class .\TestEOF.java .\TransferTo.class
	 * .\TransferTo.java ---------------------- .\TestEOF.java .\TransferTo.java
	 * .\xfiles\ThawAlien.java ====================== .\FreezeAlien.class .\GZIPcompress.class
	 * .\ZipCompress.class
	 */// :~