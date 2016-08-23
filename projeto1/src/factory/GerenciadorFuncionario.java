/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dados.Funcionario;
import factory.Ifactory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.GerenciadorArquivoUnicoFuncionario;


/**
 *
 * @author dddf
 */
 class GerenciadorFuncionario implements Ifactory{

    @Override
    public void adiciona(ArrayList func) {
        
   
     ArrayList <Funcionario>  ArquivoFunc=GerenciadorArquivoUnicoFuncionario.recuperarFuncionarios(); 
        GerenciadorArquivoUnicoFuncionario.salvarFuncionarios(func, ArquivoFunc);
   
    }

    @Override
    public void listar() {
        StringBuilder lista = new StringBuilder();
        
        if (GerenciadorArquivoUnicoFuncionario.recuperarFuncionarios().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia!");
        } else {
            for (Funcionario funcionarioGerado : GerenciadorArquivoUnicoFuncionario.recuperarFuncionarios()) {
                //System.out.println(funcionario);
                lista.append(funcionarioGerado+"\n");
            }

            JOptionPane.showMessageDialog(null, lista.toString());
    }

           
}}
