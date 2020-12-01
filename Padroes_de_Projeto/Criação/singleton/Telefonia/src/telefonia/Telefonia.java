/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonia;

import java.io.IOException;

/**
 *
 * @author kaiof
 */
public class Telefonia {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println();
       /* System.out.println(System.getProperty("user.dir" ) + "\\telefones.txt");*/
        Telefone telefone = Telefone.getTelefone();
        System.out.println(telefone.getNTelefone());
        System.out.println("Próximo Nº: " + telefone.getNextNumber());
        System.out.println("Próximo Nº: " + telefone.getNextNumber());
        System.out.println("Próximo Nº: " + telefone.getNextNumber());
        System.out.println("Próximo Nº: " + telefone.getNextNumber());
        System.out.println("Próximo Nº: " + telefone.getNextNumber());
        System.out.println("Próximo Nº: " + telefone.getNextNumber());
        
    }
    
}
