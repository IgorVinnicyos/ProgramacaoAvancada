/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;
import dados.Funcionario;
import dados.Produto;
import factory.FactoryMethodGerenciador;
import factory.FactoryMethodGerenciadorAssincrono;
import factory.Ifactory;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import telas.TelaCadastrarFuncionario;
import telas.TelaInicial;
import util.GerenciadorArquivo;
import util.GerenciadorArquivoSeparadoFuncionario;
import util.GerenciadorArquivoUnicoFuncionario;
import util.GerenciadorArquivoUnicoProduto;
/**
 *
 * @author Igor
 */
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       TelaInicial tela = new TelaInicial();
       tela.setVisible(true);
    }
    
}
