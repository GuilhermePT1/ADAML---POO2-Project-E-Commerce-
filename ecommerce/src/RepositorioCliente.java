public class RepositorioCliente extends RepositorioBase<Cliente> {

    @Override
    public void atualizar(Cliente item) {
        for (Cliente cliente : listar()) {
            if (cliente.getDocumento() == item.getDocumento()) {
                cliente.setNome(item.getNome());
                cliente.setEmail(item.getEmail());
                break;
            }
        }
    }
}