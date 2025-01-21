package com.kj.proj.algo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*

 */
public class StringAlgoTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}
	@Before
	public void setUp() throws Exception
	{
	}
	@After
	public void tearDown() throws Exception
	{
	}
	//	@Test
	// public void testMain() 
	//	{
	//		fail("Not yet implemented");
	//	}


	@Test
	public void testShiftByTwo()
	{
		//Control click : Hyperlink come back by alt leftarrow
		StringAlgo obj = new StringAlgo();
		String actual = obj.shiftbytwo("hello");
		String expected = "llohe";
		assertEquals(expected,actual);
	}

	@Test
	public void test2ShiftByTwo()
	{
		//Control click : Hyperlink come back by alt leftarrow
		StringAlgo obj = new StringAlgo();
		String actual = obj.shiftbytwo("ab");
		String expected = "ab";
		assertEquals(expected,actual);
	}


	@Test
	public void test3ShiftByTwo()
	{
		//Control click : Hyperlink come back by alt leftarrow
		StringAlgo obj = new StringAlgo();
		try {
			String actual = obj.shiftbytwo("a");
		}
		catch(Exception e)
		{
			return;	
		}

		fail("method must throw and exception");
	}
	@Test(expected = Exception.class)
	public void test4ShiftByTwo()
	{
		//Control click : Hyperlink come back by alt leftarrow
		StringAlgo obj = new StringAlgo();
		String actual = obj.shiftbytwo("a");
	}


	@BeforeClass
	public static void growUp1() {
		System.out.println("Run once all test");
	}
	
	@AfterClass
	public static void tearDownAfterClass1() throws Exception
	{
		System.out.println("Run once after all test");
	}

	@Before
	public void setUp1() throws Exception
	{
		System.out.println("Before every tests");
	}

	@After
	public void tearDown1() throws Exception
	{
		System.out.println("After every test");
	}
}

