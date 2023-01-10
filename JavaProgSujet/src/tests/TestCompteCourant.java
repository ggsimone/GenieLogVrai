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
	
	//Ces tests sont bien fonctionnels
	
	@Test  
	public void testConstructeur() 
	{
		CompteCourant Ccourant=new CompteCourant(50);
		assertEquals(50,Ccourant.getSolde(),0); //voir documentation en ligne sur assertions Junit 
	}

	@Test
	public void testRemunerer() 
	{
		CompteCourant Ccourant=new CompteCourant(50);
		Ccourant.setSolde(Ccourant.getSolde()*5);
		assertEquals(250,Ccourant.getSolde(),0);
	}
	

}
