package com.github.sharpware.pim.web.bean;

import com.github.sharpware.pim.web.model.Cliente;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ClienteMB {
    
    private final Cliente cliente = new Cliente();

    public ClienteMB() {
    }
  
    public Cliente getCliente(){
        return cliente;
    }
    
    public void enviarCliente(){
        System.out.print("Cliente " + this.cliente.getNome() + " gravado...");
    }
}