package p4_bianchi_igor;
/**
 * Interfaccia del pattern Visitor per implementare gli AppStore suportati
 */
public interface ElementAppStore{
    /**
     * Funzione accept del Visitor
     *
     * @param visitor Il Visitor
     */
    public void accept(Visitor visitor);
}