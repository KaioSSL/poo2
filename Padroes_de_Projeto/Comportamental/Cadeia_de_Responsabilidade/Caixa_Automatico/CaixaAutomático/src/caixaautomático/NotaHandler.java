
package caixaautomático;

import java.util.List;


public class NotaHandler implements InterfaceNotaHandler {
    private InterfaceNotaHandler nextNotaHandler;
    public Integer numNota;
    @Override
    public void setNextHandler(InterfaceNotaHandler handler) {
        this.nextNotaHandler = handler;
    }
    @Override
    public void processHander( int valor) {                
        valor = handleNota(valor);
        if (nextNotaHandler != null && valor >0)
            this.nextNotaHandler.processHander(valor);        
    }
    public int getNumNota() {
        return numNota;
    }
    public void setNumNota(Integer numNota) {
        this.numNota = numNota;
    }
    
    public int handleNota(int valor) {
        int aux = valor / numNota;
        System.out.println(aux + " Nota(s) de: " + numNota);
        return (valor % numNota);
    }
}

