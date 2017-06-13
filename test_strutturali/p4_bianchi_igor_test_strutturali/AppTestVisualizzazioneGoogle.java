package p4_bianchi_igor_test_strutturali;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import p4_bianchi_igor.App;
import p4_bianchi_igor.Dati;
import p4_bianchi_igor.ElementAppStore;
import p4_bianchi_igor.GoogleStore;

public class AppTestVisualizzazioneGoogle 
{
	
	//testo il caso in cui l'estrazione ha estratto i dati realtivi all'app
	//la normalizzazione ha creato la classe dati e i dati sono stati inizializzati
	//la visualizzazione deve mostrare a video tutti idati dell app
	//considero un app di google
	@Test
	public void testVisualizzazioneAppDatiCompleti()
	{
		//creo un app 
		ElementAppStore store=new GoogleStore();
		App app=new App("calcio",store);
		
		
		//arraylist di dati double e int
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
		
		
		//creo la classe dati
		Dati d = new Dati();
		
		//assegnamento dati come se fosse la normalizzazione
		//assegnamento dati app singola google
		
		//overview
		
		d.setOverview_data(date);
		d.setOverview_dailyUserInstalls(daily);
		d.setOverview_totUserInstalls(daily);//tot
		d.setOverview_dailyUserUninstalls(daily);
		d.setOverview_activeDeviceInstalls(daily);
		
		//carrier
		
		d.setCarrier_data(date);
		d.setCarrier_totUserInstalls(daily);//tot
		d.setCarrier_dailyUserInstalls(daily);
		d.setCarrier_dailyUserUninstalls(daily);
		d.setCarrier_activeDeviceInstalls(daily);
		
		//country
		
		d.setCountry_data(date);
		d.setCountry_dailyUserInstalls(daily);
		d.setCountry_totUserInstalls(daily);//tot;
		d.setCountry_dailyUserUninstalls(daily);
		d.setCountry_activeDeviceInstalls(daily);
		
		
		//device
		d.setDevice_data(date);
		d.setDevice_totUserInstalls(daily);//tot
		d.setDevice_dailyUserInstalls(daily);
		d.setDevice_dailyUserUninstalls(daily);
		d.setDevice_activeDeviceInstalls(daily);
		
		
		//lang
		d.setLang_data(date);
		d.setLang_totUserInstalls(daily);//tot
		d.setLang_dailyUserInstalls(daily);
		d.setLang_dailyUserUninstalls(daily);
		d.setLang_activeDeviceInstalls(daily);
		
		//osversion
		d.setOsVersion_data(date);
		d.setOsVersion_dailyUserInstalls(daily);
		d.setOsVersion_totUserInstalls(daily);//tot
		d.setOsVersion_dailyUserUninstalls(daily);
		d.setOsVersion_activeDeviceInstalls(daily);
		
		//tablet
		d.setTablet_data(date);
		d.setTablet_totUserInstalls(daily);//tot
		d.setTablet_dailyUserInstalls(daily);
		d.setTablet_dailyUserUninstalls(daily);
		d.setTablet_activeDeviceInstalls(daily);
		
	
		
		//DATI GOOGLE RATINGS
		//ratings
		//overview
		d.setData_overview(date);
		d.setPackage_name_overview(app.getNomeApp());
		d.setDaily_average_overview(daily2);
		d.setTotal_average_overview(daily2);
		
		//carrier
		d.setData_carrier(date);
		d.setPackage_name_carrier(app.getNomeApp());
		d.setCarrier(carrier);
		d.setDaily_average_carrier(daily2);
		d.setTotal_average_carrier(daily2);
		
		//country
		d.setData_country(date);
		d.setPackage_name_country(app.getNomeApp());
		d.setCountry(country);
		d.setDaily_average_country(daily2);
		d.setTotal_average_country(daily2);
		
		//device
		
		d.setData_device(date);
		d.setPackage_name_device(app.getNomeApp());
		d.setDevice(device);
		d.setDaily_average_device(daily2);
		d.setTotal_average_device(daily2);
		
		//language
		
		d.setData_language(date);
		d.setPackage_name_language(app.getNomeApp());
		d.setLanguage(language);
		d.setDaily_average_language(daily2);
		d.setTotal_average_language(daily2);
		
		//os_version
		
		d.setData_os_version(date);
		d.setPackage_name_os_version(app.getNomeApp());
		d.setOs_version(Os_version);
		d.setDaily_average_os_version(daily2);
		d.setTotal_average_os_version(daily2);
		
		//tablet
		d.setData_tablet(date);
		d.setPackage_name_tablet(app.getNomeApp());
		d.setTablet(Os_version);
		d.setDaily_average_tablet(daily2);
		d.setTotal_average_tablet(daily2);
		
		//app_version
		d.setData_app_version(date);
		d.setPackage_name_app_version(app.getNomeApp());
		d.setApp_version(app_version);
		d.setDaily_average_app_version(daily2);
		d.setTotal_average_app_version(daily2);
		app.setDati(d);
		app.visualizzazioneDati();
	}
	
	
	
	//caso in cui non le operazioni precedenti alla visualizzazione generino
	//una classe dati vuota, nel senso che gli attributi della classe dati
	//non sono settati.
	//La visualizzazione stampa un messaggio di errore
	@Test
	public void testVisualizzazioneAppSenzaDati()
	{
		ElementAppStore store=new GoogleStore();
		App a=new App("calcio",store);
		Dati d = new Dati();
		a.setDati(d);
		a.visualizzazioneDati();
	}
	
	
	//caso in cui le operazioni precedenti alla visualizzazione producano una classi dati
	//null ovvero l'attributo dati associato all'app non è inizializzato
	//La visualizzazione stamperà un messaggio di errore
	@Test
	public void testVisualizzazioneAppDatiNull()
	{
		ElementAppStore store=new GoogleStore();
		App a=new App("calcio",store);
		a.visualizzazioneDati();
	}

}



