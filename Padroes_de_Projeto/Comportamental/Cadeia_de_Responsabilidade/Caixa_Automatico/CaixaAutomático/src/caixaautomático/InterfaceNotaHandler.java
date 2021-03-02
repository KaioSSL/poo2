
package caixaautomático;

import java.util.List;


public interface InterfaceNotaHandler {    
    public void setNextHandler(InterfaceNotaHandler handler);
    public void processHander(int valor);    
}
