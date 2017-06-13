package p4_bianchi_igor_test_funzionali;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import p4_bianchi_igor.App;
import p4_bianchi_igor.Dati;
import p4_bianchi_igor.ElementAppStore;
import p4_bianchi_igor.WinStore;

public class AppTestScaricamentoDatiFunzionale 
{

	//testo la funzione di scaricamento dei dati di un app, 
	//dove mi aspetto la creazione di un file 
	//e il salvataggio nel percrso e nome specificato
	//ATTENZIONE: il test potrebbe fallire poichè viene specificato
	//un percorso e un nome all'interno di questo codice
	//Se il percorso non esiste nel pc di chi prova il codice
	//l'assert true fallisce
	
	@Test
	public void testScaricamentoDatiAppFunzionale() 
	{
		
		//creo un oggetto app
		ElementAppStore store=new WinStore();
		App appFunc05=new App("basket",store);
		
		
		//arraylist di dati double e int
		//per comodità ne creo solo due da assegnare a 
		//tutti i dati
		ArrayList<Integer> daily = new ArrayList<Integer>();
		ArrayList<Double> daily2=new ArrayList<Double>();
		
		//generazione dati come se fossero estratti
		for(int j = 0; j<100; j++)
		{
			daily.add((int)(Math.random() * 100));
			daily2.add((double)Math.round((double)Math.random()*5));
		}
		
		//generazione di dati stringa
		ArrayList<String> date=new ArrayList<String>();
		date.add("01/06/2016");
		date.add("07/07/2016");
		date.add("08/08/2016");
		date.add("05/09/2016");
		
		ArrayList<String> carrier=new ArrayList<String>();
		carrier.add("tim");
		carrier.add("at&t");
		carrier.add("tre");
		carrier.add("wind");
		
		ArrayList<String> country=new ArrayList<String>();
		country.add("italia");
		country.add("francia");
		country.add("spagna");
		country.add("svezia");
		
		ArrayList<String> device=new ArrayList<String>();
		device.add("  asus99");
		device.add(" nikelp1");
		device.add("M0device");
		device.add("M7device");
		

		ArrayList<String> language=new ArrayList<String>();
		language.add("italiano");
		language.add("francese");
		language.add("spagnolo");
		language.add(" inglese");
		
		
		ArrayList<String> Os_version=new ArrayList<String>();
		Os_version.add("android4.5");
		Os_version.add("android7.1");
		Os_version.add("android3.3");
		Os_version.add("android7.7");
		
		
		ArrayList<String> tablet=new ArrayList<String>();
		tablet.add("7_up_to_10");
		tablet.add("8_up_to_11");
		tablet.add("2_up_to_13");
		tablet.add("4_up_to_15");
		
	
		ArrayList<String> rating=new ArrayList<String>();
		rating.add("5");
		rating.add("4");
		rating.add("3");
		rating.add("2");
		rating.add("1");
		rating.add("5");
		rating.add("4");
		rating.add("3");
		rating.add("2");
		rating.add("1");
		
		ArrayList<String> type=new ArrayList<String>();
		type.add("New rating");
		type.add("New rating");
		type.add("New rating");
		type.add("New rating");
		type.add("New rating");
		type.add("Revised rating");
		type.add("Revised rating");
		type.add("Revised rating");
		type.add("Revised rating");
		type.add("Revised rating");
		
		
		
		ArrayList<String> date_win=new ArrayList<String>();
		date_win.add("May 1 12:00 AM");
		date_win.add("May 2 12:00 AM");
		date_win.add("May 3 12:00 AM");
		date_win.add("May 4 12:00 AM");
		date_win.add("May 5 12:00 AM");
		date_win.add("May 6 12:00 AM");
		date_win.add("May 7 12:00 AM");
		
		
		

		ArrayList<String> market=new ArrayList<String>();
		market.add("  italy");
		market.add("England");
		market.add("    Usa");
		market.add(" France");
		market.add("  Spain");
		
		ArrayList<String> app_version=new ArrayList<String>();
		app_version.add("200008");
		app_version.add("200009");
		app_version.add("200010");
		app_version.add("200011");
		
		//creazione classe dati
		Dati d = new Dati();
		
		//settaggio dei dati come se fossero normalizzati
		//rating new and revised
		d.setRating(rating);
		d.setType(type);
		d.setCount_new((double)Math.round((double)Math.random()*100));
		d.setCount_revised((double)Math.round((double)Math.random()*100));
		
		//rating average over time
		d.setName("WERTYONQ");
		d.setDate_win(date_win);
		d.setCount_average(daily2);
		
		//market
		d.setMarket(market);
		d.setAverage_rating(daily2);
		d.setNumber_rating(daily);
		
		//failure
		d.setFailure_count(daily);
		d.setFailure_data(date);
		
		//dati che hanno in comune con il ggole store
		d.setOverview_data(date);
		d.setOverview_dailyUserInstalls(daily);
		
		d.setCountry_data(date);
		d.setCountry_dailyUserInstalls(daily);
		
		d.setOsVersion_data(date);
		d.setOsVersion_dailyUserInstalls(daily);
		
		appFunc05.setDati(d);
		
		
		String s11=appFunc05.preparazioneStringaDati();
		String percorsoNome="/home/se-17-user/fileTestAppFunc";
		assertTrue(appFunc05.salvataggioFile(percorsoNome, s11));
	}
		

}
