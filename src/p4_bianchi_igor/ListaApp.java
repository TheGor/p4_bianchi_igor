package p4_bianchi_igor;
/**
 * Classe per implementare la funzione ListaApp delle App negli AppStore supportati
 */
public class ListaApp implements Visitor{ 
	/**
     * Funzione visit del Visitor per il GoogleStore
     *
     * @param google AppStore specifico
     */
    public void visit(GoogleStore google){
         
    }
    /**
     * Funzione visit del Visitor per l'AppleStore
     *
     * @param apple AppStore specifico
     */
    public void visit(AppleStore apple){
         
    }
    /**
     * Funzione visit del Visitor il WinStore
     *
     * @param win AppStore specifico
     */
    public void visit(WinStore win){
    	
    }

}