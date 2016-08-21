/**
 *
 */
package itcastday08;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author zhanghongwei
 *
 */
public class ArrayUtilTest
{
	int[] arr = { 4, 8, 2, 9, 72, 6 };

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	/**
	 * Test method for {@link itcastday08.ArrayMyUtil#getMax(int[])}.
	 */
	@Test
	public final void testGetMax()
	{
		int actual = ArrayMyUtil.getMax(this.arr);
		int expected = 72;
		Assert.assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link itcastday08.ArrayMyUtil#selectSort(int[])}.
	 */
	@Ignore
	@Test
	public final void testSelectSort()
	{
		Assert.fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link itcastday08.ArrayMyUtil#getIndex(int[], int)}.
	 */
	@Test
	public final void testGetIndex()
	{
		int actual = ArrayMyUtil.getIndex(this.arr, 8);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link itcastday08.ArrayMyUtil#arrayToString(int[])}.
	 */
	@Test
	public final void testArrayToString()
	{
		final String arrayToString = ArrayMyUtil.arrayToString(this.arr);
		Assert.assertEquals("[4, 8, 2, 9, 72, 6]", arrayToString);

	}

}