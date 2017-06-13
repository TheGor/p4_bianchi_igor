package p4_bianchi_igor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Classe per la definizione di Gruppo
 */
public class Gruppo
{
    /** Attributi */
	/** Associations */
    private String nomeGruppo; 
    private Dati datiAggregati;
    private ArrayList<App> apps; 
    public Gruppo(String nomeGruppo)
    {
    	this.nomeGruppo=nomeGruppo;
   
    }
	public String getNomeGruppo() 
	{
		return nomeGruppo;
	}
	public Dati getDatiAggregati() 
	{
		return datiAggregati;
	}
	public ArrayList<App> getApps() 
	{
		return apps;
	}
	public void setNomeGruppo(String nomeGruppo) {
		this.nomeGruppo = nomeGruppo;
	}
	public void setDatiAggregati(Dati datiAggregati) {
		this.datiAggregati = datiAggregati;
	}
	public void setApps(ArrayList<App> apps) {
		this.apps = apps;
	}

	/**
	 * Funzione che prepara la stampa
     * ovvero racchiude sotto forma di stringa tutti
     * i dati da stampare
     * (usata per evitare la ripetizione di codice per lo
     * scaricamento)
     * ritorna una stringa
	 * @return
	 */
	
	
	public String preparazioneDatiStringa()
    {
    	//this.estrazioneDati() 
    	//questo metodo estrae i dati delle app del gruppo, viene riposrtato in commento poichè
    	//i dati sono creati e settati nel main non essendo il mio use case
    	//di competenza
    	
    	//forall app in gruppo
    	//app.normalizzazioneDati()
    	//questo metodo normalizza i dati per ogni app creando la classe dati descritta
    	//nel class diagram e associa i dati a ciascuna app del gruppo
    	
    	//this.aggregazioneDati()
    	//crea un oggetto di tipo dati che contiene i dati aggregati delle app
    	//presenti nel gruppo
    	
    	//queste funzionalità sono messe in commento poichè il loro lavoro
    	//viene svolto nel main dove vengono creati le classi dati e vengono
    	//settati i loro valori per poter poi essere assegnati.
    	//Questo è stato fatto poichè queste funzioni sono altri use case 
    	//implementati dai miei colleghi
		
		//come dato aggregato viene preso l'elemento 0 di ogni array
		//che in realtà sono due: un arraylist per i dati interi
		//e un arraylist double per i double
		//Viene preso l'elemento 0 poichè l'aggregazione (come concordato con il collega
		//dell'aggregazione) mette il dato aggregato nella posizione 0
		//Siccome io utilizzo lo stesso array il dato stampato sarà sempre uguale,
		//la mia priorità era organizzare la stampa
		
		//questo metodo è un metodo ausiliario per evitare la ripetizione di  codice
		//nello scaricamento e per preparare la stampa
		//mettendo tutti i dati in un unica stringa
		//Il codice è composto da tanti cicli for che prendono
		//e incolonnano i dati, controllando se il dato esiste
		//se c'è viene stampato,se no ciene stampato ND
    	
    	boolean visualizzazione=true;
    	String stampaGruppo="";
    	String sep="\t"+"\t"+"\t"+"\t";
    	String sep1="       ";
    	String sep2="\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t";
    	String spazio="\n";
    	String sep3="\t"+"\t"+"\t";
    	
    	//controllo sei i dati nelle app sono nulli o meno
    	if(this.getApps()!=null)
    	{
	    	for(int i=0;i<this.getApps().size();i++)
	    	{
	    		if(this.getApps().get(i).getDati()==null)
	    		{
	    			visualizzazione=false;
	    			break;
	    		}
	    	}
    	}
    	else
    	{
    		visualizzazione=false;
    	}
    	if(visualizzazione==true)
    	{	
    		
	    	//divido i casi di aggregazione:
	    	
	    	//se il gruppo è formato da sole app del google store stamperà solo i dati
    		//aggregati di google
	    	
	    	//se sono tutte del winstore stamperà solo i dati aggregati del win
	    	
	    	//se sono di store diversi stamperà solo alcuni dati aggregati
	    
	    	int controllo=0;
	    	int controllo1=0;
	    	for (int i=0;i<this.apps.size()-1;i++)
	    	{
	    		if (this.apps.get(i).getStore().equals(this.apps.get(i+1).getStore()))
	    		{
	    			controllo=1;
	    			if (this.apps.get(i).getStore().toString().substring(this.apps.get(i)
	    					.getStore().toString().indexOf('.')+1,this.apps.get(i)
	    					.getStore().toString().indexOf('@')).
	    					equals("GoogleStore"))
	    			{
	    				controllo1=1;
	    			}
	    			else if (this.apps.get(i).getStore().toString().substring(this.apps.get(i)
	    					.getStore().toString().indexOf('.')+1,this.apps.get(i)
	    					.getStore().toString().indexOf('@')).
	    					equals("WinStore"))
	    			{
	    				controllo1=0;
	    			}
	    			
	    		}
	    		else
	    		{
	    			controllo=0;
	    		}
	    	}
	    	
	    	
	    	//google store aggregazione
	    	if(controllo==1 && controllo1==1)
	    	{
	    		stampaGruppo=stampaGruppo+"*************************************************"
	    				+ "************************"
	    				+ "*************************************************************************************"
	    		+spazio+spazio
	    		+sep2+"Nome Gruppo:   "+nomeGruppo
		    	+spazio+spazio
		    	+sep2+"Dati riguardanti:   INSTALLS"
		    	+spazio+spazio
		    	+sep2+"Tipo di Dato:   Overview"
		    	+spazio+spazio
		    	
	    		+"Overview_dailyUserInstalls"+sep1
		    	+"Overview_totUserInstalls"+
		    	sep1+"Overview_dailyUserUninstalls"
		    	+sep1+"Overview_activeDeviceInstalls";
		    	
		    
		    		
	    		if(this.getDatiAggregati().getOverview_dailyUserInstalls()==null)
		    	{
	    			stampaGruppo=stampaGruppo+spazio+spazio;
	    			stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getOverview_dailyUserInstalls().get(0);
		    	}
		    	if(this.getDatiAggregati().getOverview_totUserInstalls()==null)
				{
		    		stampaGruppo=stampaGruppo+sep+"ND";
				}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getOverview_totUserInstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getOverview_dailyUserUninstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getOverview_dailyUserUninstalls()
		    				
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getOverview_activeDeviceInstalls()==null)
		    	{
		    	
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getOverview_activeDeviceInstalls()
		    				.get(0);
		    	}
		    
		    	
		    	
		    	
			    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	
				
				//carrier
			    stampaGruppo=stampaGruppo+spazio+spazio
			    +sep2+"Tipo di Dato:   Carrier"
		    	+spazio+spazio
		    	+"Carrier_dailyUserInstalls"+sep1+"Carrier_totUserInstalls"
		    	+sep1+"Carrier_dailyUserUninstalls"+sep1
		    	+"Carrier_activeDeviceInstalls";
		    	
		    	
		    	
		    	if(this.getDatiAggregati().getCarrier_dailyUserInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getCarrier_dailyUserInstalls().get(0);
		    	}
		    	if(this.getDatiAggregati().getCarrier_totUserInstalls()==null)
				{
		    		stampaGruppo=stampaGruppo+sep+"ND";
				}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getCarrier_totUserInstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getCarrier_dailyUserUninstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getCarrier_dailyUserUninstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getCarrier_activeDeviceInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getCarrier_activeDeviceInstalls()
		    				.get(0);
		    	}
		    	
			    	
		    	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	
		    
		    	//country data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Country"
		    	+spazio+spazio
		    	+"Country_dailyUserInstalls"+sep1+"Country_totUserInstalls"+
		    	    	sep1+"Country_dailyUserUninstalls"+sep1+"Country_activeDeviceInstalls";
		    
		    	
		    	
		    	if(this.getDatiAggregati().getCountry_dailyUserInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati()
		    		.getCountry_dailyUserInstalls().get(0);
		    	}
		    	if(this.getDatiAggregati().getCountry_totUserInstalls()==null)
				{
		    		stampaGruppo=stampaGruppo+sep+"ND";
				}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getCountry_totUserInstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getCountry_dailyUserUninstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getCountry_dailyUserUninstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getCountry_activeDeviceInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getCountry_activeDeviceInstalls()
		    				.get(0);
		    	}
		    	
			    
		    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				//device data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Device"
		    	+spazio+spazio
		    	+"Device_dailyUserInstalls"+sep1+"Device_totUserInstalls"+
		    	    	sep1+"Device_dailyUserUninstalls"+sep1+"Device_activeDeviceInstalls";
		    	
		    
		    	
