/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author joaos
 */
public class TestaTributavel {
    
    public static void main(String[] args){
        Conta Corrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
        
       // testando polimorfismo
       Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
    
}
