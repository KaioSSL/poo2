/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import javax.swing.JOptionPane;

/**
 *
 * @author kaiof
 */
public class DinheiroHandler extends AbstractPagamentoHandler{
    public static final int DINHEIRO =4;
    @Override
    protected int getTipoPagamento() {
        return DINHEIRO;
    }

    @Override
    protected int handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o "
                + "pagamento em Dinheiro ?", valor);
        JOptionPane.showMessageDialog(null, "Pagamento Efetuado. Valor restante:" 
                + valorRestante);
        return valorRestante;
    }
    
}
