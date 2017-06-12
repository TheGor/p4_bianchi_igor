package p4_bianchi_igor;
import java.io.File;
import java.util.ArrayList;
/**
 * Classe per l'implementazione dell'AppleStore
 */
public class AppleStore implements ElementAppStore{
    /** Attributi */
    private Credenziali credenziali;
    /**
     * Funzione accept del pattern Visitor
     *
     * @param visitor Il Visitor
     */
    public void accept(Visitor visitor){
    	
    }
    /**
     * Funzione per l'estrazione dei dati dall'AppleStore
     *
     * @param app L'App di cui estrarre i dati
     * @return Il file contenente i dati estratti 
     */
    public File estrazioneDati(App app){
 
    	return null;
    }
    /**
     * Funzione per effettuare l'accesso sull'AppleStore
     *
     * @param credenziali Le credenziali per accedere
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean accesso(Credenziali credenziali){
    	
    	return false;
    }
    /**
     * Funzione per ottenere la lista delle App dell'utente presenti sull'AppleStore
     *
     * @return La lista delle App dell'utente presenti sull'AppleStore
     */
    public ArrayList<App> getListaApp(){
    	
    	return null;
    }
}