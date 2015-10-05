package com.github.sharpware.pim.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class Pessoa<T extends Pessoa> extends Entidade<T>
{
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String observacao;
    private Endereco endereco;
    private final List<Telefone> telefones;
    
    public Pessoa()
    {
        telefones = new ArrayList<>();
    }

    public String getNome()
    {
        return nome;
    }

    public T setNome(String name)
    {
        this.nome = name;
        return (T) this;
    }

    public String getCpf()
    {
        return cpf;
    }

    public T setCpf(String cpf)
    {
        this.cpf = cpf;
        return (T) this;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento")
    public Date getDataNascimento()
    {
        return dataNascimento;
    }

    public T setDataNascimento(Date dataNascimento)
    {
        this.dataNascimento = dataNascimento;
        return (T) this;
    }

    public String getObservacao()
    {
        return observacao;
    }

    public T setObservacao(String observacao)
    {
        this.observacao = observacao;
        return (T) this;
    }

    @Embedded
    public Endereco getEndereco()
    {
        return endereco;
    }

    public T setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
        return (T) this;
    }
}