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
public class Main {
    public static void main(String args[]){
        
        //Criando um grupo de WhatsApp;
        CaixaEntradaGrupo whatsGrupo = new CaixaEntradaGrupo("Família Rodrigues");        
        //Criando Tio Zeca;
        MembroWhats tioZeca = new MembroWhats();
        tioZeca.setNumero(998984171);
        //Linkando Tiozeca e o grupo
        tioZeca.addGrupo(whatsGrupo);
        whatsGrupo.addObservador(tioZeca);
        //Criando Tia julia
        MembroWhats tiaJulia = new MembroWhats();
        tiaJulia.setNumero(9985445);
        //Linkando TiaJulia e o grupo
        tiaJulia.addGrupo(whatsGrupo);
        whatsGrupo.addObservador(tiaJulia);
        //Testando Observadores com tiozeca enviando msg;
        tioZeca.getGrupo(1).setNovaMensagem("Olá tudo bem ?",tioZeca);
        tiaJulia.getGrupo(1).setNovaMensagem("Tudo Maravilhoso TioZeca", tiaJulia);
        
        
        //Criando um Grupo de Email
        CaixaEntradaGrupo emailGrupo = new CaixaEntradaGrupo("Pescaria do Sabadão");        
        //Criando Tio Ze
        MembroEmail tioZe = new MembroEmail();
        tioZe.setEmail("ze@hotmail.com");        
        //Linkando Tio ze E o Grupo
        tioZe.addGrupo(emailGrupo);
        emailGrupo.addObservador(tioZe);
        //Criando tio Carlos
        MembroEmail tioCarlos = new MembroEmail();
        tioCarlos.setEmail("carlao@gmail.com");
        //Linkando Tio Carlos e o Grupo
        tioCarlos.addGrupo(emailGrupo);
        emailGrupo.addObservador(tioCarlos);
        //Testando Observadores
        tioZe.getGrupo(1).setNovaMensagem("Fala carlão bora pescar", tioZe);
        tioCarlos.getGrupo(1).setNovaMensagem("Bora Tioze, deixa eu me livrar da coroa", tioCarlos);
    }   
}
