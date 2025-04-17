package objetos;

import java.util.ArrayList;

public class licitacoes {

    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String categoria;
    private String status;
    private String id;

    private ArrayList<usuarios> participantes;

    public licitacoes(String nome, String descricao, String dataInicio, String dataFim, String categoria, String status, String id) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.categoria = categoria;
        this.status = status;
        this.id = id;
        this.participantes = new ArrayList<>();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getStatus() {
        return status;
    }

    public String getId() {
        return id;
    }

    public ArrayList<usuarios> getParticipantes() {
        return participantes;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void adicionarParticipante(usuarios usuario) {
        if (!participantes.contains(usuario)) {
            participantes.add(usuario);
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nDescrição: " + descricao +
                "\nData de Início: " + dataInicio +
                "\nData de Fim: " + dataFim +
                "\nCategoria: " + categoria +
                "\nStatus: " + status +
                "\nID: " + id +
                "\nParticipantes: " + participantes.size();
    }
}
