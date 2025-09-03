import java.util.ArrayList;
import java.util.List;

public class RepositorioBase<T> implements RepositorioItemPedido<T> {
    private List<T> lista = new ArrayList<>();


    @Override
    public void cadastrar(T item) {
        lista.add(item);
    }

    @Override
    public List<T> listar() {
        return lista;
    }

    @Override
    public void atualizar(T item) {
    }
}