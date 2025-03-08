/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);
        System.out.println(libro1);

        Libro libro2 = new Libro();
        System.out.println("Ingrese el título del libro: ");
        libro2.setTitulo(scanner.nextLine());
        System.out.println("Ingrese el autor del libro: ");
        libro2.setAutor(scanner.nextLine());
        System.out.println("Ingrese el número de ejemplares: ");
        libro2.setNumEjemplares(scanner.nextInt());
        System.out.println("Ingrese el número de ejemplares prestados: ");
        libro2.setNumEjemplaresPrestados(scanner.nextInt());

        System.out.println("Libro2 creado: " + libro2);

        System.out.println("\nIntentando prestar un libro de 'Cien años de soledad'...");
        if (libro1.prestar()) {
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para préstamo.");
        }
        System.out.println(libro1);

        System.out.println("\nIntentando devolver un libro de 'Cien años de soledad'...");
        if (libro1.devolver()) {
            System.out.println("Devolución realizada con éxito.");
        } else {
            System.out.println("No hay libros prestados para devolver.");
        }
        System.out.println(libro1);

        scanner.close();
    }
}
