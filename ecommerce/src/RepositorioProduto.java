public class RepositorioProduto extends RepositorioBase<Produto> {

    @Override
    public void atualizar(Produto item) {
        for (Produto produto : listar()) {
            if (produto.getId() == item.getId()) {
                produto.setNome(item.getNome());
                produto.setPreco(item.getPreco());
                break;
            }
        }
    }
}