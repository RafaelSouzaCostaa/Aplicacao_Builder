/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao_builder.alvenaria;

import aplicacao_builder.itens.*;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ConcreteAlvenariaCasa extends A_ConcreteAlvenaria {
 
    public void criarRedeAgua(int tipo) {
        super.addItens(new Agua(tipo));
    }

    public void criarRedeLuz(int tipo) {
        super.addItens(new Luz(tipo));
    }

    public void criarJanela(int tipo) {
        super.addItens(new Janela(tipo));
    }

    public void criarParede(int tipo) {
        super.addItens(new Parede(tipo));
    }

    public void criarPiso(int tipo) {
        
        super.addItens(new Piso(tipo));
    }

    public void criarPorta(int tipo) {
        super.addItens(new Porta(tipo));
    }

    public void criarTelhado(int tipo) {
        super.addItens(new Telhado(tipo));
    }
}
