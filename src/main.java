import javax.swing.JOptionPane;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        // Criando objetos Cliente, Ingrediente e Massa
        Cliente cliente = new Cliente("João");
        Massa massa = new Massa("Espaguete", 10.0);
        Ingrediente bacon = new Ingrediente("Bacon");
        Ingrediente mussarela = new Ingrediente("Mussarela");
        Ingrediente tomate = new Ingrediente("Tomate");
        Ingrediente queijo = new Ingrediente("Queijo");

        // Criando ArrayList com os ingredientes escolhidos
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(bacon);
        ingredientes.add(mussarela);
        ingredientes.add(tomate);

        // Criando objeto Pedido
        Pedido pedido = new Pedido(cliente, massa, ingredientes);

        // Exibindo informações do Pedido
        System.out.println(pedido);
    }
}





