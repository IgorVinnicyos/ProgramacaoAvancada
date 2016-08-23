/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dados.Produto;
import factory.Ifactory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.GerenciadorArquivoUnicoProduto;


/**
 *
 * @author dddf
 */
 class GerenciadorProduto implements Ifactory{

    @Override
    public void adiciona(ArrayList prod ) {
        
   
        ArrayList<Produto> ArquivoProd  =GerenciadorArquivoUnicoProduto.recuperarProdutos(); 
        GerenciadorArquivoUnicoProduto.salvarProduto(prod, ArquivoProd);
   
    }

    @Override
    public void listar() {
        StringBuilder lista = new StringBuilder();
        if (GerenciadorArquivoUnicoProduto.recuperarProdutos().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia!");
        } else {
            for (Produto produtoGerado : GerenciadorArquivoUnicoProduto.recuperarProdutos()) {
                //System.out.println(funcionario);
                lista.append(produtoGerado+"\n");
            }

            JOptionPane.showMessageDialog(null, lista.toString());
    }

           
}
 }
