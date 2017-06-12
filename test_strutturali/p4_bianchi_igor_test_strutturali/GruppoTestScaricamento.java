package p4_bianchi_igor_test_strutturali;
import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import p4_bianchi_igor.Gruppo;
//white
public class GruppoTestScaricamento 
{

	@Test
	public void testSalvataggioDatiCorretto()
	{
		Gruppo g=new Gruppo("gruppoProva");
		String percorso="/home/se-17-user/file1";
		String s="file creato";
		assertTrue(g.salvataggioFile(percorso, s));
	}
	
	@Test
	public void testSalvataggioDatiFail()
	{
		Gruppo g=new Gruppo("gruppoProva1");
		String percorso="/sjsjsjdsjdshdsjdh";
		String s="file creato";
		assertFalse(g.salvataggioFile(percorso, s));	
	}
	

}
