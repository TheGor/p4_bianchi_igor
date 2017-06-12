package p4_bianchi_igor;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		
	
		ArrayList<Gruppo> gruppi=new ArrayList<Gruppo>();
		ElementAppStore win=new WinStore();
		ElementAppStore google=new GoogleStore();
		ArrayList<App> apps = new ArrayList<App>();
		ArrayList<App> apps2 = new ArrayList<App>();
		ArrayList<App> apps3 = new ArrayList<App>();
		
		
		ArrayList<Integer> daily = new ArrayList<Integer>();
		ArrayList<Double> daily2=new ArrayList<Double>();
		
		Dati d = new Dati();
		Dati dAggregati=new Dati();
		
		App a = new App("facebook",win);
		App b=new App("instagram",google);
		App c=new App("food",google);
		App e=new App("drink",google);
		App f=new App("football",win);
		App g=new App("basket",win);
		
		//aggiunta app alle liste app
		apps.add(a);
		apps.add(b);
		apps2.add(c);
		apps2.add(e);
		apps3.add(f);
		apps3.add(g);
		
		//creo il sistema con un arraylist di gruppi
		Sistema sistema=new Sistema(null,null,gruppi);
		sistema.creazioneGruppo();
		sistema.creazioneGruppo();
		sistema.creazioneGruppo();
		
		//aggiungo ai gruppi le loro liste app
		sistema.getGruppi().get(0).setApps(apps);
		sistema.getGruppi().get(1).setApps(apps2);
		sistema.getGruppi().get(2).setApps(apps3);
		
		
		
		//generatore di dati interi random
		for(int i = 0; i < 5; i++){
			for(int j = 0; j<100; j++){
				daily.add((int)(Math.random() * 100));
				daily2.add((double)Math.round((double)Math.random()*5));
			}
		}
		
		//genero dati stringhe
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
		
		for(int i=0;i<sistema.getGruppi().size();i++)
		{
			for(int j=0;j<sistema.getGruppi().get(i).getApps().size();j++)
			{
				//overview
				d.setData_overview(date);
				d.setPackage_name_overview(sistema.getGruppi()
						.get(i).getApps().get(j).getNomeApp());
				d.setDaily_average_overview(daily2);
				d.setTotal_average_overview(daily2);
				
				//carrier
				d.setData_carrier(date);
				d.setPackage_name_carrier(sistema.getGruppi()
						.get(i).getApps().get(j).getNomeApp());
				d.setCarrier(carrier);
				d.setDaily_average_carrier(daily2);
				d.setTotal_average_carrier(daily2);
				
				//country
				d.setData_country(date);
				d.setPackage_name_country(sistema.getGruppi()
						.get(i).getApps().get(j).getNomeApp());
				d.setCountry(country);
				d.setDaily_average_country(daily2);
				d.setTotal_average_country(daily2);
				
				//device
				
				d.setData_device(date);
				d.setPackage_name_device(sistema.getGruppi()
						.get(i).getApps().get(j).getNomeApp());
				d.setDevice(device);
				d.setDaily_average_device(daily2);
				d.setTotal_average_device(daily2);
				
				//language
				
				d.setData_language(date);
				d.setPackage_name_language(sistema.getGruppi()
						.get(i).getApps().get(j).getNomeApp());
				d.setLanguage(language);
				d.setDaily_average_language(daily2);
				d.setTotal_average_language(daily2);
				
				//os_version
				
				d.setData_os_version(date);
				d.setPackage_name_os_version(sistema.getGruppi()
						.get(i).getApps().get(j).getNomeApp());
				d.setOs_version(Os_version);
				d.setDaily_average_os_version(daily2);
				d.setTotal_average_os_version(daily2);
				
				//tablet
				d.setData_tablet(date);
				d.setPackage_name_tablet(sistema.getGruppi()
						.get(i).getApps().get(j).getNomeApp());
				d.setTablet(Os_version);
				d.setDaily_average_tablet(daily2);
				d.setTotal_average_tablet(daily2);
				
				//app_version
				d.setData_app_version(date);
				d.setPackage_name_app_version(sistema.getGruppi()
						.get(i).getApps().get(j).getNomeApp());
				d.setApp_version(app_version);
				d.setDaily_average_app_version(daily2);
				d.setTotal_average_app_version(daily2);
			}
		}
		
		
		///////////////////////////////////////////
		
		//WINSTORE
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
		

		
		//proveeeee
		
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
		dAggregati.setFailure_data(date);
		
		
		//DATI AGGREGATI GOOGLE
		//overview
		dAggregati.setOverview_dailyUserInstalls(daily);
		dAggregati.setOverview_totUserInstalls(daily);//tot
		dAggregati.setOverview_dailyUserUninstalls(daily);
		dAggregati.setOverview_activeDeviceInstalls(daily);
				
		//carrier
		dAggregati.setCarrier_totUserInstalls(daily);//tot
		dAggregati.setCarrier_dailyUserInstalls(daily);
		dAggregati.setCarrier_dailyUserUninstalls(daily);
		dAggregati.setCarrier_activeDeviceInstalls(daily);
		
		//country
		dAggregati.setCountry_dailyUserInstalls(daily);
		dAggregati.setCountry_totUserInstalls(daily);//tot;
		dAggregati.setCountry_dailyUserUninstalls(daily);
		dAggregati.setCountry_activeDeviceInstalls(daily);
				
		//device
		dAggregati.setDevice_totUserInstalls(daily);//tot
		dAggregati.setDevice_dailyUserInstalls(daily);
		dAggregati.setDevice_dailyUserUninstalls(daily);
		dAggregati.setDevice_activeDeviceInstalls(daily);
				
		//lang
		dAggregati.setLang_totUserInstalls(daily);//tot
		dAggregati.setLang_dailyUserInstalls(daily);
		dAggregati.setLang_dailyUserUninstalls(daily);
		dAggregati.setLang_activeDeviceInstalls(daily);
			
		//osversion
		dAggregati.setOsVersion_dailyUserInstalls(daily);
		dAggregati.setOsVersion_totUserInstalls(daily);//tot
		dAggregati.setOsVersion_dailyUserUninstalls(daily);
		dAggregati.setOsVersion_activeDeviceInstalls(daily);
			
		//tablet
		dAggregati.setTablet_totUserInstalls(daily);//tot
		dAggregati.setTablet_dailyUserInstalls(daily);
		dAggregati.setTablet_dailyUserUninstalls(daily);
		dAggregati.setTablet_activeDeviceInstalls(daily);
		
		//failure
		dAggregati.setFailure_count(daily);
		
		//RATINGS GOOGLE AGGREGATI
		
		//overview
		dAggregati.setDaily_average_overview(daily2);
		dAggregati.setTotal_average_overview(daily2);
		
		//carrier
		dAggregati.setDaily_average_carrier(daily2);
		dAggregati.setTotal_average_carrier(daily2);
		
		//country
		dAggregati.setDaily_average_country(daily2);
		dAggregati.setTotal_average_country(daily2);
		
		//device
		dAggregati.setDaily_average_device(daily2);
		dAggregati.setTotal_average_device(daily2);
		
		//language
		dAggregati.setDaily_average_language(daily2);
		dAggregati.setTotal_average_language(daily2);
		
		//osversion
		dAggregati.setDaily_average_os_version(daily2);
		dAggregati.setTotal_average_os_version(daily2);
		
		//tablet
		
		dAggregati.setDaily_average_tablet(daily2);
		dAggregati.setTotal_average_tablet(daily2);
		
		//app_version
				
		dAggregati.setDaily_average_app_version(daily2);
		dAggregati.setTotal_average_app_version(daily2);
		
		
		
		
		
		//setto i dati nelle applicazioni
		a.setDati(d);
		b.setDati(d);
		c.setDati(d);
		e.setDati(d);
		f.setDati(d);
		g.setDati(d);
		
		
		System.out.println("scegli il gurppo di cui visualizzare i dati tra     ");
		for (int i=0;i<sistema.getGruppi().size();i++)
		{
			System.out.println(sistema.getGruppi().get(i).getNomeGruppo());
			
		}
		
		
		
		String scelta=Input.readLine();
		for(int i=0;i<sistema.getGruppi().size();i++)
		{
			if(scelta.equals(sistema.getGruppi().get(i).getNomeGruppo()))
			{
				sistema.getGruppi().get(i).setDatiAggregati(dAggregati);
				sistema.getGruppi().get(i).scaricamentoDati();
				break;
			}
		}
	}
}
