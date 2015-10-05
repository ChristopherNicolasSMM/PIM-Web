package com.github.sharpware.pim.web.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco implements Serializable
{
    @Column(name = "logradouro")
    private String logradouro ;
    
    @Column(name = "numero")
    private int numero ;
    
    @Column(name = "complemento")
    private String complemento ;
    
    @Column(name = "cep")
    private String cep ;
    
    @Column(name = "bairro")
    private String bairro ;
    
    @Column(name = "cidade")
    private String cidade ;
    
    @Column(name = "uf")
    private String uf ;

    public Endereco()
    {
        //...
    }

    public Endereco(String logradouro, int numero, String complemento, 
                    String cep, String bairro, String cidade, String uf)
    {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro()
    {
        return logradouro;
    }

    public Endereco setLogradouro(String logradouro)
    {
        this.logradouro = logradouro;
        return this;
    }

    public int getNumero()
    {
        return numero;
    }

    public Endereco setNumero(int numero)
    {
        this.numero = numero;
        return this;
    }

    public String getComplemento()
    {
        return complemento;
    }

    public Endereco setComplemento(String complemento)
    {
        this.complemento = complemento;
        return this;
    }

    public String getCep()
    {
        return cep;
    }

    public Endereco setCep(String cep)
    {
        this.cep = cep;
        return this;
    }

    public String getBairro()
    {
        return bairro;
    }

    public Endereco setBairro(String bairro)
    {
        this.bairro = bairro;
        return this;
    }

    public String getCidade()
    {
        return cidade;
    }

    public Endereco setCidade(String cidade)
    {
        this.cidade = cidade;
        return this;
    }

    public String getUf()
    {
        return uf;
    }

    public Endereco setUf(String uf)
    {
        this.uf = uf;
        return this;
    }
}
