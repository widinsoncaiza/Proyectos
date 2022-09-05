package winfactory;

import java.awt.Button;
import java.awt.Menu;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.msi
 */

class LinuxFactory extends GUIFactory{
    public Button createButton(){
        return(new LinuxButton());
    }
    public Menu createMenu{
        return(new LinuxMenu());
    }
}