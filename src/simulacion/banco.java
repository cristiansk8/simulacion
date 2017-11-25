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

    public String simulacion() {
        boolean c1 = false;
        int c = aleatorioClientes();
        System.out.println(c);
        int e = aleatorioEspera();
        for (int i = 1; i < 61; i++) {

            System.out.println("minuto " + i);
            if (i<c+e && i>=c) {
                c1 = true;
                System.out.println(" antendiendo c1");
            }

        }
        return null;
    }

}
