/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author joaov
 */
public class GerenteConta {
    static private GerenteConta gerenteConta = null;
    static private ContaBanco Contabanco = null;

    private GerenteConta() {}

    public static GerenteConta getGerenteConta() {
        if(gerenteConta == null){
            gerenteConta = new GerenteConta();
            Contabanco = new ContaBanco();
        }
            
        return gerenteConta;
    }

    public static ContaBanco getContabanco() {
        return Contabanco;
    }
    
    
    
    
    
    
}
