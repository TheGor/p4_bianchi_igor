package p4_bianchi_igor_test_strutturali;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import p4_bianchi_igor.App;
import p4_bianchi_igor.Dati;
import p4_bianchi_igor.ElementAppStore;
import p4_bianchi_igor.GoogleStore;
import p4_bianchi_igor.Gruppo;

public class GruppoTestVisualizzazioneGoogle 

{
	//CASO COMPLETO TUTTI I DATI SETTATI
	//caso in cui l'aggregazione dati dia una classe dati
	//completa di tutti gli attributi aggregati delle applicazioni provenienti da 
	//google store
	//quindi la visualizzazione visualizzerà tutti i dati
	@Test
	public void testVisualizzazioneGoogle() 
	{
		
		//creo dati da associare alle app e al gruppo
		//classe dati completa
		Gruppo g0=new Gruppo("giochi1");
		Dati datiAggregati=new Dati();
		Dati d=new Dati();
	
		ElementAppStore store1=new GoogleStore();
		App app1=new App("poker",store1);
		App app2=new App("dama",store1);
		ArrayList<Integer> datiInt = new ArrayList<Integer>();
		ArrayList<Double> datiDouble=new ArrayList<Double>();
		ArrayList<App> listApp=new ArrayList<App>();
		for(int j = 0; j<100; j++){
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
		g0.setApps(listApp);
		for(int i=0;i<g0.getApps().size();i++)
		{
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
			
			
			//failure
			d.setFailure_count(daily);
			d.setFailure_data(date);
			
			//DATI GOOGLE RATINGS
			//ratings
			//overview
			d.setData_overview(date);
			d.setPackage_name_overview(g0.getApps().get(i).getNomeApp());
			d.setDaily_average_overview(daily2);
			d.setTotal_average_overview(daily2);
			
			//carrier
			d.setData_carrier(date);
			d.setPackage_name_carrier(g0.getApps().get(i).getNomeApp());
			d.setCarrier(carrier);
			d.setDaily_average_carrier(daily2);
			d.setTotal_average_carrier(daily2);
			
			//country
			d.setData_country(date);
			d.setPackage_name_country(g0.getApps().get(i).getNomeApp());
			d.setCountry(country);
			d.setDaily_average_country(daily2);
			d.setTotal_average_country(daily2);
			
			//device
			
			d.setData_device(date);
			d.setPackage_name_device(g0.getApps().get(i).getNomeApp());
			d.setDevice(device);
			d.setDaily_average_device(daily2);
			d.setTotal_average_device(daily2);
			
			//language
			
			d.setData_language(date);
			d.setPackage_name_language(g0.getApps().get(i).getNomeApp());
			d.setLanguage(language);
			d.setDaily_average_language(daily2);
			d.setTotal_average_language(daily2);
			
			//os_version
			
			d.setData_os_version(date);
			d.setPackage_name_os_version(g0.getApps().get(i).getNomeApp());
			d.setOs_version(Os_version);
			d.setDaily_average_os_version(daily2);
			d.setTotal_average_os_version(daily2);
			
			//tablet
			d.setData_tablet(date);
			d.setPackage_name_tablet(g0.getApps().get(i).getNomeApp());
			d.setTablet(Os_version);
			d.setDaily_average_tablet(daily2);
			d.setTotal_average_tablet(daily2);
			
			//app_version
			d.setData_app_version(date);
			d.setPackage_name_app_version(g0.getApps().get(i).getNomeApp());
			d.setApp_version(app_version);
			d.setDaily_average_app_version(daily2);
			d.setTotal_average_app_version(daily2);
		}
			
			
			
		//OVERVIEW
		datiAggregati.setOverview_dailyUserInstalls(datiInt);
		datiAggregati.setOverview_totUserInstalls(datiInt);//tot
		datiAggregati.setOverview_dailyUserUninstalls(datiInt);
		datiAggregati.setOverview_activeDeviceInstalls(datiInt);
				
		//carrier
		datiAggregati.setCarrier_totUserInstalls(datiInt);//tot
		datiAggregati.setCarrier_dailyUserInstalls(datiInt);
		datiAggregati.setCarrier_dailyUserUninstalls(datiInt);
		datiAggregati.setCarrier_activeDeviceInstalls(datiInt);
		
		//country
		datiAggregati.setCountry_dailyUserInstalls(datiInt);
		datiAggregati.setCountry_totUserInstalls(datiInt);//tot;
		datiAggregati.setCountry_dailyUserUninstalls(datiInt);
		datiAggregati.setCountry_activeDeviceInstalls(datiInt);
				
		//device
		datiAggregati.setDevice_totUserInstalls(datiInt);//tot
		datiAggregati.setDevice_dailyUserInstalls(datiInt);
		datiAggregati.setDevice_dailyUserUninstalls(datiInt);
		datiAggregati.setDevice_activeDeviceInstalls(datiInt);
				
		//lang
		datiAggregati.setLang_totUserInstalls(datiInt);//tot
		datiAggregati.setLang_dailyUserInstalls(datiInt);
		datiAggregati.setLang_dailyUserUninstalls(datiInt);
		datiAggregati.setLang_activeDeviceInstalls(datiInt);
			
		//osversion
		datiAggregati.setOsVersion_dailyUserInstalls(datiInt);
		datiAggregati.setOsVersion_totUserInstalls(datiInt);//tot
		datiAggregati.setOsVersion_dailyUserUninstalls(datiInt);
		datiAggregati.setOsVersion_activeDeviceInstalls(datiInt);
			
		//tablet
		datiAggregati.setTablet_totUserInstalls(datiInt);//tot
		datiAggregati.setTablet_dailyUserInstalls(datiInt);
		datiAggregati.setTablet_dailyUserUninstalls(datiInt);
		datiAggregati.setTablet_activeDeviceInstalls(datiInt);
		
		//failure
		datiAggregati.setFailure_count(datiInt);
		
		//RATINGS GOOGLE AGGREGATI
		
		//overview
		datiAggregati.setDaily_average_overview(datiDouble);
		datiAggregati.setTotal_average_overview(datiDouble);
		
		//carrier
		datiAggregati.setDaily_average_carrier(datiDouble);
		datiAggregati.setTotal_average_carrier(datiDouble);
		
		//country
		datiAggregati.setDaily_average_country(datiDouble);
		datiAggregati.setTotal_average_country(datiDouble);
		
		//device
		datiAggregati.setDaily_average_device(datiDouble);
		datiAggregati.setTotal_average_device(datiDouble);
		
		//language
		datiAggregati.setDaily_average_language(datiDouble);
		datiAggregati.setTotal_average_language(datiDouble);
		
		//osversion
		datiAggregati.setDaily_average_os_version(datiDouble);
		datiAggregati.setTotal_average_os_version(datiDouble);
		
		//tablet
		datiAggregati.setDaily_average_tablet(datiDouble);
		datiAggregati.setTotal_average_tablet(datiDouble);
		//app_data 
		datiAggregati.setDaily_average_app_version(datiDouble);
		datiAggregati.setTotal_average_app_version(datiDouble);
		
		app1.setDati(d);
		app2.setDati(d);
	
		g0.setDatiAggregati(datiAggregati);
		
		g0.visualizzazioneDati();
	
	}
	
	//test con l'oggetto dati aggregati vuoto e i dati delle singole app settati
	//caso in cui l'aggregazione fallisca(ipotesi)
	@Test
	public void testGruppoGoogleConDatiMancanti()
	{
		
		Dati datiAggregati2=new Dati();
		Dati d=new Dati();
		Gruppo g2=new Gruppo("giochi2");
		
		ElementAppStore store1=new GoogleStore();
		App app1=new App("poker2",store1);
		App app2=new App("dama2",store1);
		ArrayList<Integer> datiInt = new ArrayList<Integer>();
		ArrayList<Double> datiDouble=new ArrayList<Double>();
		ArrayList<App> listApp=new ArrayList<App>();
		for(int j = 0; j<100; j++){
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
		g2.setApps(listApp);
		for(int i=0;i<g2.getApps().size();i++)
		{
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
			
			
			//failure
			d.setFailure_count(daily);
			d.setFailure_data(date);
			
			//DATI GOOGLE RATINGS
			//ratings
			//overview
			d.setData_overview(date);
			d.setPackage_name_overview(g2.getApps().get(i).getNomeApp());
			d.setDaily_average_overview(daily2);
			d.setTotal_average_overview(daily2);
			
			//carrier
			d.setData_carrier(date);
			d.setPackage_name_carrier(g2.getApps().get(i).getNomeApp());
			d.setCarrier(carrier);
			d.setDaily_average_carrier(daily2);
			d.setTotal_average_carrier(daily2);
			
			//country
			d.setData_country(date);
			d.setPackage_name_country(g2.getApps().get(i).getNomeApp());
			d.setCountry(country);
			d.setDaily_average_country(daily2);
			d.setTotal_average_country(daily2);
			
			//device
			
			d.setData_device(date);
			d.setPackage_name_device(g2.getApps().get(i).getNomeApp());
			d.setDevice(device);
			d.setDaily_average_device(daily2);
			d.setTotal_average_device(daily2);
			
			//language
			
			d.setData_language(date);
			d.setPackage_name_language(g2.getApps().get(i).getNomeApp());
			d.setLanguage(language);
			d.setDaily_average_language(daily2);
			d.setTotal_average_language(daily2);
			
			//os_version
			
			d.setData_os_version(date);
			d.setPackage_name_os_version(g2.getApps().get(i).getNomeApp());
			d.setOs_version(Os_version);
			d.setDaily_average_os_version(daily2);
			d.setTotal_average_os_version(daily2);
			
			//tablet
			d.setData_tablet(date);
			d.setPackage_name_tablet(g2.getApps().get(i).getNomeApp());
			d.setTablet(Os_version);
			d.setDaily_average_tablet(daily2);
			d.setTotal_average_tablet(daily2);
			
			//app_version
			d.setData_app_version(date);
			d.setPackage_name_app_version(g2.getApps().get(i).getNomeApp());
			d.setApp_version(app_version);
			d.setDaily_average_app_version(daily2);
			d.setTotal_average_app_version(daily2);
			
			g2.getApps().get(i).setDati(d);
		}
		g2.setDatiAggregati(datiAggregati2);
		g2.visualizzazioneDati();
			
	}
	
	//chiamo la visualizzazione di un gruppo vuoti
	//di conseguenza la visualizzazione stamperà un messaggio di errore
	//poichè i dati delle app non sono settati
	@Test
	public void testVisualizzazioneGruppoVuotoSenzaApp()
	{
		Gruppo g3=new Gruppo("giochi3");
		g3.visualizzazioneDati();

	}
	
	
	//visualizzazione di un gruppo in cui almeno un app abbia i dati vuoti
	@Test
	public void testVisualizzazioneGruppoConAppConDatiVuoti()
	{
		Gruppo g4=new Gruppo("giochi4");
		ElementAppStore store1=new GoogleStore();
		App app1=new App("poker4",store1);
		App app2=new App("dama4",store1);
		ArrayList<App> listApp=new ArrayList<App>();
		listApp.add(app1);
		listApp.add(app2);
		g4.setApps(listApp);
		g4.visualizzazioneDati();
		
	}

}
