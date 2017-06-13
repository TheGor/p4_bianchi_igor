package p4_bianchi_igor_test_funzionali;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import p4_bianchi_igor.App;
import p4_bianchi_igor.ElementAppStore;
import p4_bianchi_igor.GoogleStore;
import p4_bianchi_igor.Gruppo;
import p4_bianchi_igor.Sistema;
//black box
public class SistemaTest2 
{
	
	private static Sistema s;
	private static ElementAppStore appStores=new GoogleStore();
	private static ArrayList<App> apps=new ArrayList<App>();
	private static ArrayList<Gruppo> gruppi=new ArrayList<Gruppo>();
	
	
	@BeforeClass
	
	public static void setUp()
	{
		s=new Sistema(appStores,apps,gruppi);
	}
	
	//passo un nome di un gruppo che non è ancora stato
	//utilizzato 
	//verifico che la ricerca dia false poichè il nome non è 
	//ancora stato utilizzato
	
	@Test
	public void testRicercaNome()
	{ 
		String nome="gruppo1";
		assertFalse(s.ricercaNome(nome, gruppi));
	}
	
	//se provo a cercare un nome che è già in uso mi aspetto
	//che la ricerca dia true
	@Test
	public void testRicercaNome2()
	{
		Gruppo g=new Gruppo("gruppo11");
		gruppi.add(g);
		String nome="gruppo11";
		assertTrue(s.ricercaNome(nome, gruppi));
	}
	
	//uso un nome che non è ancora stato utilizzato
	//verifico che il gruppo sia stato inserito
	@Test
	public void testAddGruppo()
	{
		String nome="gruppo2";	
		assertTrue(s.addGruppo(nome, gruppi));
		
	}
	
	//uso un nome che è già stato utilizzato
	//mi aspetto che il gruppo non venga inserito
	@Test
	public void testAddGruppo2()
	{
		String nome="gruppo10";	
		assertTrue(s.addGruppo(nome, gruppi));
		assertFalse(s.addGruppo(nome, gruppi));
		
	}
	
	
}
