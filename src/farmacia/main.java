package farmacia;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        cliente cliente = new cliente();
        try {
            String opcao = JOptionPane.showInputDialog(null,"Você quer pesquisar com nome, CPF, email: ");
            switch (opcao) {
                case "nome" -> {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente que você deseja pesquisar: ");
                    if (cliente.buscarNome(nome)) {
                        JOptionPane.showMessageDialog(null, "Cliente encontrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                    }
                }
                case "CPF" -> {
                    String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do cliente que você deseja pesquisar: ");
                    cliente.buscarCpf(cpf);
                }
                case "E-mail" -> {
                    String email = JOptionPane.showInputDialog(null, "Digite o email do cliente que você deseja pesquisar: ");
                    cliente.buscarEmail(email);
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opção inválida!!!");
                }
            }
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Nao insira números, somente letras");
        }
    }
}
