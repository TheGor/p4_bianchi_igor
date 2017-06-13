package p4_bianchi_igor_test_strutturali;
import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import p4_bianchi_igor.Gruppo;
//white
public class GruppoTestScaricamento 
{
	//testo la funzione ausiliaria di salvataggio dati,
	//caso in input do un percorso corretto
	//ATTENZIONE questo caso potrebbe fallire poichè il percorso
	//specificato potrebbe non esistere sul pc di chi esegue questo test
	//quindi l'assert darà false al posto che true
	@Test
	public void testSalvataggioDatiCorretto()
	{
		Gruppo g=new Gruppo("gruppoProva");
		String percorso="/home/se-17-user/file10";
		String s="file creato";
		assertTrue(g.salvataggioFile(percorso, s));
	}
	
	
	//caso in cui do un percorso non esistente
	@Test
	public void testSalvataggioDatiFail()
	{
		Gruppo g=new Gruppo("gruppoProva1");
		String percorso="/sjghghgh";
		String s="file creato";
		assertFalse(g.salvataggioFile(percorso, s));	
	}
	

}
