package p4_bianchi_igor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Classe per la definizione di App
 */
public class App{
    /** Attributi */
    private String nomeApp;
    private ElementAppStore store;
    /** Associazioni */
    private Dati dati;
    
    //costruttore
    public App(String nomeApp,ElementAppStore store)
    {
    	this.nomeApp=nomeApp;
    	this.store=store;
    }
    
    /**
     * Funzione che prepara la stampa
     * ovvero racchiude sotto forma di stringa tutti
     * i dati da stampare
     * 
     * @return String, ritorna sempre una stringa
     *
     */
    
    public String preparazioneStringaDati()
    {
    	
   
    	//Da qui in poi si prepara la visualizzazione dei dati
    	//i dati sono divisi in due report (installs e rating) e sono divisi 
    	//in base alla provenienza (google o winstore)
    	
    	//per ogni categoria dei dati vengono impostati i titoli dei relativi 
    	//dati e i dati numerici/stringhe, in caso di dati mancanti si mette una
    	//stringa di errore(ad esempi dati non disponibili)
    	
    	//Ho cercato di ricreare una sorta di tabella
    	
    	String stampa="";
    	String spazio="\n";
    	
    	//controllo se l'attributo dati è null(vedi test)
    	if(this.dati!=null)
    	{
	    	String sep="\t"+"\t"+"\t"+"\t";
	    	String sep1="       ";
	    	String sep2="\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t";
	    	String sep3="\t"+"\t"+"\t";
	    	
	    	//controllo di che stro è l'app per stampare i dati 
	    	//relativi
	    	//siccome ci sono stati forniti solo i report relativi a 
	    	//google e winstore il caso di AppleStore non viene gestito
	    	
	    	String s = this.store.toString().substring(this.store.toString().indexOf('.')+1
	    			,this.store.toString().indexOf('@'));
	    	if(s.equals("GoogleStore"))
	    	{
	    		
	    		//app del google store
	    		stampa=stampa+spazio+
	    		"************************************************************"
	    		+ "***********************************************************"
	    		+ "***************************************"
	    		+spazio
	    		//impostazione dei titoli per la stampa
	    		+sep2+"Nome App:   "+nomeApp+
		    	spazio+
		    	sep2+"Provenienza: "+s+
		    	spazio+
		    	sep2+"Dati riguardanti:   INSTALLS"
		    	+spazio+
		    	sep2+"Tipo di Dato:   Overview"+
		    	spazio+spazio+
		    	"Overview_data"+sep1+"Overview_dailyUserInstalls"+sep1+"Overview_totUserInstalls"+
		    	sep1+"Overview_dailyUserUninstalls"+sep1+"Overview_activeDeviceInstalls";
		    	
	    		//dati overview
	    		
	    		if(this.getDati().getOverview_data()!=null)
		    	{
		    		for(int i=0;i<this.getDati().getOverview_data().size();i++)
		    		{
		    			stampa=stampa+spazio+spazio;
		    			stampa=stampa+this.getDati().getOverview_data().get(i)+sep
		    				+this.getDati().getOverview_dailyUserInstalls()
		    				.get((int)(Math.random() * 100))+
		    				sep+this.getDati().getOverview_totUserInstalls()
		    				.get((int)(Math.random() * 100))
		    				+sep+this.getDati().getOverview_dailyUserUninstalls()
		    				.get((int)(Math.random() * 100))+sep
		    				+this.getDati().getOverview_activeDeviceInstalls()
		    				.get((int)(Math.random() * 100));
		    		}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+"DATI NON DISPONIBILI";
		    	}
		    	
		    	//dati carrier
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   Carrier"
		    	+spazio+spazio
		    	+"Carrier_data"+sep1+"Carrier_dailyUserInstalls"+sep1
		    	+"Carrier_dailyUserUninstalls"
		    	+sep1+"Carrier_activeDeviceInstalls"+sep1+"Carrier_totUserInstalls";
		       	
		    	if(this.getDati().getCarrier_data()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getCarrier_data().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getCarrier_data().get(i)+sep
			    			+this.getDati().getCarrier_dailyUserInstalls().
			    			get((int)(Math.random() * 100))+
			    			sep+this.getDati().getCarrier_dailyUserUninstalls()
			    			.get((int)(Math.random() * 100))
			    			+sep+this.getDati().getCarrier_activeDeviceInstalls()
			    			.get((int)(Math.random() * 100))+sep
			    			+this.getDati().getCarrier_totUserInstalls()
			    			.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	
		    	//country data
		    	
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   Country"
		    	+spazio+spazio
		    	+"Country_data"+sep1+"Country_dailyUserInstalls"+sep1
		    	+"Country_dailyUserUninstalls"
		    	 +sep1+"Country_activeDeviceInstalls"+sep1+"Country_totUserInstalls";
		    	
		    	
		    	if(this.getDati().getCountry_data()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getCountry_data().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getCountry_data().get(i)
			    				+sep+this.getDati().getCountry_dailyUserInstalls()
			    				.get((int)(Math.random() * 100))+
			    				sep+this.getDati().getCountry_dailyUserUninstalls()
			    				.get((int)(Math.random() * 100))
			    				+sep+this.getDati().getCountry_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100))
			    				+sep
			    				+this.getDati().getCountry_totUserInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	//device data
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   Device"+
		    	spazio+spazio+
		    	"Device_data"+sep1+"Device_dailyUserInstalls"+sep1
		    	+"Device_dailyUserUninstalls"+
		    	 sep1+"Device_activeDeviceInstalls"+sep1+"Device_totUserInstalls";
		    	
		    	
		    	if(this.getDati().getDevice_data()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getDevice_data().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getDevice_data().get(i)+
			    				sep+this.getDati().getDevice_dailyUserInstalls()
			    				.get((int)(Math.random() * 100))+
			    				sep+this.getDati().getDevice_dailyUserUninstalls()
			    				.get((int)(Math.random() * 100))
			    				+sep+this.getDati().getDevice_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100))+sep
			    				+this.getDati().getDevice_totUserInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	//Lang data
		    	stampa=stampa+spazio+spazio+
		    	sep2+"Tipo di Dato:   Lang"+
		    	spazio+spazio+
		    	"Lang_data"+sep1+"Lang_dailyUserInstalls"+sep1+"Lang_dailyUserUninstalls"+
		    	 sep1+"Lang_activeDeviceInstalls"+sep1+"Lang_totUserInstalls";
		    	
		    	if(this.getDati().getLang_data()!=null)
		    	{
		    	
			    	for(int i=0;i<this.getDati().getLang_data().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getLang_data().get(i)+
			    				sep+this.getDati().getLang_dailyUserInstalls()
			    				.get((int)(Math.random() * 100))+
			    				sep+this.getDati().getLang_dailyUserUninstalls()
			    				.get((int)(Math.random() * 100))+
			    				sep+this.getDati().getLang_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100))+sep
			    				+this.getDati().getLang_totUserInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
			    	
		    	//OS data
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   OS"
		    	+spazio+spazio
		    	+"OsVersion_data"+sep1+"OsVersion_dailyUserInstalls"+sep1
		    	+"OsVersion_dailyUserUninstalls"+
		    	 sep1+"OsVersion_activeDeviceInstalls"+sep1+"OsVersion_totUserInstalls";
		    	
		    	
		    	if(this.getDati().getOsVersion_data()!=null)
		    	{
		    	
			    	for(int i=0;i<this.getDati().getOsVersion_data().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getOsVersion_data().get(i)
			    				+sep+this.getDati().getOsVersion_dailyUserInstalls()
			    				.get((int)(Math.random() * 100))+
			    				sep+this.getDati().getOsVersion_dailyUserUninstalls()
			    				.get((int)(Math.random() * 100))
			    				+sep+this.getDati().getOsVersion_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100))+sep
			    				+this.getDati().getOsVersion_totUserInstalls()
			    				.get((int)(Math.random() * 100));
			    	}	
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	
		    	
		    	//tablet data
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   Tablet"
		    	+spazio+spazio+
		    	"tablet_data"+sep1+"tablet_dailyUserInstalls"+sep1
		    	+"tablet_dailyUserUninstalls"+
		    	 sep1+"tablet_activeDeviceInstalls"+sep1+"tablet_totUserInstalls";
		    	
		    	
		    	if(this.getDati().getTablet_data()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getTablet_data().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getTablet_data().get(i)+sep
			    			+this.getDati().getTablet_dailyUserInstalls()
			    			.get((int)(Math.random() * 100))+
			    			sep+this.getDati().getTablet_dailyUserUninstalls()
			    			.get((int)(Math.random() * 100))
			    			+sep+this.getDati().getTablet_activeDeviceInstalls()
			    			.get((int)(Math.random() * 100))+sep
			    			+this.getDati().getTablet_totUserInstalls()
			    			.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	
		    	//DATI RIGURDANTI IL RATING
		    	
		    	stampa=stampa+spazio+spazio+
		    	sep2+"Nome App:   "+nomeApp
		    	+spazio
		    	+sep2+"Provenienza: "+s
		    	+spazio
		    	+sep2+"Dati riguardanti:   RATING"
		    	+spazio
		    	+sep2+"Tipo di Dato:   Overview";
		    	
		    	//overview
		    	stampa=stampa+spazio+spazio
		    	+"data_overview"+sep1+"package_name_overview"+sep1
		    	+"daily_average_overview"+sep1+"total_average_overview";
		    	
		    	if(this.getDati().getData_overview()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getData_overview().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getData_overview().get(i)+sep3
			    				+this.getDati().getPackage_name_overview()+
			    				sep3+this.getDati().getDaily_average_overview()
			    				.get((int)(Math.random() * 100))
			    				+sep3+this.getDati().getTotal_average_overview()
			    				.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	//carrier
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   Carrier"+
		    	spazio+spazio+
		    	"data_carrier"+sep1+"package_name_carrier"+sep1+sep1+sep1+"carrier"
		    	+sep1+"daily_average_carrier"+sep1+"total_average_carrier";
		    	
		    	if(this.getDati().getData_carrier()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getData_carrier().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getData_carrier().get(i)
			    				+sep3+this.getDati().getPackage_name_carrier() 
			    				+sep3+this.getDati().getCarrier().get(i)+
			    				sep3+this.getDati().getDaily_average_carrier()
			    				.get((int)(Math.random() * 100))
			    				+sep3+this.getDati().getTotal_average_carrier()
			    				.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}	
		    	//country
		    	stampa=stampa+spazio+spazio
		    				+sep2+"Tipo di Dato:   Country"+
		    				spazio+spazio+
		    				"data_country"+sep1+"package_name_country"
		    				+sep1+sep1+sep1+"country"+sep1+""
		    				+ "daily_average_country"+sep1+"total_average_country";
		    	
		    	if(this.getDati().getData_country()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getData_country().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getData_country().get(i)+sep3
			    				+this.getDati().getPackage_name_country()+sep3
			    				+this.getDati().getCountry().get(i)+
			    				sep3+this.getDati().getDaily_average_country()
			    				.get((int)(Math.random() * 100))
			    				+sep3+this.getDati().getTotal_average_country()
			    				.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	//device
		    	stampa=stampa+spazio+spazio+
		    	sep2+"Tipo di Dato:   Device"
		    	+spazio+spazio
		    	+"data_device"+sep1+"package_name_device"+sep1+sep1+sep1+
		    	"device"+sep1+"         daily_average_device"+sep1
		    	+"total_average_device";
		    	
	
		    	if(this.getDati().getData_device()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getData_device().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getData_device().get(i)
			    				+sep3
			    				+this.getDati().getPackage_name_device()
			    				+sep3+this.getDati().getDevice().get(i)+
			    				sep3+this.getDati().getDaily_average_device()
			    				.get((int)(Math.random() * 100))+sep3
			    				+this.getDati().getTotal_average_device().
			    				get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	//language
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   Language"
		    	+spazio+spazio
		    	+"data_device"+sep1+"package_name_language"+sep1+sep1+sep1+
		    	"language"+sep1+"daily_average_language"+sep1+"total_average_language";
		    	
		    	if(this.getDati().getData_language()!=null)
		    	{
		    	
			    	for(int i=0;i<this.getDati().getData_language().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getData_language().get(i)+sep3
			    				+this.getDati().getPackage_name_language()+sep3
			    				+this.getDati().getLanguage().get(i)+
			    				sep3+this.getDati().getDaily_average_language().
			    				get((int)(Math.random() * 100))
			    				+sep3+this.getDati().getTotal_average_language()
			    				.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	
		    	//OS
		    	stampa=stampa+spazio+spazio+
		    	sep2+"Tipo di Dato:    Os_verison"+
		    	spazio+spazio
		    	+"data_Os_verison"+sep1+"package_name_Os_verison"+sep1+sep1+sep1
		    	+"Os_verison"+sep1+"daily_average_Os_verison"+sep1
		    	+"total_average_Os_verison";
		    	
		    	if(this.getDati().getData_os_version()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getData_os_version().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getData_os_version().get(i)+sep3
			    				+this.getDati().getPackage_name_os_version()+sep3
			    				+this.getDati().getOs_version().get(i)+
			    				sep3+this.getDati().getDaily_average_os_version()
			    				.get((int)(Math.random() * 100))+sep3
			    				+this.getDati().getTotal_average_os_version()
			    				.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}	
		    	//tablet
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:    Tablet"
		    	+spazio+spazio
		    	+"data_tablet"+sep1+"package_name_tablet"+sep1+sep1+sep1+
		    	"   tablet"+sep1+sep1+sep1+"daily_average_tablet"+sep1+"total_average_tablet";
		    	
		    	if(this.getDati().getData_tablet()!=null)
		    	{
			    	
			    	for(int i=0;i<this.getDati().getData_tablet().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getData_tablet().get(i)
			    				+sep3+this.getDati().getPackage_name_tablet()+sep3
			    				+this.getDati().getTablet().get(i)+
			    				sep3+this.getDati().getDaily_average_tablet()
			    				.get((int)(Math.random() * 100))+sep3
			    				+this.getDati().getTotal_average_tablet()
			    				.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	
		    	//app data
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:    App Version"
		    	+spazio+spazio
		    	+"data_app_version"+sep1+"package_name_app_version"
		    	+sep1+"app_version"+sep1+"daily_average_app_version"
		    	+sep1+"total_average_app_version";
		    	
		    	if(this.getDati().getData_app_version()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getData_app_version().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getData_app_version().get(i)
			    				+sep3+this.getDati().getPackage_name_app_version()
			    				+sep3+this.getDati().getApp_version().get(i)+
			    				sep3+this.getDati().getDaily_average_overview()
			    				.get((int)(Math.random() * 100))
			    				+sep3+this.getDati().getTotal_average_overview()
			    				.get((int)(Math.random() * 100));
			    	}
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	
		    
		    	
	    	}
	    
	    	//WINSTORE
	    	//Stessa impostazione per il win store
	    	
	    	//titoli dei dati
	    	//dati
	    	
	    	else if(s.equals("WinStore"))
	    	{
	    		
	    		stampa=stampa+spazio+
	    		"***************************************************************"
	    		+ "**************************************************************"
	    		+ "*********************************"+
	    		spazio+
	    		sep2+"Nome App:   "+nomeApp
	    		+spazio
	    		+sep2+"Provenienza: "+s
		    	+spazio
		    	+sep2+"Dati riguardanti:   INSTALLS"
		    	+spazio
		    	//Overview
		    	+sep2+"Tipo di Dato:   Overview"
		    	+spazio+spazio
		    	+"Overview_data"+sep1+"Overview_dailyUserInstalls";
			    if (this.getDati().getOverview_data()!=null)
			    {
			    	for(int i=0;i<this.getDati().getOverview_data().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getOverview_data().get(i)
			    				+sep+this.getDati().getOverview_dailyUserInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
			    }
			    else
			    {
			    	stampa=stampa+spazio+spazio;
			    	stampa=stampa+sep2+"DATI NON DISPONIBILI";
			    }
		    	//country
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   Country"
		    	+spazio+spazio
		    	+"Country_data"+sep1+"Country_dailyUserInstalls";
		    	
		    	if (this.getDati().getCountry_data()!=null)
				{
	
			    	for(int i=0;i<this.getDati().getCountry_data().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getCountry_data().get(i)+sep
			    				+this.getDati().getCountry_dailyUserInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
				}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}	
	        	//osVersion
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   OsVersion"
		    	+spazio+spazio
		    	+"OsVersion_data"+sep1+"OsVersion_dailyUserInstalls";
		    	if (this.getDati().getOsVersion_data()!=null)
				{
	
			    	for(int i=0;i<this.getDati().getOsVersion_data().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getOsVersion_data().get(i)+sep
			    				+this.getDati().getOsVersion_dailyUserInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
				}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}	
		    	
		    	//failure
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   Failure"
		    	+spazio+spazio
		    	+"Failure_data"+sep1+"Failure_count";
		    	if (this.getDati().getFailure_data()!=null)
				{
			    	for(int i=0;i<this.getDati().getFailure_data().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getFailure_data().get(i)+sep
			    				+this.getDati().getFailure_count()
			    				.get((int)(Math.random() * 100));
			    	}
				}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
		    	
		    	//ratings
		    	stampa=stampa+spazio+spazio+
		    	sep2+"Nome App:   "+nomeApp
		    	+spazio
		    	+sep2+"Provenienza: "+s
		    	+spazio
		    	+sep2+"Dati riguardanti:   RATING"
		    	+spazio
		    	+sep2+"Tipo di Dato:   Rating new and revised"
		    	+spazio+spazio
		    	+"count_new"+"\t\t\t\t"+"count_revised";
		    	
		    	stampa=stampa+spazio+spazio;
		    	stampa=stampa+this.getDati().getCount_new()+sep
		    			+"\t"+this.getDati().getCount_revised();
			   
			
		    	//ratings over
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   Rating average over time"
		    	+spazio+spazio
		    	+"name"+"\t\t\t\t"+"date_win"+"\t\t\t\t"+"count_average";
		    	if (this.getDati().getDate_win()!=null)
				{
			    	for(int i=0;i<this.getDati().getDate_win().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getName()+sep
			    				+this.getDati().getDate_win().get(i)+sep
			    				+this.getDati().getCount_average().get(i);
			    	}
				}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
			    //markets
		    	stampa=stampa+spazio+spazio
		    	+sep2+"Tipo di Dato:   Markets"
		    	+spazio+spazio
		    	+"market"+"\t\t\t\t"+"Average_rating"+"\t\t\t"+"number_rating";
		    	if (this.getDati().getMarket()!=null)
		    	{
			    	for(int i=0;i<this.getDati().getMarket().size();i++)
			    	{
			    		stampa=stampa+spazio+spazio;
			    		stampa=stampa+this.getDati().getMarket().get(i)+sep
			    				+this.getDati().getAverage_rating()
			    				.get((int)(Math.random() * 100))+sep
			    				+this.getDati().getNumber_rating()
			    				.get((int)(Math.random() * 100));
			    	}
			    	
		    	}
		    	else
		    	{
		    		stampa=stampa+spazio+spazio;
		    		stampa=stampa+sep2+"DATI NON DISPONIBILI";
		    	}
	    	
	    	}
	
    	}
    	else
    	{
    		stampa=stampa+"************************************************"
    				+ "*******************************************************"
    				+ "*****************************************************";
    		stampa=stampa+spazio+spazio;
    		stampa=stampa+"DATI  APP NON DISPONIBILI";
    	}
    	
    	
    	return stampa;
    	
    }
    
    /**
     * Funzione per l'estrazione dei dati di un'App dal suo AppStore
     *
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean estrazioneDatiApp(){
    	
    	return false;
    }
    
    /**
     * Funzione per la normalizzazione dei dati di un App
     *
     */
    public void normalizzazioneDati(){
    	
    }
    
    /**Funzione per la visualizzazione dei dati
     * stampa a schermo tutti i dat dell'app,
     * se non ci sono dati stampa un messaggio 
     * di errore
     */
    
    public void visualizzazioneDati()
    {
     	//this.estrazioneDati()
    	//vengono estratti i dati relativi all'app
    	
    	//this.normalizzazioneDati()
    	//vengono normalizzati i dati relativi all'app ovvero si crea l' oggetto
    	//dati da associare all'app
    	
    	//questi metodi sono messi come commento poichè il settaggio dei dati
    	//viene fatto tutto nel main, che ho usato per vedere il corretto funzionamento
    	//della visualizzazione
    	
    	//estrazione e normalizzazione sono uc di competenza dei miei colleghi
    	
    	//usa la funzione che prepara la stampa
    	String visualizzazioneDatiApp=this.preparazioneStringaDati();
    	//stampa a schermo i dati
    	System.out.println(visualizzazioneDatiApp);
    }
    
    
    
    
    /**
     * Funzione per scaricare i dati di un'App
     * crea un file di testo che contiene
     * tutti i dati relativi all'app
     *    
    */
    public void scaricamentoDati()
    {
    	//da use scase richiamo la visualizzazione dati
    	
    	//creo un file e scrivo all'interno del file la stringa
    	//ritornata da preparazioneStringDati();
    	
    	//il metodo a differenza di come descritto nel class diagram restituisce
    	//un void al posto del file poichè il file viene salvato direttamente in locale
    	
    	this.visualizzazioneDati();
    	System.out.println("Insersci percorso e nome del file:     ");
    	String percorso=Input.readLine();
    	this.salvataggioFile(percorso,this.preparazioneStringaDati());
    }
    
    public boolean salvataggioFile(String percorso,String dati) 
    {    
    	try 
    	{
    		File file = new File(percorso);
            FileWriter fw = new FileWriter(file);
            fw.write(dati);
            fw.flush();
            fw.close();
            return true;
        }
        catch(IOException e) 
    	{
            e.printStackTrace();
        }
    	return false;
    }
   
 
	public String getNomeApp() {
		return nomeApp;
	}
	public void setNomeApp(String nomeApp) {
		this.nomeApp = nomeApp;
	}
	public Dati getDati() {
		return dati;
	}
	public void setDati(Dati dati) {
		this.dati = dati;
	}
	public ElementAppStore getStore() {
		return store;
	}
	public void setStore(ElementAppStore store) {
		this.store = store;
	}
	
}