package p4_bianchi_igor;
import java.util.ArrayList;

/**
 * Classe per la definizione del Sistema
 */
public class Sistema{ 
    /** Associazioni */
    private ElementAppStore appStores;
    private ArrayList<App> apps;
    private ArrayList<Gruppo> gruppi; 
    
    
    //setters e getters
    public ElementAppStore getAppStores() {
		return appStores;
	}
	public ArrayList<App> getApps() {
		return apps;
	}
	public void setAppStores(ElementAppStore appStores) {
		this.appStores = appStores;
	}
	public void setApps(ArrayList<App> apps) {
		this.apps = apps;
	}
	public void setGruppi(ArrayList<Gruppo> gruppi) {
		this.gruppi = gruppi;
	}
	public ArrayList<Gruppo> getGruppi() {
		return gruppi;
	}
	//costruttore
	public Sistema(ElementAppStore appStores, ArrayList<App> apps,ArrayList<Gruppo> gruppi)
    {
    	this.appStores=appStores;
    	this.apps=apps;
    	this.gruppi=gruppi;
    }
    /**
     * Funzione per aggiungere le credenziali di un'AppStore tra quelli supportati
     *
     */
    public void aggiuntaCredenziali(){
         
    }
    /**
     * Funzione per inserire App nel Sistema
     *
     */
    public void inserimentoApp(){
         
    }
    /**
     * Funzione per cancellare App dal Sistema
     *
     * @return 
     */
    public void cancellazioneApp(){
 
    }
    /**
     * Funzione per creare un nuovo Gruppo
     *
     */
    public void creazioneGruppo()
    {
    	//creo un nuovo oggetto di tipo gruppo
    	//inserisco il nome
    	//controllo se gli altri gruppi il nome è presente
    	//aggiungo alla lista
    	/**int i;
    	String nome;
    	
    	//richiede il nome del gruppo (uc 4 activity)
    	System.out.println("inserisci nome gruppo :");
    	//inserisce il nome del gruppo
    	nome=Input.readLine();
    	
    	//richiede di inserire il nome se già in uso
    	for(i=0;i<gruppi.size();i++)
    	{
    		
    		while(gruppi.get(i).getNomeGruppo().equals(nome) || gruppi.get(i).getNomeGruppo().equalsIgnoreCase(nome))
    		{
    			System.out.println("nome già in uso!!! inserisci nuovo nome :");
    			nome=Input.readLine();
    			i=0;
    		}
    		
    	}
    	//crea il grupppo
    	Gruppo nuovoGruppo=new Gruppo(nome);
    	gruppi.add(nuovoGruppo);
    	System.out.println("gruppo  "+nome+"   creato");
    	**/
    	String nomeGruppo;
    	System.out.println("inserisci nome gruppo :");
    	nomeGruppo=Input.readLine();
    	while(ricercaNome(nomeGruppo,this.getGruppi())==true)
    	{
    		System.out.println("nome già in uso!!! inserisci nuovo nome :");
    		nomeGruppo=Input.readLine();
    	}
    	addGruppo(nomeGruppo,this.getGruppi());
   }
    
    public boolean ricercaNome(String nome,ArrayList<Gruppo> gruppi)
    {
    	for(int i=0;i<gruppi.size();i++)
    	{
    		if(gruppi.get(i).getNomeGruppo().equals(nome) ||
    				gruppi.get(i).getNomeGruppo().equalsIgnoreCase(nome))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean addGruppo(String nome,ArrayList<Gruppo> gruppi)
    {
    	if(ricercaNome(nome,gruppi)==false)
    	{
    		Gruppo g=new Gruppo(nome);
    		gruppi.add(g);
    		System.out.println("gruppo  "+nome+"   creato");
    		return true;
    	}
    	else
    		return false;
    	
    }
    

    /**
     * Funzione per cancellare un Gruppo
     *
     */
    public void cancellazioneGruppo(){
 
    }
    /**
     * Funzione per cancellare le credenziali di un'AppStore 
     *
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean cancellazioneCredenziali(){
 
    	return false;
    }
    /**
     * Funzione per modificare le credenziali di un'AppStore
     *
     * @return 
     */
    public void modificaCredenziali(){

    }
    /**
     * Funzione per aggiungere un'App ad un Gruppo
     *
     */
    public void aggiuntaAppGruppo(){
        
    }
    /**
     * Funzione per cancellare un'App da un Gruppo
     *
     */
    public void cancellazioneAppGruppo(){
    	
    }
    
}