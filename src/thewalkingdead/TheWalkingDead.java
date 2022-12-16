/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thewalkingdead;

import java.util.Scanner;

/**
 *
 * @author sunim
 */
public class TheWalkingDead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila p = new Pila();
        Cola c = new Cola();
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("1.-Pila");
            System.out.println("2.-Cola");
            System.out.println("3.-salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("1.-push");
                        System.out.println("2.-pop");
                        System.out.println("3.-imprimir");
                        System.out.println("4.-salir");
                        opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                String nombreActor,
                                 Edad,
                                 Personaje,
                                 Id;
                                System.out.println("Escriba el nombre de el actor");
                                nombreActor = entrada.next() + entrada.nextLine();
                                System.out.println("Escriba la edad del actor");
                                Edad = entrada.next() + entrada.nextLine();
                                System.out.println("Escriba el personaje que el actor interpreta");
                                Personaje = entrada.next() + entrada.nextLine();
                                System.out.println("Escriba la temporada donde aparecio por primera vez");
                                Id = entrada.next() + entrada.nextLine();
                                p.PUSH(p.Check(),nombreActor,Edad,Personaje,Id);
                                break;
                            case 2:
                                System.out.println("Se elimino el registro N#" + p.Pop());
                                break;
                            case 3:
                                p.Imprimir();
                                break;
                            case 4:
                                System.out.println("ADIOS");
                                break;
                            default:
                                break;
                        }
                    } while (opcion != 4);
                    opcion = -1;
                    break;
                case 2:
                    do {
                        System.out.println("1.-Insertar Cola");
                        System.out.println("2.-Extraer Cola");
                        System.out.println("3.-Mostrar Lista");
                        System.out.println("4.-Salir");
                        opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                String nombreActor,
                                 Edad,
                                 Personaje,
                                 Id;
                                System.out.println("Escriba el nombre de el actor");
                                nombreActor = entrada.next() + entrada.nextLine();
                                System.out.println("Escriba la edad del actor");
                                Edad = entrada.next() + entrada.nextLine();
                                System.out.println("Escriba el personaje que el actor interpreta");
                                Personaje = entrada.next() + entrada.nextLine();
                                System.out.println("Escriba la temporada donde aparecio por primera vez");
                                Id = entrada.next() + entrada.nextLine();
                                c.insert(c.Check(),nombreActor,Edad,Personaje,Id);
                                break;
                            case 2:
                                c.extract();
                                break;
                            case 3:
                                c.Imprimir();
                                break;
                            case 4:
                                break;
                            default:
                                break;
                        }
                    } while (opcion != 4);
                    opcion = -1;
                    break;
                case 3:
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("La opcion no existe");
                    break;
            }
        } while (opcion != 3);
    }
}
    

