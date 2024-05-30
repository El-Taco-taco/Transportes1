/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.transportes;


public class Transportes {

    public static void main(String[] args) {
        VehiculoTerrestre VehiculoTerrestre=new VehiculoTerrestre("Chimovil","Chi2", 4);
        VehiculoAcuatico VehiculoAcuatico =new VehiculoAcuatico("Batman","Batilancha","trrtrr");
    System.out.println("Informacion del vehiculo Terrestre");
    VehiculoTerrestre.mostrarinfo();
  
    System.out.println("Informacion del vehiculo acuatico");
    VehiculoAcuatico.mostrarinfo();
    }
   

}
