/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonia;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author kaiof
 */
public class Telefone {
    private static Telefone telefone;
    private static Integer nTelefone;
    private String path = System.getProperty("user.dir" ) + "\\src\\telefonia\\telefones.txt";
    private Telefone(){}
    
    public Integer getNTelefone(){
        return this.nTelefone;
    }
    
    public synchronized static Telefone getTelefone(){
        if(telefone == null){
            telefone = new Telefone();
        }
        telefone.getLastTel();
        return telefone;
    }
    
    private void getLastTel(){
        try{
            FileReader input = new FileReader(this.path);
            BufferedReader leitor = new BufferedReader(input);
            Telefone.nTelefone = Integer.parseInt(leitor.readLine());   
            input.close();
        }catch(IOException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Deu ruim na leitura pae");
        }
    };
    
    private void setLastTel(){
        try{
            FileWriter output = new FileWriter(this.path);
            PrintWriter escrivao = new PrintWriter(output);
            escrivao.print(this.nTelefone);
            output.close();
            escrivao.close();}
        catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Deu ruim na escrita pae");
        }
    }
    public synchronized int getNextNumber(){
        this.nTelefone++;
        this.setLastTel();
        return this.nTelefone;
    }
    
    
    
}
