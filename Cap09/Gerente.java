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
public class Gerente extends Funcionario{
    public double Bonificacao(){
        return this.salario * 1.4 + 1000;
    }
    public boolean autentica(int senha){
        
    }
}
