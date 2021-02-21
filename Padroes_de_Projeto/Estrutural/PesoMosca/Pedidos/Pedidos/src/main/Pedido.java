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
public class Pedido {
    private ArrayList<Item> itens = new ArrayList<Item>(); 

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    
    public void addItemPedido(Item item){
        this.itens.add(item);
    }


    
}
