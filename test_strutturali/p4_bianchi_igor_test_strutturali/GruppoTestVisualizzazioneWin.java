package p4_bianchi_igor_test_strutturali;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import p4_bianchi_igor.App;
import p4_bianchi_igor.Dati;
import p4_bianchi_igor.ElementAppStore;
import p4_bianchi_igor.Gruppo;
import p4_bianchi_igor.WinStore;

public class GruppoTestVisualizzazioneWin 
{

	//CASO COMPLETO TUTTI I DATI SETTATI
	//ipotesi in cui l'aggregazione dati dia una classe dati
	//completa di tutti gli attributi aggregati delle applicazioni provenienti da 
	//win store
	//quindi la visualizzazione visualizzerà tutti i dati aggregati del win
	@Test
	public void testVisualizzazionWinCompleta() 
	{
		
			
		Gruppo g02=new Gruppo("gruppo1");
		//creo dati da associare alle app e al gruppo
		//classe dati completa
		Dati dAggregati=new Dati();
		Dati d=new Dati();
		

		//Gruppo g1=new Gruppo("social");
		ElementAppStore store1=new WinStore();
		App app1=new App("app1",store1);
		App app2=new App("app2",store1);
		ArrayList<Integer> datiInt = new ArrayList<Integer>();
		ArrayList<Double> datiDouble=new ArrayList<Double>();
		ArrayList<App> listApp=new ArrayList<App>();
		for(int j = 0; j<100; j++)
		{
			datiInt.add((int)(Math.random() * 100));
			datiDouble.add((double)Math.round((double)Math.random()*5));
	
		}
		ArrayList<Integer> daily = new ArrayList<Integer>();
		ArrayList<Double> daily2=new ArrayList<Double>();
		daily=datiInt;
		daily2=datiDouble;
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
		
		listApp.add(app1);
		listApp.add(app2);
		g02.setApps(listApp);
		
		
		
		for(int i=0;i<g02.getApps().size();i++)
		{
			//rating average over time
			d.setRating(rating);
			d.setType(type);
			d.setCount_new((double)Math.round((double)Math.random()*100));
			d.setCount_revised((double)Math.round((double)Math.random()*100));
			
			
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
			
			d.setOverview_dailyUserInstalls(daily);
			d.setCountry_dailyUserInstalls(daily);
			d.setOsVersion_dailyUserInstalls(daily);
			
			g02.getApps().get(i).setDati(d);
		}
		//WINSTORE aggregati
		//rating new and revised
		dAggregati.setRating(rating);
		dAggregati.setType(type);
		dAggregati.setCount_new((double)Math.round((double)Math.random()*100));
		dAggregati.setCount_revised((double)Math.round((double)Math.random()*100));
				
		//rating average over time
		dAggregati.setName("WERTYONQ");
		dAggregati.setDate_win(date_win);
		dAggregati.setCount_average(daily2);
				
		//market
		dAggregati.setMarket(market);
		dAggregati.setAverage_rating(daily2);
		dAggregati.setNumber_rating(daily);
				
		dAggregati.setOverview_dailyUserInstalls(daily);
		dAggregati.setCountry_dailyUserInstalls(daily);
		dAggregati.setOsVersion_dailyUserInstalls(daily);
				
		dAggregati.setFailure_count(daily);
		g02.setDatiAggregati(dAggregati);
		g02.visualizzazioneDati();
		
	}
	
	//ipotesi in cui provo la visualizzazione di un  gruppo le cui app 
	//hanno dati ma i dati aggregati
	//sono vuoti
	@Test
	public void TestGruppoWinConDatiMancanti()
	{
		//creo dati da associare alle app e al gruppo
		//classe dati completa
		Dati dAggregati2=new Dati();
		Dati d=new Dati();
		Gruppo g2=new Gruppo("gruppo2");

		//Gruppo g1=new Gruppo("social");
		ElementAppStore store1=new WinStore();
		App app1=new App("app21",store1);
		App app2=new App("app22",store1);
		ArrayList<Integer> datiInt = new ArrayList<Integer>();
		ArrayList<Double> datiDouble=new ArrayList<Double>();
		ArrayList<App> listApp=new ArrayList<App>();
		for(int j = 0; j<100; j++){
			datiInt.add((int)(Math.random() * 100));
			datiDouble.add((double)Math.round((double)Math.random()*5));
			//System.out.println(daily.get(j));
		}
		ArrayList<Integer> daily = new ArrayList<Integer>();
		ArrayList<Double> daily2=new ArrayList<Double>();
		daily=datiInt;
		daily2=datiDouble;
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
		
		listApp.add(app1);
		listApp.add(app2);
		g2.setApps(listApp);
		
		
		
		for(int i=0;i<g2.getApps().size();i++)
		{
			//rating average over time
			d.setRating(rating);
			d.setType(type);
			d.setCount_new((double)Math.round((double)Math.random()*100));
			d.setCount_revised((double)Math.round((double)Math.random()*100));
			
			
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
			
			d.setOverview_dailyUserInstalls(daily);
			d.setCountry_dailyUserInstalls(daily);
			d.setOsVersion_dailyUserInstalls(daily);
			
			g2.getApps().get(i).setDati(d);
		}
		
		g2.setDatiAggregati(dAggregati2);
		g2.visualizzazioneDati();
		
		
	}
	
	
	
	//ipotesi di visualizzazione di un gruppo con le app che non hanno dati
	@Test
	public void testVisualizzazioneGruppoWinConAppConDatiVuoti()
	{
		Gruppo g3=new Gruppo("gruppo3");
		ElementAppStore store1=new WinStore();
		App app1=new App("app31",store1);
		App app2=new App("app32",store1);
		ArrayList<App> listApp=new ArrayList<App>();
		listApp.add(app1);
		listApp.add(app2);
		g3.setApps(listApp);
		g3.visualizzazioneDati();
		
	}
	
	
	//ipotesi di visualizzazione di un gruppo vuoto senza app
	@Test
	public void testVisualizzazioneGruppoVuotoSenzaApp()
	{
		Gruppo g4=new Gruppo("gruppo4");
		g4.visualizzazioneDati();

	}

}
