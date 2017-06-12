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
     * Funzione per la visualizzazione dei dati di un Gruppo
     *
     */
    public String preparazioneDatiStringa()
    {
    	//this.estrazioneDati() 
    	//questo metodo estrae i dati, viene riposrtato in commento poichè
    	//i dati sono creati e settati nel main non essendo il mio use case
    	//di competenza
    	
    	//forall app in gruppo
    	//app.normalizzazioneDati()
    	//questo metodo normalizza i dati creando la classe dati descritta
    	//nel class diagram e associa i dati a ciascuna app del gruppo
    	
    	//this.aggregazioneDati()
    	//crea un oggetto di tipo dati che contiene i dati aggregati delle app
    	//presenti nel gruppo
    	
    	//queste tre funzionalità sono messe in commento poichè il loro lavoro
    	//viene svolto nel main dove vengono creati le classi dati e vengono
    	//settati i loro valori per poter poi effettuare la normalizzazione
    	//Questo è stato fatto poichè queste funzioni sono altri use case 
    	//implementati dai miei colleghi
    	
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
		    	
		    	/*if(this.getApps().get(0).getDati().getOverview_data()==null || this.getApps().get(1).getDati().getOverview_data()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
		    		
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getOverview_dailyUserUninstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getOverview_dailyUserUninstalls()
			    				
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getOverview_activeDeviceInstalls()==null)
			    	{
			    	
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getOverview_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
		    	
		    	
		    	
			    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	
				
				//carrier
			    stampaGruppo=stampaGruppo+spazio+spazio
			    +sep2+"Tipo di Dato:   Carrier"
		    	+spazio+spazio
		    	+"Carrier_dailyUserInstalls"+sep1+"Carrier_totUserInstalls"
		    	+sep1+"Carrier_dailyUserUninstalls"+sep1
		    	+"Carrier_activeDeviceInstalls";
		    	
		    	/*if(this.getApps().get(0).getDati().getCarrier_data()==null || this.getApps().get(1).getDati().getCarrier_data()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
		    	
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getCarrier_dailyUserUninstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getCarrier_dailyUserUninstalls()
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getCarrier_activeDeviceInstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getCarrier_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
			    	
		    	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	
		    
		    	//country data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Country"
		    	+spazio+spazio
		    	+"Country_dailyUserInstalls"+sep1+"Country_totUserInstalls"+
		    	    	sep1+"Country_dailyUserUninstalls"+sep1+"Country_activeDeviceInstalls";
		    
		    	
	
		    	/**if(this.getApps().get(0).getDati().getCountry_data()==null || this.getApps().get(1).getDati().getCountry_data()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
		    	
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getCountry_dailyUserUninstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getCountry_dailyUserUninstalls()
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getCountry_activeDeviceInstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getCountry_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
			    
		    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				//device data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Device"
		    	+spazio+spazio
		    	+"Device_dailyUserInstalls"+sep1+"Device_totUserInstalls"+
		    	    	sep1+"Device_dailyUserUninstalls"+sep1+"Device_activeDeviceInstalls";
		    	
		    	/**if(this.getApps().get(0).getDati().getDevice_data()==null || this.getApps().get(1).getDati().getDevice_data()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
		    	
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getDevice_dailyUserUninstalls()==null)
			    	{
			    		
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep+this.getDatiAggregati().getDevice_dailyUserUninstalls()
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getDevice_activeDeviceInstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getDevice_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
		    	
		    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	
		    	//Lang data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Lang"
		    	+spazio+spazio
		    	+"Lang_dailyUserInstalls"+sep1+"Lang_totUserInstalls"+
		    	    	sep1+"Lang_dailyUserUninstalls"+sep1+"Lang_activeDeviceInstalls";
		    	
		    	/*if(this.getApps().get(0).getDati().getLang_data()==null || this.getApps().get(1).getDati().getLang_data()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getLang_totUserInstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getLang_totUserInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getLang_activeDeviceInstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getLang_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
			    
		    	
		    	
		    	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	
		    	//OS data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   OS"
		    	+spazio+spazio
		    	+"OsVersion_dailyUserInstalls"+sep1+"OsVersion_totUserInstalls"+
		    	sep1+"OsVersion_dailyUserUninstalls"+sep1+"OsVersion_activeDeviceInstalls";
		    	
		    	
		    	/*if(this.getApps().get(0).getDati().getOsVersion_data()==null || this.getApps().get(1).getDati().getOsVersion_data()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
		    	
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getOsVersion_dailyUserUninstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep+this.getDatiAggregati().getOsVersion_dailyUserUninstalls()
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getOsVersion_activeDeviceInstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep+this.getDatiAggregati().getOsVersion_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
		    	
		    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    	//tablet data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Tablet"
		    	+spazio+spazio
		    	+"Tablet_dailyUserInstalls"+sep1+"Tablet_totUserInstalls"+
		    	    	sep1+"Tablet_dailyUserUninstalls"+sep1+"Tablet_activeDeviceInstalls";
		    	
		    	/**if(this.getApps().get(0).getDati().getTablet_data()==null || this.getApps().get(1).getDati().getTablet_data()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
		    	
		    	
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getTablet_dailyUserUninstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getTablet_dailyUserUninstalls()
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getTablet_activeDeviceInstalls()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getTablet_activeDeviceInstalls()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
			    
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
		    	
		    	/*if(this.getApps().get(0).getDati().getData_overview()==null || this.getApps().get(1).getDati().getData_overview()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getTotal_average_overview()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep3+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep3
			    				+this.getDatiAggregati().getTotal_average_overview()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
			   
		    	
		    	//carrier
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Carrier"
		    	+spazio+spazio
		    	+"daily_average_carrier"+sep1+"total_average_carrier";
		    	
		    	/*if(this.getApps().get(0).getDati().getData_carrier()==null || this.getApps().get(1).getDati().getData_carrier()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
		    	
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getTotal_average_carrier()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep3+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep3+this.getDatiAggregati().getTotal_average_carrier()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
			    	
		    	//country
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Country"
		    	+spazio+spazio
		    	+"daily_average_country"+sep1+"total_average_country";
		    	/*if(this.getApps().get(0).getDati().getData_country()==null || this.getApps().get(1).getDati().getData_country()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
	
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getTotal_average_country()==null)
			    	{;
			    		stampaGruppo=stampaGruppo+sep3+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep3
			    				+this.getDatiAggregati().getTotal_average_country()
			    				.get((int)(Math.random() * 100));
			    	}
		    	
		    	//}
		    	
		    	//device
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Device"
		    	+spazio+spazio
		    	+"daily_average_device"+sep1+"total_average_device";
		    	
		    	/*if(this.getApps().get(0).getDati().getData_device()==null || this.getApps().get(1).getDati().getData_device()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
		    	
			    	if(this.getDatiAggregati().getDaily_average_device()==null)
			    	{
			    		stampaGruppo=stampaGruppo+spazio+spazio;
			    		stampaGruppo=stampaGruppo+sep1+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+spazio+spazio;
			    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati().getDaily_average_device()
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getTotal_average_device()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep3+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep3+this.getDatiAggregati().getTotal_average_device()
			    				.get((int)(Math.random() * 100));
			    	}
		    	
		    	//}
		    	//language
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:   Language"
		    	+spazio+spazio
		    	+"daily_average_language"+sep1+"total_average_language";
		    	
		    	/*if(this.getApps().get(0).getDati().getData_language()==null || this.getApps().get(1).getDati().getData_language()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
	
			    	if(this.getDatiAggregati().getDaily_average_language()==null)
			    	{
			    		stampaGruppo=stampaGruppo+spazio+spazio;
			    		stampaGruppo=stampaGruppo+sep1+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+spazio+spazio;
			    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati()
			    		.getDaily_average_language().get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getTotal_average_language()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep3+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep3
			    				+this.getDatiAggregati().getTotal_average_language()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
		    	
		    	
		    	
		    	
		    	//OS
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:    Os_verison"
		    	+spazio+spazio
		    	+"daily_average_Os_version"+sep1+"total_average_Os_version";
		    	
		    	/*if(this.getApps().get(0).getDati().getData_os_version()==null || this.getApps().get(1).getDati().getData_os_version()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
		    	
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
			    				.get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getTotal_average_os_version()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep3+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep3
			    				+this.getDatiAggregati().getTotal_average_os_version()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
		    	
		    	//tablet
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:    Tablet"
		    	+spazio+spazio
		    	+"daily_average_tablet"+sep1+"total_average_tablet";
		    
		    	/*if(this.getApps().get(0).getDati().getData_tablet()==null || this.getApps().get(1).getDati().getData_tablet()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
		    	
		    	
			    	if(this.getDatiAggregati().getDaily_average_tablet()==null)
			    	{
			    		stampaGruppo=stampaGruppo+spazio+spazio;
			    		stampaGruppo=stampaGruppo+sep1+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+spazio+spazio;
			    		stampaGruppo=stampaGruppo+sep1
			    				+this.getDatiAggregati().getDaily_average_tablet().get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getTotal_average_tablet()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep3+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep3
			    				+this.getDatiAggregati().getTotal_average_tablet().get((int)(Math.random() * 100));
			    	}
		    	//}
		    	//app data
			    stampaGruppo=stampaGruppo+spazio+spazio
		    	+sep2+"Tipo di Dato:    App Version"
		    	+spazio+spazio
		    	+"daily_average_app_version"
		    	+sep1+"total_average_app_version";
		    	
		    	/*if(this.getApps().get(0).getDati().getData_app_version()==null || this.getApps().get(1).getDati().getData_app_version()==null)
		    	{
		    		"DATI NON ESISTENTI");
		    	}
		    	else
		    	{*/
			    	if(this.getDatiAggregati().getDaily_average_app_version()==null)
			    	{
			    		stampaGruppo=stampaGruppo+spazio+spazio;
			    		stampaGruppo=stampaGruppo+sep1+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+spazio+spazio;
			    		stampaGruppo=stampaGruppo+sep1+this.getDatiAggregati().getDaily_average_overview()
			    				.get((int)(Math.random() * 100));
			    	}
			    	
			    	if(this.getDatiAggregati().getTotal_average_app_version()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep3+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep3+this.getDatiAggregati().getTotal_average_overview()
			    				.get((int)(Math.random() * 100));
			    	}
		    	//}
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
		    	/*if (this.getApps().get(0).getDati().getType()!=null || this.getApps().get(1).getDati().getType()!=null)
				{*/
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
				//}
		    	/*else
		    	{
		    		sep1+"DATI NON DISPONIBILI");
		    	}*/
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
		    	/*if (this.getApps().get(0).getDati().getMarket()!=null || this.getApps().get(1).getDati().getMarket()!=null)
				{	*/
		    	
		    		if(this.getDatiAggregati().getAverage_rating()==null)
			    	{
		    			stampaGruppo=stampaGruppo+spazio+spazio;
		    			stampaGruppo=stampaGruppo+sep1+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+spazio+spazio;
			    		stampaGruppo=stampaGruppo+sep1
			    				+this.getDatiAggregati().getAverage_rating().get((int)(Math.random() * 100));
			    	}
			    	if(this.getDatiAggregati().getNumber_rating()==null)
			    	{
			    		stampaGruppo=stampaGruppo+sep+"ND";
			    	}
			    	else
			    	{
			    		stampaGruppo=stampaGruppo+sep
			    				+this.getDatiAggregati().getNumber_rating().get((int)(Math.random() * 100));
			    	}
				
		    	/*else
		    	{
		    		sep1+"ND");
		    	}*/
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
    	//dati app singola
    	if(visualizzazione==true)
    	{
	    	for (int i=0;i<this.apps.size();i++)
	    	{
	    		this.apps.get(i).visualizzazioneDati();
	    	}
	    }
    	
    	return stampaGruppo;
    
    }
    
    
    public void visualizzazioneDati()
    {
    	String visualizzazioneDati=this.preparazioneDatiStringa();
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
     *
     * @return Il file contente i dati del Gruppo
     */
    
    
    
    
    
    public void scaricamentoDati()
    {
    	//questo metodo da use case dovrebbe richiamare this.visualizzazioneDati()
    	
    	//Siccome visualizzazione restituisce un void e lo scaricamento utilizza 
    	//praticamente lo stesso codice, ma
    	//al posto che richiamare il metodo visualizzazione 
    	//ho utilizzato lo stesso codice mettendo la stampa su file al posto della
    	//stampa su command line
    	
    	//il metodo a differenza di come descritto nel class diagram restituisce
    	//un void al posto del file poichè il file viene salvato direttamente in locale
    	this.visualizzazioneDati();
    	System.out.println("Insersci percorso e nome del file:     ");
    	String percorso=Input.readLine();
    	this.salvataggioFile(percorso,this.preparazioneDatiStringa());
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
    
    /**public boolean CreazioneFile(File f) 
    {
    	
    	try
    	{
    		boolean creato=f.createNewFile();
    		return creato;
    	} 
    	catch (IOException e)
    	{
    		e.printStackTrace();
    		return false;
    	}
             
    }
    
    public boolean ControlloFile(File f)
    {
    	if (f.exists())
    	{
    		return true;
    	}
    	else
    		return false;
    }*/
    
  

}