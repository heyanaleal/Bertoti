package pattern;

public class TabuleiroDama {

    static private TabuleiroDama instance = null;
    
    private TabuleiroDama(){}
    
    static TabuleiroDama getInstance()
    {
    	if( instance == null)
           instance = new TabuleiroDama();
        return instance;
    }  
}
