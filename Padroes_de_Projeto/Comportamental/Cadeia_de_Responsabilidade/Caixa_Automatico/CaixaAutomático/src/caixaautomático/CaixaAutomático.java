/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaautomático;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kaiof
 */
public class CaixaAutomático {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NotaHandler nota200 = new NotaHandler();
        nota200.setNumNota(200);
        NotaHandler nota100 = new NotaHandler();
        nota100.setNumNota(100);
        NotaHandler nota50 = new NotaHandler();
        nota50.setNumNota(50);
        NotaHandler nota20 = new NotaHandler();
        nota20.setNumNota(20);
        NotaHandler nota10 = new NotaHandler();
        nota10.setNumNota(10);
        NotaHandler nota5 = new NotaHandler();
        nota5.setNumNota(5);
        NotaHandler nota2 = new NotaHandler();
        nota2.setNumNota(2);
        NotaHandler nota1 = new NotaHandler();
        nota1.setNumNota(1);
        
        nota200.setNextHandler(nota100);
        nota100.setNextHandler(nota50);
        nota50.setNextHandler(nota20);
        nota20.setNextHandler(nota10);
        nota10.setNextHandler(nota5);
        nota5.setNextHandler(nota2);
        nota2.setNextHandler(nota1);
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor á ser retirado do caixa"));
        nota200.processHander(valor);
    }
    
}
