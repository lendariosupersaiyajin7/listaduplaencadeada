import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack<>();
        ListaDupla listaD = new ListaDupla();

        listaD.addinicio(1);
        listaD.addFim(10);
        listaD.addFim(20);

        listaD.printLista();

        listaD.removeFim();
        listaD.printLista();

        listaD.removeInicip();
        listaD.printLista();

    }
}
