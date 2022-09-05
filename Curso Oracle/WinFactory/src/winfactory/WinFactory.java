package winfactory;

import java.awt.Button;
import java.awt.Menu;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.msi
 */
class WinFactory extends GUIFactory{
    public Button createButton(){
        return(new WinButton());
    }
    public Menu createMenu(){
        return(new WinMenu());
    }
}


   
    

