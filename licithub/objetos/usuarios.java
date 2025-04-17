package objetos;

import java.util.ArrayList;

public class usuarios {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;
    private String id;

    private ArrayList<licitacoes> licitacoesParticipando = new ArrayList<>();

    public usuarios(String nome, String cpf, String endereco, String telefone, String email, String senha, String id) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.id = id;
    }


    public void adicionarLicitacao(licitacoes lic) {
        if (!licitacoesParticipando.contains(lic)) {
            licitacoesParticipando.add(lic);
        }
    }
    
    public ArrayList<licitacoes> getLicitacoesParticipando() {
        return licitacoesParticipando;
    }
    

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "usuarios{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
