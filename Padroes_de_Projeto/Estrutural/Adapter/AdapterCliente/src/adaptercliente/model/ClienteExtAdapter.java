/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercliente.model;

import lib.ClienteExterno;

/**
 *
 * @author kaiof
 */
public class ClienteExtAdapter implements ICliente{
    ClienteExterno cExt = new ClienteExterno();
    
    public ClienteExtAdapter(ClienteExterno cExt){
        this.cExt = cExt;
    }
    
    @Override
    public String getNomeCompleto() {
        return (cExt.getNome() + " " + cExt.getSobreNome());
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelefone() {
        return cExt.getDddTelefone() + cExt.getTelefone();
    }

    @Override
    public void setTelefone(String telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        return cExt.getEmail();
    }

    @Override
    public void setEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCelular() {
        return cExt.getDddCelular()+ cExt.getDddCelular();
    }

    @Override
    public void setCelular(String celular) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
