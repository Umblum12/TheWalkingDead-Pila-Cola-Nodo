/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thewalkingdead;

/**
 *
 * @author sunim
 */
public class Pila {
     private int tope = -1;
    private Nodo inicio;
    public boolean EMPTY() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    public void PUSH(int valor,String nombreActor,String Edad,String Personaje,String Id) {
        Nodo nuevo = new Nodo(valor, nombreActor, Edad,Personaje,Id);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo act = inicio;
            while (act.getSig() != null) {
                act = act.getSig();
            }
            act.setSig(nuevo);
        }
        tope++;
    }
    public int Check() {
        return tope + 1;
    }
    public int Pop() {
        if (!EMPTY()) {
            Nodo act = inicio;
            Nodo ant = null;
            while (act.getSig() != null) {
                ant = act;
                act = act.getSig();
            }
            int valor = act.getValor();
            if (inicio.getSig() == null) {
                inicio = inicio.getSig();
            } else {
                ant.setSig(act.getSig());
            }
            tope--;
            return valor;
        } else {
            System.out.println("La pila esta vacia");
            return -1;
        }
    }
    public void Imprimir() {
        if (!EMPTY()) {
            Nodo act = inicio;
            while (act != null) {
                System.out.println("\t***************---------**********************");
                System.out.print(+act.getValor() + ".- ");
                System.out.println("Nombre del actor: " + act.nombreActor);
                System.out.println("Edad del actor: \t" + act.Edad);
                System.out.print("Personaje que el actor interpreta: \t" + act.Personaje + "\n");
                System.out.println("Primera aparicion : \t" + act.Id);
                System.out.println("\t***************---------**********************");
                act = act.getSig();
            }
        } else {
            System.out.println("La pila contiene elementos");
        }
    }
}
