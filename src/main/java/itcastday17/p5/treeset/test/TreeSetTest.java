package itcastday17.p5.treeset.test;

import java.util.Iterator;
import java.util.TreeSet;

import itcastday17.p5.comparator.ComparatorByLength;

/* 
 * ���ַ������г�������
 * 
 * "20 18 -1 89 2 67"
 */

public class TreeSetTest {
	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new ComparatorByLength());

		ts.add("aaaaa");
		ts.add("zz");
		ts.add("nbaq");
		ts.add("cba");
		ts.add("abc");

		Iterator it = ts.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}