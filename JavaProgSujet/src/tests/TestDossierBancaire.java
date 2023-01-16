package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import myPackage.DossierBancaire;

import org.junit.Test;

//The Test annotation indicates that the public void method to which it is attached can be run as a test case.
public class TestDossierBancaire {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test  
	public void test_deposer_getsolde() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100,dossier.get_solde(),0); //voir documentation en ligne sur assertions Junit 
	}

	@Test
	public void test_remunerer() 
	{
		DossierBancaire dossier2=new DossierBancaire();
		dossier2.deposer(1000);
		dossier2.remunerer();
		assertEquals(1001.92,dossier2.get_solde(),0.0001);	//car Compte epargne = 60% du dossier, 3.2%*600 = 1.92
	}
	
	@Test
	public void test_retrait() {
		DossierBancaire dossier3=new DossierBancaire();
		dossier3.deposer(1000);
		dossier3.retirer(200);
		assertEquals(800,dossier3.get_solde(),0.0001);
		
	}
	
	
	@Test
	public void test_retrait_fail() {
		boolean thrown = false;
		DossierBancaire dossier4=new DossierBancaire();
		dossier4.deposer(1000);
		
		try {
			dossier4.retirer(500);
			//fail("Pas d'exception levée");
		}
		catch(Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
			
	}

	
}
