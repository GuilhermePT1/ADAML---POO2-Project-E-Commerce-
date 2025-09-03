
public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        RepositorioCliente repositorioCliente = new RepositorioCliente();
        RepositorioProduto repositorioProduto = new RepositorioProduto();

        repositorioCliente.cadastrar(new Cliente("João", "123456789", "joao@gmail.com"));
        repositorioCliente.cadastrar(new Cliente("Maria", "987654321", "maria@hotmail.com"));

        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : repositorioCliente.listar()) {
            System.out.println(cliente);

        repositorioProduto.cadastrar(new Produto("1", "Notebook", 3500.00));
        repositorioProduto.cadastrar(new Produto("2", "Smartphone", 2500.00));

        System.out.println("Produtos cadastrados:");
        for (Produto produto : repositorioProduto.listar()) {
           System.out.println(produto);



        }
    }
  }
}