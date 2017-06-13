package p4_bianchi_igor_test_strutturali;

import static org.junit.Assert.*;

import org.junit.Test;

import p4_bianchi_igor.App;
import p4_bianchi_igor.ElementAppStore;
import p4_bianchi_igor.GoogleStore;
//white
public class AppTestScaricamento 
{
	
	//testo la funzione ausiliaria di salvataggio dati,
	//caso in input do un percorso corretto
	//ATTENZIONE questo caso potrebbe fallire poichè il percorso
	//specificato potrebbe non esistere sul pc di chi esegue questo test
	//quindi l'assert darà false al posto che true
	@Test
	public void testSalvataggioDatiCorretto()
	{
		ElementAppStore store=new GoogleStore();
		App app1=new App("appTest",store);
		String percorso="/home/se-17-user/file1";
		String s="file creato";
		assertTrue(app1.salvataggioFile(percorso, s));
	}
	
	//caso in cui do un percorso non esistente
	@Test
	public void testSalvataggioDatiFail()
	{
		ElementAppStore store=new GoogleStore();
		App app=new App("appTest",store);
		String percorso="/sjsjsjdsjdshdsjdh";
		String s="file creato";
		assertFalse(app.salvataggioFile(percorso, s));	
	}


}


