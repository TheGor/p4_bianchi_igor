package p4_bianchi_igor;
/**
 * Interfaccia del pattern Visitor per implementare il Visitor
 */
public interface Visitor{ 
    /**
     * Funzione visit del Visitor per il GoogleStore
     *
     * @param google AppStore specifico
     * @return 
     */
    public void visit(GoogleStore google);
    /**
     * Funzione visit del Visitor per il GoogleStore
     *
     * @param apple AppStore specifico
     * @return 
     */
    public void visit(AppleStore apple);
    /**
     * Funzione visit del Visitor per il GoogleStore
     *
     * @param win AppStore specifico
     * @return 
     */
    public void visit(WinStore win);
}