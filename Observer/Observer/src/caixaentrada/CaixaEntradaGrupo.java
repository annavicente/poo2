/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaentrada;

/**
 *
 * @author ana
 */
public class CaixaEntradaGrupo extends Observable {

    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }
    
    public void setNovaMensagem(String mensagem){
        this.mensagem = mensagem;
        
        notifyObserver();
       
    }
    
    
    
}
