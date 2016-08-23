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
public abstract class FactoryMethodGerenciador {

    public static final int PRODUTO = 0;
    public static final int FUNCIONARIO = 1;
    
    public abstract Ifactory create(int tipoDeCadastro) throws Exception;
    
    
}

