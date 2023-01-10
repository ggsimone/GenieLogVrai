package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import myPackage.CompteEpargne;


import org.junit.Test;

//The Test annotation indicates that the public void method to which it is attached can be run as a test case.
public class TestCompteEpargne {

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test  
	public void testCompteEpargne() 
	{
		CompteEpargne CE=new CompteEpargne(50);
		assertEquals(50,CE.getSolde(),0);
	}


}
