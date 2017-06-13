package p4_bianchi_igor_test_strutturali;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import p4_bianchi_igor.App;
import p4_bianchi_igor.ElementAppStore;
import p4_bianchi_igor.GoogleStore;
import p4_bianchi_igor.Gruppo;
import p4_bianchi_igor.Sistema;
//test white box
public class SistemaTest 
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
	

	//testo la creazione di un gruppo con un nome
	//non ancora in uso
	@Test
	public void testCreazioneGruppo()
	{
		
		String nome="gruppo170";
		s.addGruppo(nome, gruppi);
		
	}
	
	
	//testo la creazione di un gruppo
	//con un nome già in uso
	@Test
	public void testCreazioneGruppo2()
	{
		Gruppo g=new Gruppo("gruppo130");
		gruppi.add(g);
		String nome="gruppo130";
		s.addGruppo(nome, gruppi);

		
		
	}
	
	//testo la creazione di un gruppo con un nome Scritto in
	//maiusolo per entrare nel branch che verifica che se il nome è scritto uguale
	//ma in maiuscolo lo conta come già in uso
	@Test
	public void testCreazioneGruppo3()
	{
		Gruppo g=new Gruppo("gruppo211");
		gruppi.add(g);
		String nome="Gruppo211";
		s.addGruppo(nome, gruppi);
		
		
		
	}
	
}
