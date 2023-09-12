
import java.util.UUID;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Contato {
    private String codigo;
    private String nome;
    private String telefone;
    private String celular;
    private String fax;
    private String observacao;
    private String contato;
    private String nomeempresa;
    private String cargoempresa;
    private boolean favorito;

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNomeempresa() {
        return nomeempresa;
    }

    public void setNomeempresa(String nomeempresa) {
        this.nomeempresa = nomeempresa;
    }

    public String getCargoempresa() {
        return cargoempresa;
    }

    public void setCargoempresa(String cargoempresa) {
        this.cargoempresa = cargoempresa;
    }


    public Contato(String nome, String telefone, String celular, String fax, String observacao, String contato, String nomeempresa, String cargoempresa, boolean favorito) {
        UUID uuid = UUID.randomUUID();
        codigo = uuid.toString();
        System.out.println("Novo Objeto codigo:"+codigo);
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.fax = fax;
        this.observacao = observacao;
        this.contato = contato;
        this.nomeempresa = nomeempresa;
        this.cargoempresa = cargoempresa;
        this.favorito = favorito;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
    
}
