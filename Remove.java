package com.epam.TDD;
import static org.junit.Assert.*;
import org.junit.Test;
public class Remove
{

	/* TODO list for my reference
	1.case 1: ABCD  => BCD ---- SUCCESS
	2.case 2: AACD  => CD ------ SUCCESS
	3.case 3: BACD  => BCD ---- SUCCESS
                     4.case 4:BBAA   => BBAA -- SUCCESS
	5.case 5: AABAA => BAA --- SUCCESS	
	*/
	
	@Test
	public void testcase1()
	{
		Removefirst r=new Removefirst();
		String s=r.removing("ABCD");
		assertEquals("BCD",s);
	}
	@Test
	public void testcase2()
	{
		Removefirst r=new Removefirst();
		String s=r.removing("AACD");
		assertEquals("CD",s);
	}
	@Test
	public void testcase3()
	{
		Removefirst r=new Removefirst();
		String s=r.removing("BACD");
		assertEquals("BCD",s);
	}
	@Test
	public void testcase4()
	{
		Removefirst r=new Removefirst();
		String s=r.removing("BBAA");
		assertEquals("BBAA",s);
	}
	@Test
	public void testcase5()
	{
		Removefirst r=new Removefirst();
		String s=r.removing("AABAA");
		assertEquals("BAA",s);
	}

}