	    		if(this.getDatiAggregati().getDevice_dailyUserInstalls()==null)
		    	{
	    			stampaGruppo=stampaGruppo+spazio+spazio;
	    			stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getDevice_dailyUserInstalls().get(0);
		    	}
		    	if(this.getDatiAggregati().getDevice_totUserInstalls()==null)
				{
		    		stampaGruppo=stampaGruppo+sep+"ND";
				}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getDevice_totUserInstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getDevice_dailyUserUninstalls()==null)
		    	{
		    		
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep+this.getDatiAggregati().getDevice_dailyUserUninstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getDevice_activeDeviceInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getDevice_activeDeviceInstalls()
		    				.get(0);
		    	}
		    	
		    	
		    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	
		    	//Lang data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Lang"
		    	+spazio+spazio
		    	+"Lang_dailyUserInstalls"+sep1+"Lang_totUserInstalls"+
		    	    	sep1+"Lang_dailyUserUninstalls"+sep1+"Lang_activeDeviceInstalls";
		    	
		  
		    	if(this.getDatiAggregati().getLang_dailyUserInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati()
		    		.getLang_dailyUserInstalls().get(0);
		    	}
		    	if(this.getDatiAggregati().getLang_totUserInstalls()==null)
				{
		    		stampaGruppo=stampaGruppo+sep+"ND";
				}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getLang_dailyUserInstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getLang_totUserInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getLang_totUserInstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getLang_activeDeviceInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getLang_activeDeviceInstalls()
		    				.get(0);
		    	}
	    	
			    
		    	
		    	
		    	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	
		    	//OS data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   OS"
		    	+spazio+spazio
		    	+"OsVersion_dailyUserInstalls"+sep1+"OsVersion_totUserInstalls"+
		    	sep1+"OsVersion_dailyUserUninstalls"+sep1+"OsVersion_activeDeviceInstalls";
		    	
		    	
		    	
		    	
		    	if(this.getDatiAggregati().getOsVersion_dailyUserInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati().getOsVersion_dailyUserInstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getOsVersion_totUserInstalls()==null)
				{
		    		stampaGruppo=stampaGruppo+sep+"ND";
				}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep+this.getDatiAggregati().getOsVersion_totUserInstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getOsVersion_dailyUserUninstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep+this.getDatiAggregati().getOsVersion_dailyUserUninstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getOsVersion_activeDeviceInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep+this.getDatiAggregati().getOsVersion_activeDeviceInstalls()
		    				.get(0);
		    	}
		    	
		    	
		    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	//tablet data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Tablet"
		    	+spazio+spazio
		    	+"Tablet_dailyUserInstalls"+sep1+"Tablet_totUserInstalls"+
		    	    	sep1+"Tablet_dailyUserUninstalls"+sep1+"Tablet_activeDeviceInstalls";
		    
		    	
		    	
		    	if(this.getDatiAggregati().getTablet_dailyUserInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati().getTablet_dailyUserInstalls().get(0);
		    	}
		    	if(this.getDatiAggregati().getTablet_totUserInstalls()==null)
				{
		    		stampaGruppo=stampaGruppo+sep+"ND";
				}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getTablet_totUserInstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getTablet_dailyUserUninstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getTablet_dailyUserUninstalls()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getTablet_activeDeviceInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getTablet_activeDeviceInstalls()
		    				.get(0);
		    	}
	    	
			    
		    	//DATI RIGURDANTI IL RATING
		    	
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	
		    	+sep2+"Nome Gruppo:   "+nomeGruppo
		    	+spazio+spazio
		    	+sep2+"Dati riguardanti:   RATING"
		    	+spazio+spazio
		    	+sep2+"Tipo di Dato:   Overview"
		    	
		    	//overview
		    	+spazio+spazio
		    	+"daily_average_overview"+sep1+"total_average_overview";
		    	
		    
		    	if(this.getDatiAggregati().getDaily_average_overview()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getDaily_average_overview()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getTotal_average_overview()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep3+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep3
		    				+this.getDatiAggregati().getTotal_average_overview()
		    				.get(0);
		    	}
		    	
			   
		    	
		    	//carrier
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Carrier"
		    	+spazio+spazio
		    	+"daily_average_carrier"+sep1+"total_average_carrier";
		    	
		    	
		    	
		    	if(this.getDatiAggregati().getDaily_average_carrier()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getDaily_average_carrier()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getTotal_average_carrier()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep3+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep3+this.getDatiAggregati().getTotal_average_carrier()
		    				.get(0);
		    	}
		    	
			    	
		    	//country
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Country"
		    	+spazio+spazio
		    	+"daily_average_country"+sep1+"total_average_country";
		    	

		    	if(this.getDatiAggregati().getDaily_average_country()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getDaily_average_country()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getTotal_average_country()==null)
		    	{;
		    		stampaGruppo=stampaGruppo+sep3+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep3
		    				+this.getDatiAggregati().getTotal_average_country()
		    				.get(0);
		    	}
	    	
		    	
		    	
		    	//device
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Device"
		    	+spazio+spazio
		    	+"daily_average_device"+sep1+"total_average_device";
		    	
		    
		    	
		    	if(this.getDatiAggregati().getDaily_average_device()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati().getDaily_average_device()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getTotal_average_device()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep3+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep3+this.getDatiAggregati().getTotal_average_device()
		    				.get(0);
		    	}
	    	
		    	
		    	//language
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Language"
		    	+spazio+spazio
		    	+"daily_average_language"+sep1+"total_average_language";
		    	
		    
	
		    	if(this.getDatiAggregati().getDaily_average_language()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati()
		    		.getDaily_average_language().get(0);
		    	}
		    	if(this.getDatiAggregati().getTotal_average_language()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep3+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep3
		    				+this.getDatiAggregati().getTotal_average_language()
		    				.get(0);
		    	}
		    	
		    	
		    	
		    	
		    	
		    	//OS
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:    Os_verison"
		    	+spazio+spazio
		    	+"daily_average_Os_version"+sep1+"total_average_Os_version";
		    	
		    	
		    	
		    	if(this.getDatiAggregati().getDaily_average_os_version()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getDaily_average_os_version()
		    				.get(0);
		    	}
		    	if(this.getDatiAggregati().getTotal_average_os_version()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep3+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep3
		    				+this.getDatiAggregati().getTotal_average_os_version()
		    				.get(0);
		    	}
	    	
		    	
		    	//tablet
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:    Tablet"
		    	+spazio+spazio
		    	+"daily_average_tablet"+sep1+"total_average_tablet";
		    
		    	
		    	if(this.getDatiAggregati().getDaily_average_tablet()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getDaily_average_tablet().get(0);
		    	}
		    	if(this.getDatiAggregati().getTotal_average_tablet()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep3+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep3
		    				+this.getDatiAggregati().getTotal_average_tablet().get(0);
		    	}
		    	
		    	//app data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:    App Version"
		    	+spazio+spazio
		    	+"daily_average_app_version"
		    	+sep1+"total_average_app_version";
		    	
		    	
		    	if(this.getDatiAggregati().getDaily_average_app_version()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati().getDaily_average_overview()
		    				.get(0);
		    	}
		    	
		    	if(this.getDatiAggregati().getTotal_average_app_version()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep3+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep3+this.getDatiAggregati().getTotal_average_overview()
		    				.get(0);
		    	}
		    	
	    	}
		    	
	    	//win store
	    	else if(controllo==1 && controllo1==0)
	    	{
	    		stampaGruppo=stampaGruppo+spazio
	    		+"*******************************************************************************"
	    		+ "*******************************************************************************"
	    		+spazio+spazio
	    		+sep2+"Nome Gruppo:   "+nomeGruppo
	    		+spazio
		    	+spazio
		    	+sep2+"Dati riguardanti:   INSTALLS"
		    	+spazio+spazio
		    	//Overview
		    	+sep2+"Tipo di Dato:   Overview"
		    	+spazio+spazio
		    	+"Overview_dailyUserInstalls";
		    	if(this.getDatiAggregati().getOverview_dailyUserInstalls()!=null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getOverview_dailyUserInstalls().get(0);
		    	
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	//country
		    	stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Country"
		    	+spazio+spazio
		    	+"Country_dailyUserInstalls";
		    	
		    	if(this.getDatiAggregati().getCountry_dailyUserInstalls()!=null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getCountry_dailyUserInstalls().get(0);
		    	
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	
		    	
		    	
		    	//osVersion
		    	stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   OsVersion"
		    	+spazio+spazio
		    	+"OsVersion_dailyUserInstalls";
		    	
		    	if(this.getDatiAggregati().getOsVersion_dailyUserInstalls()!=null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getOsVersion_dailyUserInstalls().get(0);
		    	
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	
		    	
		    	//failure
		    	stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Failure"
		    	+spazio+spazio
		    	+"Failure_count";
		    	
		    	if(this.getDatiAggregati().getFailure_count()!=null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getFailure_count().get(0);
		    	
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	
		    	
		    	
		    	
		    	//ratings
		    	stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Dati riguardanti:   RATINGS"
		    	+spazio+spazio
		    	+sep2+"Tipo di Dato:   Rating new and revised"
		    	+spazio+spazio
		    	+"count_new"+"\t\t\t\t"+"count_revised";
		    
		    	if(this.getDatiAggregati().getCount_new()==0)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati().getCount_new();
		    	}
		     	if(this.getDatiAggregati().getCount_revised()==0)
		    	{

		     		stampaGruppo=stampaGruppo+sep+"\t"+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep+"\t"+this.getDatiAggregati().getCount_revised();
		    	}
			
		    	//ratings over
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Rating average over time"
		    	+spazio+spazio
		    	+"count_average";
		    	
		    	
		    	if(this.getDatiAggregati().getCount_average()!=null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getCount_average().get(0);
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	//markets
		    	stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Markets"
		    	+spazio+spazio
		    	+"Average_rating"+"\t\t\t"+"number_rating";
		    
		    	
	    		if(this.getDatiAggregati().getAverage_rating()==null)
		    	{
	    			stampaGruppo=stampaGruppo+spazio+spazio;
	    			stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getAverage_rating().get(0);
		    	}
		    	if(this.getDatiAggregati().getNumber_rating()==null)
		    	{
		    		stampaGruppo=stampaGruppo+sep+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+sep
		    				+this.getDatiAggregati().getNumber_rating().get(0);
		    	}
				
		    	
	    	}
	    	
	    	
	    	//dati aggregati winstore + googlge
	    	
	    	else
	    	{
	    		stampaGruppo=stampaGruppo+spazio+spazio
	    		+"********************************************************************************"
	    		+ "******************************************************************************"
	    		+spazio+spazio
	    		+sep2+"Nome Gruppo:   "+nomeGruppo
	    		+spazio+spazio
	    		+sep2+"Dati aggregati riguardanti:   INSTALLS"
		    	+spazio+spazio
		    	
		    	//overview
		    	+sep2+"Tipo di Dato:   Overview"
		    	+spazio+spazio
		    	+"Overview_dailyUserInstalls";
		    	
		    	
		    	if(this.getDatiAggregati().getOverview_dailyUserInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getOverview_dailyUserInstalls().get(0);
		    	}
		    	
		    	//country
		    	stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Country"
		    	+spazio+spazio
		    	+"Country_dailyUserInstalls";
		    	
		    	if(this.getDatiAggregati().getCountry_dailyUserInstalls()==null)
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati().getCountry_dailyUserInstalls().get(0);
		    	}
		    	
		    	//osVersion
		    	stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   OsVersion"
		    	+spazio+spazio
		    	+"OvsVersion_dailyUserInstalls";
		    	
		    	
	
		      	if(this.getDatiAggregati().getOsVersion_dailyUserInstalls()==null)
		    	{
		      		stampaGruppo=stampaGruppo+spazio+spazio;
		      		stampaGruppo=stampaGruppo+sep1+"ND";
		    	}
		    	else
		    	{
		    		stampaGruppo=stampaGruppo+spazio+spazio;
		    		stampaGruppo=stampaGruppo+sep1
		    				+this.getDatiAggregati().getOsVersion_dailyUserInstalls().get(0);
		    	}
		    	
		    	
	    	}
	    	
    	}
    	else
    	{
    		stampaGruppo=stampaGruppo+spazio+spazio;
    		stampaGruppo=stampaGruppo+"NON CI SONO DATI NELLE APP, IMPOSSIBILE VISUALIZZARE IL GRUPPO";
    	}
    	
    	return stampaGruppo;
    
    }
    
	/**
     * Funzione per la visualizzazione dei dati di un Gruppo,
     * visualizza sia i dati delle app del gruppo che i dati aggregati del
     * gruppo stesso
     *
     */
    public void visualizzazioneDati()
    {
    	String visualizzazioneDati=this.preparazioneDatiStringa();
    	//visualizzazione dati singole app del gruppo
    	if(this.getApps()!=null)
    	{
	    	for (int i=0;i<this.apps.size();i++)
		    {
		    	this.apps.get(i).visualizzazioneDati();
		    }
    	}	
    	System.out.println(visualizzazioneDati);
    }
    
    /**
     * Funzione per l'estrazione dei dati di un Gruppo
     *
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean estrazioneDatiGruppo(){
    	
        return false; 
    }
    /**
     * Funzione per l'aggregazione dei dati delle App contenute nel Gruppo
     *
     */
    public void aggregazioneDati(){
 
    }
   
    /**
     * Funzione per scaricare i dati di un Gruppo
     *Crea il file con i dati del gruppo in locale
     * 
     */
    
    public void scaricamentoDati()
    {
    	//il metodo a differenza di come descritto nel class diagram restituisce
    	//un void al posto del file poichè il file viene salvato direttamente in locale.
    	//richiama la visualizzazione e poi salva il file con solo i dati del gruppo
    	this.visualizzazioneDati();
    	System.out.println("Insersci percorso e nome del file:     ");
    	String percorso=Input.readLine();
    	this.salvataggioFile(percorso,this.preparazioneDatiStringa());
    }
    
    /**funzione asuliaria per i test dello scaricamento 
     * che dato un percorso(comprende anche 
     * il nome del file) 
     *e una stringa,scrive la stringa sul file e salva il file in locale
     *il file è di tipo testo
     * 
     * @param percorso
     * @param dati
     * @return true se il file viene scritto e creato essendo il percorso valido,
     * false se il percorso non esiste.
     */
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
    
}