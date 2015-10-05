package com.github.sharpware.pim.web.bean;

import com.github.sharpware.pim.web.model.Fornecedor;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class FornecedorMB {
    
    private final Fornecedor fornecedor = new Fornecedor();

    public FornecedorMB() {
    }
  
    public Fornecedor getFornecedor(){
        return fornecedor;
    }
    
    public void enviarFornecedor(){
        System.out.print("fornecedor " + fornecedor.getRazao() + " gravado...");
    }
}