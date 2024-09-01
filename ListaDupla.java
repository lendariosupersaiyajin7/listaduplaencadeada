public class ListaDupla {
    private Node inicio;
    private Node fim;

    public ListaDupla() {
        inicio = null;
        fim = null;
    }

    public void addFim(int data) {
        Node novoNo = new Node(data);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }
    
    public void addinicio(int data) {
        Node novoNo = new Node(data);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void removeFim() {
        if(fim == null) {
            return;
        } else if(inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
    }

    public void removeInicip() {
        if(inicio == null) {
            return;
        } else if(inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }

    public void printLista() {
        Node no = inicio;
        while (no != null) {
            System.out.println(no.data + " ");
            no = no.proximo;
        }
        System.out.println();
    }
}
