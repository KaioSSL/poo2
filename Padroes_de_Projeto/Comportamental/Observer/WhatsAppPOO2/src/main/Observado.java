/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author kaiof
 */
public class Observado {
    private final ArrayList<Observador> observadores;
    
    public Observado(){
        this.observadores = new ArrayList<>();
    }
    public void addObservador(Observador obs){
        this.observadores.add(obs);
    }
    public void deleteObservador(Observador obs){
        this.observadores.remove(obs);
    }
    public ArrayList<Observador> getObservadores(){
        return this.observadores;
    }
    public void notificaObservador(){
        for(Observador obs : this.observadores){
            obs.update(this);
        }
    }
}
