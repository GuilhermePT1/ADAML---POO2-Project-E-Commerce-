public class Cliente {
    private String nome;
    private String documento;
    private String email;

    public Cliente(String nome, String documento, String email)
            throws IllegalAccessException {
        if (documento == null) {
            throw new IllegalAccessException("Documento nulo, por gentileza preencha o campo");
        }
    this.nome = nome;
    this.documento = documento;
    this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", documento=" + documento + ", email=" + email + "]";
    }
}