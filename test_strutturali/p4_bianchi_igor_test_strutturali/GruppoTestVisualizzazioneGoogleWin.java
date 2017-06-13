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
import p4_bianchi_igor.WinStore;

public class GruppoTestVisualizzazioneGoogleWin
{	


	//CASO COMPLETO TUTTI I DATI SETTATI
	//ipotesi in cui l'aggregazione dati dia una classe dati
	//completa di tutti gli attributi aggregati delle applicazioni provenienti da 
	//google store e win store
	//quindi la visualizzazione visualizzerà tutti i dati
	@Test
	public void testVisualizzazioneGoogleWInCompleto() 
	{
		Gruppo g01=new Gruppo("chat");
		Dati datiAggregati=new Dati();
		Dati d=new Dati();

		//Gruppo g1=new Gruppo("social");
		ElementAppStore store1=new GoogleStore();
		ElementAppStore store2=new WinStore();
		App app1=new App("whatsapp",store1);
		App app2=new App("whatsapp",store2);
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
		
		
		
		//google
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
		d.setPackage_name_overview(app1.getNomeApp());
		d.setDaily_average_overview(daily2);
		d.setTotal_average_overview(daily2);
		
		//carrier
		d.setData_carrier(date);
		d.setPackage_name_carrier(app1.getNomeApp());
		d.setCarrier(carrier);
		d.setDaily_average_carrier(daily2);
		d.setTotal_average_carrier(daily2);
		
		//country
		d.setData_country(date);
		d.setPackage_name_country(app1.getNomeApp());
		d.setCountry(country);
		d.setDaily_average_country(daily2);
		d.setTotal_average_country(daily2);
		
		//device
		
		d.setData_device(date);
		d.setPackage_name_device(app1.getNomeApp());
		d.setDevice(device);
		d.setDaily_average_device(daily2);
		d.setTotal_average_device(daily2);
		
		//language
		
		d.setData_language(date);
		d.setPackage_name_language(app1.getNomeApp());
		d.setLanguage(language);
		d.setDaily_average_language(daily2);
		d.setTotal_average_language(daily2);
		
		//os_version
		
		d.setData_os_version(date);
		d.setPackage_name_os_version(app1.getNomeApp());
		d.setOs_version(Os_version);
		d.setDaily_average_os_version(daily2);
		d.setTotal_average_os_version(daily2);
		
		//tablet
		d.setData_tablet(date);
		d.setPackage_name_tablet(app1.getNomeApp());
		d.setTablet(Os_version);
		d.setDaily_average_tablet(daily2);
		d.setTotal_average_tablet(daily2);
		
		//app_version
		d.setData_app_version(date);
		d.setPackage_name_app_version(app1.getNomeApp());
		d.setApp_version(app_version);
		d.setDaily_average_app_version(daily2);
		d.setTotal_average_app_version(daily2);
		
		//winstore
		
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
		
		app1.setDati(d);
		app2.setDati(d);
		listApp.add(app1);
		listApp.add(app2);
		g01.setApps(listApp);
		
		//dati aggregati win e google
		
		datiAggregati.setOverview_dailyUserInstalls(daily);
		datiAggregati.setCountry_dailyUserInstalls(daily);
		datiAggregati.setOsVersion_dailyUserInstalls(daily);
		
		g01.setDatiAggregati(datiAggregati);
		
		g01.visualizzazioneDati();
	}
	
	//ipotesi in cui l'oggeto dati aggregati sia vuoto
	@Test
	public void testVisualizzazioneWinGoogleConDatiMancanti()
	{
		Dati datiAggregati2=new Dati();
		Dati d=new Dati();
		Gruppo g2=new Gruppo("chat2");
		
		//Gruppo g1=new Gruppo("social");
		ElementAppStore store1=new GoogleStore();
		ElementAppStore store2=new WinStore();
		App app1=new App("whatsapp2",store1);
		App app2=new App("whatsapp2",store2);
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
	
		//dati google
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
		d.setPackage_name_overview(app1.getNomeApp());
		d.setDaily_average_overview(daily2);
		d.setTotal_average_overview(daily2);
		
		//carrier
		d.setData_carrier(date);
		d.setPackage_name_carrier(app1.getNomeApp());
		d.setCarrier(carrier);
		d.setDaily_average_carrier(daily2);
		d.setTotal_average_carrier(daily2);
		
		//country
		d.setData_country(date);
		d.setPackage_name_country(app1.getNomeApp());
		d.setCountry(country);
		d.setDaily_average_country(daily2);
		d.setTotal_average_country(daily2);
		
		//device
		
		d.setData_device(date);
		d.setPackage_name_device(app1.getNomeApp());
		d.setDevice(device);
		d.setDaily_average_device(daily2);
		d.setTotal_average_device(daily2);
		
		//language
		
		d.setData_language(date);
		d.setPackage_name_language(app1.getNomeApp());
		d.setLanguage(language);
		d.setDaily_average_language(daily2);
		d.setTotal_average_language(daily2);
		
		//os_version
		
		d.setData_os_version(date);
		d.setPackage_name_os_version(app1.getNomeApp());
		d.setOs_version(Os_version);
		d.setDaily_average_os_version(daily2);
		d.setTotal_average_os_version(daily2);
		
		//tablet
		d.setData_tablet(date);
		d.setPackage_name_tablet(app1.getNomeApp());
		d.setTablet(Os_version);
		d.setDaily_average_tablet(daily2);
		d.setTotal_average_tablet(daily2);
		
		//app_version
		d.setData_app_version(date);
		d.setPackage_name_app_version(app1.getNomeApp());
		d.setApp_version(app_version);
		d.setDaily_average_app_version(daily2);
		d.setTotal_average_app_version(daily2);
		
		//winstore
		
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
		
		app1.setDati(d);
		app2.setDati(d);
		listApp.add(app1);
		listApp.add(app2);
		g2.setApps(listApp);
			
		
		g2.setDatiAggregati(datiAggregati2);
		g2.visualizzazioneDati();
	
	}
	
	//ipotesi in cui provo a visualizare un gruppo vuoto,ovvero senza app
	@Test
	public void testVisualizzazioneGruppoVuotoSenzaApp()
	{
		Gruppo g3=new Gruppo("chat3");
		g3.visualizzazioneDati();
	}
	
	
	//ipotesi in cui provo a visualizzare un gruppo che ha le app con dati vuoti
	@Test
	public void testVisualizzazioneGruppoConAppSenzaDati()
	{
		Gruppo g4=new Gruppo("chat4");
		ElementAppStore store1=new GoogleStore();
		ElementAppStore store2=new WinStore();
		App app1=new App("whatsapp4",store1);
		App app2=new App("whatsapp4",store2);
		ArrayList<App> listApp=new ArrayList<App>();
		listApp.add(app1);
		listApp.add(app2);
		g4.setApps(listApp);
		g4.visualizzazioneDati();
	}
	
	
	
}
