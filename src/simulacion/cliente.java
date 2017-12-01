/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;
//  if (c[j].getEsatdo()=="libre"&& cajeros[0]==0 ) {
//                    cajeros[0]=1;
//                    c[j].setEsatdo("atendiendo");
//                    
//                    System.out.println("cliente "+ j + " cajero " + 1);
//                  
//                }
//                
//                 if (c[j].getEsatdo()=="libre"&& cajeros[1]==0) {
//                    cajeros[1]=1;
//                    c[j].setEsatdo("atendiendo");
//                    
//                    System.out.println("cliente "+ j + " cajero " + 2);
//                }
//                  if (c[j].getEsatdo()=="libre"&& cajeros[2]==0) {
//                    cajeros[2]=1;
//                    c[j].setEsatdo("atendiendo");
//                    
//                    System.out.println("cliente "+ j + " cajero " + 3);
//                }
//                   if (c[j].getEsatdo()=="libre"&& cajeros[3]==0) {
//                    cajeros[3]=1;
//                    c[j].setEsatdo("atendiendo");
//                    
//                    System.out.println("cliente "+ j + " cajero " + 4);
//                }
//                    if (c[j].getEsatdo()=="libre"&& cajeros[4]==0) {
//                    cajeros[4]=1;
//                    c[j].setEsatdo("atendiendo");
//                    
//                    System.out.println("cliente "+ j + " cajero " + 5);
//                }

/**
 *
 * @author tito
 */
public class cliente {
    String nombre;
    int horaLlegada;
    int tienpoAtencion;
    String esatdo;

    public String getEsatdo() {
        return esatdo;
    }

    public void setEsatdo(String esatdo) {
        this.esatdo = esatdo;
    }

    public int getTienpoAtencion() {
        return tienpoAtencion;
    }

    public void setTienpoAtencion(int tienpoArencion) {
        this.tienpoAtencion = tienpoArencion;
    }

    public cliente(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public cliente(String nombre, int horaLlegada) {
        this.nombre = nombre;
        this.horaLlegada = horaLlegada;
    }
    
}