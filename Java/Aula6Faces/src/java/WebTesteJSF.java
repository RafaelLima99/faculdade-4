/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael Lima
 */
//A classe criada é definida pelas duas anotações como Managed Bean, bem como 
//o uso do escopo de sessão.
@Named(value = "cores")
@SessionScoped
public class WebTesteJSF implements Serializable {
    private final List<String> lista = new ArrayList<>();
    private String atual;
    
    //public Cores(){ };
    
    public void addCorAtual(){
        lista.add(atual);
        atual = "";
    } 
    public List<String> getListaCores(){
     return lista;
    }
    public void setAtual(String atual){
        this.atual = atual;
    }
    public String getAtual(){
     return atual;
    }
}
