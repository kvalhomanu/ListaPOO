/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap09;

public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;
    
    public void registra(Funcionario f){
        System.out.println("Adicionando bonificação do funcionário; " + f);
        this.totalDeBonificacoes += f.getBonificacao();
        
    }
    
    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
}
