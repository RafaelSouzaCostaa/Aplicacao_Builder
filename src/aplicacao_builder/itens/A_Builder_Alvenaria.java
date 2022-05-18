/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aplicacao_builder.itens;

/**
 * @author Rafael de Souza Costa
 */
public abstract class A_Builder_Alvenaria {
    private double price = 0.0;
    private int tipo = 1;
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price, int tipo){
        this.price = price * tipo;
    }
}