
package refeicao;

/**
 *
 * @author felipe
 */
public class DiretorRefeicao {        
    
    public Refeicao preparaNaoVegetariana(String sabor, String tipoBebida,Integer qtd_Batata){       
        Refeicao novaRefeicao = new Refeicao();
        NonVegetarianoBuilder refeicaoBuilder = new NonVegetarianoBuilder(novaRefeicao);        
        if(tipoBebida.equalsIgnoreCase("refrigerante"))
            refeicaoBuilder.adicionarRefrigerante(sabor);
        else
            refeicaoBuilder.adicionarSuco(sabor);                
        refeicaoBuilder.prepadaHamburgerCarne();
        if(qtd_Batata>0){
            refeicaoBuilder.adicionarBatata(qtd_Batata);
        }        
        return novaRefeicao;        
    }     
    public Refeicao preparaVegetariana(String sabor, String tipoBebida,Integer qtd_Batata){        
        Refeicao novaRefeicao = new Refeicao();
        VegetarianoBuilder refeicaoBuilder = new VegetarianoBuilder(novaRefeicao);        
        if(tipoBebida.equalsIgnoreCase("refrigerante"))
            refeicaoBuilder.adicionarRefrigerante(sabor);
        else
            refeicaoBuilder.adicionarSuco(sabor);     
        if(qtd_Batata>0){
            refeicaoBuilder.adicionarBatata(qtd_Batata);
        }
        refeicaoBuilder.preparaHamburgerVegetariano();
        return novaRefeicao;        
    }            
    
}
