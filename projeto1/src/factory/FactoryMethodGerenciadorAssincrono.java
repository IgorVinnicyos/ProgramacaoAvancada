/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author douglasfrari
 */
public class FactoryMethodGerenciadorAssincrono extends FactoryMethodGerenciador {
    public static FactoryMethodGerenciadorAssincrono instancia;
    
     public static FactoryMethodGerenciadorAssincrono getInstancia(){
    if(instancia == null){
    
        instancia =  new FactoryMethodGerenciadorAssincrono();
    }
    
    return instancia;
    }
    public Ifactory create(int tipoDeCadastro) throws Exception {
        
        Ifactory result = null;
        
        if(tipoDeCadastro == FactoryMethodGerenciador.PRODUTO) {
            result = new GerenciadorProduto();
        } else if(tipoDeCadastro == FactoryMethodGerenciador.FUNCIONARIO) {
            result = new GerenciadorFuncionario();            
        }                      
        
        return result;
    }
    
}
