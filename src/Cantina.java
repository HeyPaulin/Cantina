import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Cantina {
    public static void main(String[] args) {
        String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
        Cliente cliente = new Cliente(nomeCliente);

        String nomeMassa = JOptionPane.showInputDialog("Informe o nome da massa:");
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:"));
        Massa massa = new Massa(nomeMassa, valorMassa);

        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        boolean continuarAdicionandoIngredientes = true;
        while (continuarAdicionandoIngredientes) {
            String opcao = JOptionPane.showInputDialog("Informe os ingredientes escolhidos:\n" +
                    "1-Bacon\n" +
                    "2-Mussarela\n" +
                    "3-Tomate\n" +
                    "4-Queijo\n" +
                    "5-Sair");

            switch (opcao) {
                case "1":
                    ingredientes.add(new Ingrediente("Bacon"));
                    break;
                case "2":
                    ingredientes.add(new Ingrediente("Mussarela"));
                    break;
                case "3":
                    ingredientes.add(new Ingrediente("Tomate"));
                    break;
                case "4":
                    ingredientes.add(new Ingrediente("Queijo"));
                    break;
                case "5":
                    continuarAdicionandoIngredientes = false;
                    break;
            }
        }

        Pedido pedido = new Pedido(cliente, massa, ingredientes);
        JOptionPane.showMessageDialog(null, pedido);
    }
}