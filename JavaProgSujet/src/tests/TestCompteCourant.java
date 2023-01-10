package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import myPackage.CompteCourant;

import org.junit.Test;

//The Test annotation indicates that the public void method to which it is attached can be run as a test case.
public class TestCompteCourant {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	
	@Test  
	public void test1_1() 
	{
		CompteCourant Ccourant=new CompteCourant(50);
		
		assertEquals(50,Ccourant.getSolde(),0); //voir documentation en ligne sur assertions Junit 
	}

	@Test
	public void test1_2() 
	{
		//fail("Test1_2 Not yet implemented");
	}

}
