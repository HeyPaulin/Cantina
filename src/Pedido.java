import javax.swing.JOptionPane;
import java.util.ArrayList;
class Pedido {
    private Cliente cliente;
    private Massa massa;
    private ArrayList<Ingrediente> ingredientes;

    public Pedido(Cliente cliente, Massa massa, ArrayList<Ingrediente> ingredientes) {
        this.cliente = cliente;
        this.massa = massa;
        this.ingredientes = ingredientes;
    }

    public double calcularValor() {
        double valor = massa.getValor();
        valor += ingredientes.size() * 2;
        return valor;
    }

    public String toString() {
        String ingredientesStr = "";
        for (Ingrediente ingrediente : ingredientes) {
            ingredientesStr += ingrediente.getNome() + " e ";
        }
        ingredientesStr = ingredientesStr.substring(0, ingredientesStr.length() - 3);

        return "Pedido feito para " + cliente.getNome() + "\n" +
                massa.getTipo() + " com " + ingredientesStr + "\n" +
                "Valor: " + calcularValor();
    }
}