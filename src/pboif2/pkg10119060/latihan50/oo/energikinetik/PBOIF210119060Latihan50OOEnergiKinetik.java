/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan50.oo.energikinetik;
import Bola.Bola;
/**
 *
 @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program kinetik
 */
public class PBOIF210119060Latihan50OOEnergiKinetik {

    public static void main(String[] args) {
        // TODO code application logic here
        Bola objBola = new Bola(145, 25);
        
        objBola.tampilData(objBola.getMassa(), objBola.getKecepatan());
    }
    
}
