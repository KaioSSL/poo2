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
public class MembroWhats extends Membro implements Observador{
    private int numero;
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public void update(Observado obs){
        CaixaEntradaGrupo cx = (CaixaEntradaGrupo) obs;
        MembroWhats mw = (MembroWhats) cx.getUltimoMembroMsg();
        if(!(mw.getNumero() == this.numero)){
        System.out.println(
                "------------------------------------------\n"+
                "Olá "+this.getNumero() + "\n"+
                "\n"+cx.getNome() + " - Nova mensagem de "+mw.getNumero()+":\n"+
                cx.getUltimaMsg()+"\n"+
                "------------------------------------------");
        }
    }
}
