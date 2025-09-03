import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private LocalDate dataPedido;
    private StatusPedidos statuspedido;
    private StatusPag statuspag;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int id, Cliente cliente, LocalDate dataPedido, StatusPedidos statuspedido, StatusPag statuspag) {
        this.id = id;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.statuspedido = statuspedido;
        this.statuspag = statuspag;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public StatusPedidos getStatuspedido() {
        return statuspedido;
    }

    public StatusPag getStatuspag() {
        return statuspag;
    }

    public List<ItemPedido> getItens() {
        return new ArrayList<>(itens);
    }

    public void adicionarItem(Produto produto, int quantidade, double precoVenda) {
        ItemPedido item = new ItemPedido(produto, quantidade, precoVenda);
        itens.add(item);
    }
}