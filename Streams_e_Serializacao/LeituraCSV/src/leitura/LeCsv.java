
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        BufferedReader arquivo = new BufferedReader(in);        
        String linha = arquivo.readLine();
        String[] atributos;
        int c = 0;
        while (linha!=null) {
            //Pula cabeçalho
            if(c!=0){
                System.out.println(linha);
                atributos = linha.split(";");
                Cliente cliente = new Cliente();
                cliente.setId(atributos[0]);
                cliente.setNome(atributos[1]);
                cliente.setEmail(atributos[2]);
                cliente.setTelefone(atributos[4]);
                cliente.setTotalCompras(Double.parseDouble(atributos[5]));
                clientes.add(cliente);                
            }else{
                c++;
            }
            linha = arquivo.readLine();
        }  
        System.out.println("Arquivo Finalizado");
        in.close(); 
        arquivo.close();
        
        
        
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        
        return clientes;
     }
}
