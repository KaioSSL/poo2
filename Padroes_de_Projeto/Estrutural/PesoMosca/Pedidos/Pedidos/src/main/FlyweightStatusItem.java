/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static main.Estado.CARRINHO;
import static main.Estado.ENTREGUE;
import static main.Estado.ENVIADO;
import static main.Estado.FECHADO;
import static main.Estado.PAGO;

/**
 *
 * @author kaiof
 */
public class FlyweightStatusItem {
    private static final StatusItem carrinho = new StatusItem(Estado.CARRINHO, true, false);
    private static final StatusItem fechado = new StatusItem(Estado.FECHADO, true, false);
    private static final StatusItem pago = new StatusItem(Estado.PAGO, true, true);
    private static final StatusItem enviado = new StatusItem(Estado.ENVIADO, false, true);
    private static final StatusItem entregue = new StatusItem(Estado.ENTREGUE, false, true);    
    
    static StatusItem get(Estado estado) {
        if(null != estado)switch (estado) {
            case CARRINHO:
                return FlyweightStatusItem.carrinho;
            case FECHADO:
                return FlyweightStatusItem.fechado;
            case PAGO:
                return FlyweightStatusItem.pago;
            case ENVIADO:
                return FlyweightStatusItem.enviado;
            case ENTREGUE:
                return FlyweightStatusItem.entregue;
            default:
                break;
        }
        return null;
    }    
}
