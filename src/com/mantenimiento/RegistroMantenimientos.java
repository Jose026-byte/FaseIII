package com.mantenimiento;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroMantenimientos {
    private ArrayList<Mantenimiento> lista = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE MANTENIMIENTO ---");
            System.out.println("1. Registrar mantenimiento");
            System.out.println("2. Ver historial");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    registrar();
                    break;
                case 2:
                    mostrarHistorial();
                    break;
                case 3:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }

    private void registrar() {
        System.out.print("Máquina: ");
        String maquina = scanner.nextLine();
        System.out.print("Tipo (preventivo/correctivo): ");
        String tipo = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Fecha (dd/mm/aaaa): ");
        String fecha = scanner.nextLine();

        Mantenimiento m = new Mantenimiento(maquina, tipo, descripcion, fecha);
        lista.add(m);
        System.out.println("✅ Mantenimiento registrado correctamente.");
    }

    private void mostrarHistorial() {
        System.out.println("\n--- HISTORIAL DE MANTENIMIENTOS ---");
        if (lista.isEmpty()) {
            System.out.println("No hay mantenimientos registrados.");
        } else {
            for (Mantenimiento m : lista) {
                System.out.println(m);
            }
        }
    }
}
