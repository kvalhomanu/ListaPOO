/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap.pkg10.pkg5;

/**
 *
 * @author joaos
 */
public class Quadrado implements AreaCalculavel{
    private int lado;
    
    public Quadrado(int lado){
        this.lado = lado;
        
    }
    
    @Override
    public double calculaArea(){
        return this.lado * this.lado;
    }
    
}
