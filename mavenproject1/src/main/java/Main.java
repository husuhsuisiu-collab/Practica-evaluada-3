/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laboratorio
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de productos: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] productos = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            productos[i] = sc.nextLine();
        }

        Tienda tienda = new Tienda(productos);

        tienda.mostrarVentas();
        tienda.totalPorProducto();
        tienda.mejorDia();
        tienda.productoMasVendido();
    }
}