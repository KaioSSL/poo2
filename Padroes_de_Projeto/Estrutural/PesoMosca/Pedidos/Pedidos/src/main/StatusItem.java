/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author kaiof
 */
public class StatusItem {
    public static Estado Estado;
    private boolean podeCancelar;
    private boolean compraConcluida;

    public StatusItem(Estado Estado, boolean podeCancelar, boolean compraConcluida) {
        this.Estado = Estado;
        this.podeCancelar = podeCancelar;
        this.compraConcluida = compraConcluida;
    }
    

    
    
}
