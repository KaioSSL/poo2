/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author kaiof
 */
public class SaveMensagemSerializada {
    
     public static void main(String[] args) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();        

        Mensagem msg = new Mensagem();
        msg.setTexto("Atividade POO top");
        msg.setId_usuario(1);
        msg.setId(1);
        
        
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "\\src\\mensagem_serializada.ser");                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        outputSerializado.writeObject(msg);
        outputSerializado.close();
        
        System.out.println("Mensagem Salva");        
        System.out.println("Arquivo gerado em: " + current + 
                "\\src\\mensagem_serializada.ser");        
    }
    
}
