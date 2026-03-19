/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laboratorio
 */
import java.util.Random;

public class Tienda {

    private int[][] ventas;
    private String[] productos;
    private int dias = 7;

    public Tienda(String[] productos) {
        this.productos = productos;
        ventas = new int[dias][productos.length];
        generarVentas();
    }

    private void generarVentas() {
        Random rand = new Random();
        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < productos.length; j++) {
                ventas[i][j] = rand.nextInt(10);
            }
        }
    }

    public void mostrarVentas() {
        String[] diasNombre = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};

        for (int i = 0; i < dias; i++) {
            System.out.print(diasNombre[i] + ": ");
            for (int j = 0; j < productos.length; j++) {
                System.out.print(ventas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void totalPorProducto() {
        System.out.println("\nTotal por producto:");
        for (int j = 0; j < productos.length; j++) {
            int suma = 0;
            for (int i = 0; i < dias; i++) {
                suma += ventas[i][j];
            }
            System.out.println(productos[j] + ": " + suma);
        }
    }

    public void mejorDia() {
        String[] diasNombre = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};

        int max = -1;
        int diaIndex = 0;

        for (int i = 0; i < dias; i++) {
            int suma = 0;
            for (int j = 0; j < productos.length; j++) {
                suma += ventas[i][j];
            }

            if (suma > max) {
                max = suma;
                diaIndex = i;
            }
        }

        System.out.println("\nMejor día: " + diasNombre[diaIndex] + " (" + max + ")");
    }

    public void productoMasVendido() {
        int max = -1;
        int index = 0;

        for (int j = 0; j < productos.length; j++) {
            int suma = 0;
            for (int i = 0; i < dias; i++) {
                suma += ventas[i][j];
            }

            if (suma > max) {
                max = suma;
                index = j;
            }
        }

        System.out.println("\nProducto más vendido: " + productos[index] + " (" + max + ")");
    }
}