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
public class CaixaEntradaGrupo extends Observado {
    private ArrayList<String> vetorMsg;
    private String ultimaMsg;
    private Membro ultimoMembroMsg;
    private String nome;

    public CaixaEntradaGrupo(String nome) {
        this.nome = nome;
        this.vetorMsg = new ArrayList<>();
    }

    public Membro getUltimoMembroMsg() {
        return ultimoMembroMsg;
    }

    public void setUltimoMembroMsg(Membro ultimoMembroMsg) {
        this.ultimoMembroMsg = ultimoMembroMsg;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimaMsg() {
        return ultimaMsg;
    }
    
    public CaixaEntradaGrupo(){
        this.vetorMsg = new ArrayList<>();
    }
    
    public ArrayList<String> getVetorMsg() {
        return vetorMsg;
    }

    public void setNovaMensagem(String mensagem,Membro membro) {
        this.vetorMsg.add(mensagem);
        this.ultimoMembroMsg = membro;
        this.ultimaMsg = mensagem;
        this.notificaObservador();
    }
}
