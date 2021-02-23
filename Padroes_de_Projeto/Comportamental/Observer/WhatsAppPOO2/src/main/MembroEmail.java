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
public class MembroEmail extends Membro implements Observador{
    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void update(Observado obs){
        CaixaEntradaGrupo cx = (CaixaEntradaGrupo) obs;
        MembroEmail me = (MembroEmail) cx.getUltimoMembroMsg();
        if(!(me.getEmail().equals(this.email))){
        System.out.println(
                "------------------------------------------\n"+
                "Olá "+this.getEmail()+ "\n"+
                "\n"+cx.getNome() + " - Nova mensagem de "+me.getEmail()+":\n"+
                cx.getUltimaMsg()+"\n"+
                "------------------------------------------");
        }
    }
}
