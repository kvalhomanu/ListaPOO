/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap09;

/**
 *
 * @author joaos
 */
public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    
    public double getBonificacao(){
        return this.salario * 1.2;
        
    }
    
}
