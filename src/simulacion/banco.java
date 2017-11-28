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

    public cliente cli() {
        cliente c = new cliente(aleatorioClientes());

        return c;

    }

    public String simulacion() {
        int cont = 0;
        boolean cajero[] = new boolean[5];

        cliente[] c1 = new cliente[10];
        c1[0] = new cliente(aleatorioClientes());
        c1[1] = new cliente(aleatorioClientes() + c1[0].horaLlegada);
        c1[2] = new cliente(aleatorioClientes() + c1[1].horaLlegada);
        c1[3] = new cliente(aleatorioClientes() + c1[2].horaLlegada);
        c1[4] = new cliente(aleatorioClientes() + c1[3].horaLlegada);
        c1[5] = new cliente(aleatorioClientes() + c1[4].horaLlegada);
        c1[6] = new cliente(aleatorioClientes() + c1[5].horaLlegada);
        c1[7] = new cliente(aleatorioClientes() + c1[6].horaLlegada);
        c1[8] = new cliente(aleatorioClientes() + c1[7].horaLlegada);
        c1[9] = new cliente(aleatorioClientes() + c1[8].horaLlegada);

        c1[0].setTienpoAtencion(aleatorioEspera());
        c1[1].setTienpoAtencion(aleatorioEspera());
        c1[2].setTienpoAtencion(aleatorioEspera());
        c1[3].setTienpoAtencion(aleatorioEspera());
        c1[4].setTienpoAtencion(aleatorioEspera());
        c1[5].setTienpoAtencion(aleatorioEspera());
        c1[6].setTienpoAtencion(aleatorioEspera());
        c1[7].setTienpoAtencion(aleatorioEspera());
        c1[8].setTienpoAtencion(aleatorioEspera());
        c1[9].setTienpoAtencion(aleatorioEspera());

        for (int i = 1; i < 120; i++) {
            for (int j = 0; j < c1.length; j++) {
                int espera = aleatorioEspera();
                if (i<c1[j].horaLlegada+c1[j].getTienpoAtencion() && i>=c1[j].horaLlegada) {
                    System.out.println("minuto  " + i + "  cliente "+ j);
                    System.out.println("atendiendo");
                }

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
