/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacao_builder;

import aplicacao_builder.alvenaria.ConcreteAlvenariaCasa;
import javax.swing.JOptionPane;

/**
 * @author Rafael de Souza Costa
 */
public class Aplicacao_Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConcreteAlvenariaCasa casa = new ConcreteAlvenariaCasa();
        String piso = "", parede = "", janela = "", porta = "", telhado = "", luz = "", agua = "", criado = " (Criado!)";;
        boolean chave = true;
        while (chave) {

            int index = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Criar Piso" + piso
                    + "\n2 - Criar Parede" + parede
                    + "\n3 - Criar Janela" + janela
                    + "\n4 - Criar Porta" + porta
                    + "\n5 - Criar Telhado" + telhado
                    + "\n6 - Criar Rede de Luz" + luz
                    + "\n7 - Criar Rede de Agua" + agua
                    + "\n**********************"
                    + "\n8 - Finalizar Construção"
                    + "\n9 - Reset Construção"
                    + "\n10 - Sair"));

            switch (index) {
                case 1:
                    casa.criarPiso(Integer.parseInt(JOptionPane.showInputDialog("Digite um tipo de Nivel Ex:. 1, 2 ou 3")));
                    piso = criado;
                    break;
                case 2:
                    casa.criarParede(Integer.parseInt(JOptionPane.showInputDialog("Digite um tipo de Nivel Ex:. 1, 2 ou 3")));
                    parede = criado;
                    break;
                case 3:
                    casa.criarJanela(Integer.parseInt(JOptionPane.showInputDialog("Digite um tipo de Nivel Ex:. 1, 2 ou 3")));
                    janela = criado;
                    break;
                case 4:
                    casa.criarPorta(Integer.parseInt(JOptionPane.showInputDialog("Digite um tipo de Nivel Ex:. 1, 2 ou 3")));
                    porta = criado;
                    break;
                case 5:
                    casa.criarTelhado(Integer.parseInt(JOptionPane.showInputDialog("Digite um tipo de Nivel Ex:. 1, 2 ou 3")));
                    telhado = criado;
                    break;
                case 6:
                    casa.criarRedeLuz(Integer.parseInt(JOptionPane.showInputDialog("Digite um tipo de Nivel Ex:. 1, 2 ou 3")));
                    luz = criado;
                    break;
                case 7:
                    casa.criarRedeAgua(Integer.parseInt(JOptionPane.showInputDialog("Digite um tipo de Nivel Ex:. 1, 2 ou 3")));
                    agua = criado;
                    break;
                case 8:
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Valor Total: " + casa.getPrice());
                    break;
                case 9:
                    casa.resetConcreteAlvenaria();
                    piso = ""; parede = ""; janela = ""; porta = ""; telhado = ""; luz = ""; agua = "";
                    break;
                case 10:
                    chave = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "\n\n Dados incorreto!");
            }
        }

    }
}
