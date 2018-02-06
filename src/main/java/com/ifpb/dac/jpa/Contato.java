
package com.ifpb.dac.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author lyndemberg
 */

@Entity
public class Contato implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String sobreNome;
    private String apelido;
    @Lob
    private String descricao;
    @Lob
    private byte[] foto;
    @ElementCollection
    @CollectionTable(name = "Emails")
    private List<String> emails;
    @Convert(converter = LocalDateConverter.class)
    private LocalDate dataCriacao;
    @ElementCollection
    @CollectionTable(name = "Telefones")
    private List<Telefone> telefones;

    public Contato(int id, String nome, String sobreNome, String apelido, String descricao, byte[] foto, List<String> emails, LocalDate dataCriacao, List<Telefone> telefones) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.apelido = apelido;
        this.descricao = descricao;
        this.foto = foto;
        this.emails = emails;
        this.dataCriacao = dataCriacao;
        this.telefones = telefones;
    }

    public Contato(String nome, String sobreNome, String apelido, String descricao, byte[] foto, List<String> emails, LocalDate dataCriacao, List<Telefone> telefones) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.apelido = apelido;
        this.descricao = descricao;
        this.foto = foto;
        this.emails = emails;
        this.dataCriacao = dataCriacao;
        this.telefones = telefones;
    }

    public Contato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    
}
