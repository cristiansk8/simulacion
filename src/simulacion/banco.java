/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author tito
 */
public class banco {

    public int aleatorioClientes() {
        int numero = 0;
        numero = (int) (Math.random() * (8 - 2 + 1) + 2);
        return numero;
    }

    public int aleatorioEspera() {
        int numero = 0;
        numero = (int) (Math.random() * (10 - 3 + 1) + 3);
        return numero;
    }
    public cliente cli(){
        cliente c = new cliente(aleatorioClientes());
        
        return c;
        
        
    }

    public String simulacion() {
        boolean cajero[] = new boolean[5];
        cliente c1 = new cliente(aleatorioClientes());
        cliente c2 = new cliente(aleatorioClientes());
        c1.setTienpoAtencion(aleatorioEspera());
        c2.setTienpoAtencion(aleatorioEspera());

        for (int i = 1; i < 100; i++) {

            System.out.println("minuto " + i);
            if (i < c1.getHoraLlegada() + c1.getTienpoAtencion() && i >= c1.getHoraLlegada()) {
                
                System.out.println(" antendiendo  c1" + "cajero 1");
            }
            if (i < c2.getHoraLlegada() + c1.getHoraLlegada() + c2.getTienpoAtencion() && i >= c2.getHoraLlegada() + c1.getHoraLlegada()) {

                System.out.println(" antendiendo  c2");
            }

        }
        return null;
    }

    public String simulacion2() {
        boolean cajero[] = new boolean[5];
        for (int i = 0; i < cajero.length; i++) {
            System.out.println(cajero[i]);
        }
        return null;

    }

}
