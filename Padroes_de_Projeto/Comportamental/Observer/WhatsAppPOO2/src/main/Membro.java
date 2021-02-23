/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;

/**
 *
 * @author kaiof
 */
public class Membro {
    protected final HashMap<Integer,CaixaEntradaGrupo> ceg;    
    public Membro(){
        this.ceg = new HashMap<>();
    }    
    public void addGrupo(CaixaEntradaGrupo ceg){
        this.ceg.put(this.ceg.size()+1, ceg);
    };
    public CaixaEntradaGrupo getGrupo(Integer key){
        return this.ceg.get(key);
    };
    public void removeGrupo(Integer key){
        this.ceg.remove(key);
    };
}
