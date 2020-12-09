/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author kaiof
 */
public class RecuperarMensagemSerializada {
    public static void main(String[] args) throws Exception {
        {
            Mensagem msg = null;
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + 
                    "\\src\\mensagem_serializada.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            msg = (Mensagem) in.readObject();
            in.close();

            System.out.println("Deserializando Mensagem...");
            System.out.println("Id: " + msg.getId());
            System.out.println("Texto: " + msg.getTexto());
            System.out.println("Id Usuário: " + msg.getId_usuario());

        }
    }
    
}
