/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao_builder.itens;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Luz extends A_Builder_Alvenaria {

    private double priceItem = 1000.0;
    
    public Luz(int tipo) {
        super.setPrice(priceItem, tipo);
    }
}
