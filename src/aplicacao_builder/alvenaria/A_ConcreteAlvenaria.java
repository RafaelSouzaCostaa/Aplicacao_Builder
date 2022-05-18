/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao_builder.alvenaria;

import aplicacao_builder.itens.A_Builder_Alvenaria;
import java.util.ArrayList;

/**
 *
 * @author Rafael de Souza Costa
 */
public abstract class A_ConcreteAlvenaria {

    private ArrayList<A_Builder_Alvenaria> itensAlvenaria = new ArrayList<>();

    public double getPrice() {
        double soma = 0.0;
        for (int i = 0; i < itensAlvenaria.size(); i++) {
            soma += itensAlvenaria.get(i).getPrice();
        }
        return soma;
    };
    
    protected void addItens(A_Builder_Alvenaria item) {
        itensAlvenaria.add(item);
    }

    public void resetConcreteAlvenaria() {
        itensAlvenaria.clear();
    }
}
