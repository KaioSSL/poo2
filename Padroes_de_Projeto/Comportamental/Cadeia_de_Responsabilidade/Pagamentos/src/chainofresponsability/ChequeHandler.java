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
public class ChequeHandler extends AbstractPagamentoHandler{
    public static final int CHEQUE =3;
    @Override
    protected int getTipoPagamento() {
        return CHEQUE;
    }

    @Override
    protected int handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o "
                + "pagamento com Cheque ?", valor);
        JOptionPane.showMessageDialog(null, "Cheque gerado. Valor restante:" 
                + valorRestante);
        return valorRestante;
    }
    
}
