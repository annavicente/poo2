/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraobridge;

/**
 *
 * @author ana
 */
public class FileSystem implements PersistenciaDeDados {

    @Override
    public void salvar(Object object) {
        System.out.println("Objeto salvo usando FileSystem!");
    }
    
}
