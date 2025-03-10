public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String endereco;
    private String telefone;
    
    public abstract void cadastrar();
    public abstract void atualizar();
    
    public void excluir() {
        // Implementação do método excluir
    }
    
    public void listar() {
        // Implementação do método listar
    }
    
    public void buscar() {
        // Implementação do método buscar
    }
    public Pessoa(String nome, int idade, String sexo, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}
