import java.util.List;

public interface RepositorioItemPedido<T> {
    void cadastrar(T item);
    List<T> listar();
    void atualizar(T item);
}