package com.mycompany.cuenta.bancaria.poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear una nueva cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Nombre del titular: ");
        cuenta.setTitular(sc.nextLine());

        while (true) {
            System.out.println("Nombre del titular: " + cuenta.getTitular());
            System.out.println("Saldo actual de la cuenta: " + cuenta.getSaldo());
            System.out.println("Interés del saldo: " + cuenta.calcularInteres());
            System.out.println("");
            

            System.out.println("1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3.Cambio de nombre del titular");
            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Monto a ingresar: ");
                    double ingreso = sc.nextDouble();
                    cuenta.ingresar(ingreso);

                    System.out.println("Nuevo Saldo actual de la cuenta: " + cuenta.getSaldo());

                    System.out.println("Nuevo Interés del saldo: " + cuenta.calcularInteres());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    System.out.println("Nuevo Saldo actual de la cuenta: " + cuenta.getSaldo());
                    System.out.println("Nuevo Interés del saldo: " + cuenta.calcularInteres());
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo nombre del titular:");
                    cuenta.setTitular(sc.nextLine());
                    System.out.println("Nombre actualizado a: " + cuenta.getTitular());
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;

            }

        }
    }
}
