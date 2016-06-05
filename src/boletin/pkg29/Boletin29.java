/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg29;

import java.util.ArrayList;

/**
 *
 * @author JP
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Barco> barcos = new ArrayList();
        barcos.add(new Velero("64bfgh",5));
        barcos.add(new Yate("2468sj",3,50));
        barcos.add(new EmbarcacionDeportiva("fouhifd",100));
        for(Barco b:barcos){
            b.calcularAlquiler(5, 100);
        }
    }
    
}
