package com.github.sharpware.pim.web.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedor extends Entidade<Fornecedor> {

    public Fornecedor() {
        //...
    }

    public Fornecedor(long id, String razao, String fantasia, String email, String cnpj, 
                      String telefonePrimario, String telefoneSecundario, String telefoneTernario, 
                      String celular, Endereco endereco)
    {
        this.id = id;
        this.razao = razao;
        this.fantasia = fantasia;
        this.email = email;
        this.cnpj = cnpj;
        this.telefonePrimario = telefonePrimario;
        this.telefoneSecundario = telefoneSecundario;
        this.telefoneTernario = telefoneTernario;
        this.celular = celular;
        this.endereco = endereco;
    }
    
    @Column(name = "razao")
    private String razao ;
    
    @Column(name = "fantasia")
    private String fantasia ;
    
    @Column(name = "email")
    private String email ;
    
    @Column(name = "cnpj")
    private String cnpj ;
    
    @Column(name = "telefone_primario")
    private String telefonePrimario ;
    
    @Column(name = "telefone_secundario")
    private String telefoneSecundario ;
    
    @Column(name = "telefone_ternario")
    private String telefoneTernario ;
    
    @Column(name = "celular")
    private String celular ;
    
    @Embedded
    private Endereco endereco;
    
    public String getRazao() {
        return razao;
    }

    public Fornecedor setRazao(String razao) {
        this.razao = razao;
        return this;
    }

    public String getFantasia() {
        return fantasia;
    }

    public Fornecedor setFantasia(String fantasia) {
        this.fantasia = fantasia;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Fornecedor setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Fornecedor setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getTelefonePrimario() {
        return telefonePrimario;
    }

    public Fornecedor setTelefonePrimario(String telefoneprimario) {
        this.telefonePrimario = telefoneprimario;
        return this;
    }

    public String getTelefoneSecundario() {
        return telefoneSecundario;
    }

    public Fornecedor setTelefoneSecundario(String telefonesecundario) {
        this.telefoneSecundario = telefonesecundario;
        return this;
    }

    public String getTelefoneTernario() {
        return telefoneTernario;
    }

    public Fornecedor setTelefoneTernario(String telefoneternario) {
        this.telefoneTernario = telefoneternario;
        return this;
    }

    public String getCelular() {
        return celular;
    }

    public Fornecedor setCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public Endereco getEndereco()
    {
        return endereco;
    }

    public Fornecedor setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
        return this;
    }
}