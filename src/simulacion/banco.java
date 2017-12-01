/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.Scanner;

/**
 *
 * @author tito
 */
public class banco {

    public int aleatorioClientes() {

        double numero = 0;
        numero = Math.round(2 + (8 - 2) * aleatorio());

        return (int) numero;
    }

    public double aleatorio() {
        double numero = (double) (Math.random() * 1) + 0;
        return numero;
    }

    public int aleatorioEspera() {
        double random = aleatorio();
        int num = 0;
        if (random >= (3.0 / 7.0)) {
            num = (int) Math.round(((-5.0 / 7.0) + (Math.sqrt((1.0 / 7.0) - ((1.0 / 7.0) * random)))) / (-1.0 / 14.0));
        } else {
            num = (int) Math.round(Math.sqrt(21 * random) + 3);
        }
        return num;
    }

    public cliente[] clientes() {
        cliente[] c = new cliente[100];
        c[0] = new cliente(aleatorioClientes());
        c[0].setTienpoAtencion(aleatorioEspera());
        int cont = 0;
        for (int i = 1; i < c.length; i++) {
            c[i] = new cliente(aleatorioClientes() + c[i - 1].horaLlegada);
            c[i].setTienpoAtencion(aleatorioEspera());
            c[i].setEsatdo("libre");
            cont = cont + 1;
            //System.out.println("cliente "+cont +" hora llegada "+c[i].getHoraLlegada()+" tiempo espera "+ c[i].tienpoAtencion);
        }
        return c;
    }

    public String simulacion() {
        Scanner reader = new Scanner(System.in);
        
        int tiempoSimulacion = reader.nextInt();
        int numeroCajeros=reader.nextInt();
        int cont = 0;
        int[] cajeros = new int[numeroCajeros];

        cliente[] c = clientes();
        for (int i = 1; i < tiempoSimulacion; i++) {
            for (int j = 0; j < c.length; j++) {
                cajeros[0] = c[0].getHoraLlegada() + c[0].getTienpoAtencion();
                if (c[j].getHoraLlegada() == i) {

                    cont = cont + 1;
                    int tiempoSalida = c[j].getHoraLlegada() + c[j].getTienpoAtencion();

                    System.out.println("minuto " + i + " llego cliente " + cont + " tiempo espera " + c[j].getTienpoAtencion() + " tiempo salida " + tiempoSalida);

//                    for (int k = 0; k < cajeros.length; k++) {
//                        int x = 0;
//                        if (x > cajeros[k]) {
//                            x = cajeros[k];
//
//                            System.out.println("|atendiedo cajero  " + k + "tiempo a " + cajeros[k]);
//
//                        }
//                        x = tiempoSalida;
//                        System.out.println("cajero "+x);
//                      
//                    }
                }
            }

            System.out.println("minuto" + i);

        }
        return null;
    }

//    public String simulacion2() {
//        boolean cajero[] = new boolean[5];
//        for (int i = 0; i < cajero.length; i++) {
//            System.out.println(cajero[i]);
//        }
//        return null;
//
//    }
}
