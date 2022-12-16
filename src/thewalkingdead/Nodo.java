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
public class Nodo {
    int valor;
    String nombreActor, Id, Edad, Personaje;

    public Nodo(int valor, String nombreActor, String Edad, String Personaje, String Id) {
        this.valor = valor;
        this.nombreActor = nombreActor;
        this.Edad = Edad;
        this.Personaje = Personaje;
        this.Id = Id;
    }
    Nodo sig;
    public int getValor() {
        return valor;
    }
    public void setValor(String nombreActor, String Edad, String Personaje, String Id) {
        this.nombreActor = nombreActor;
        this.Edad = Edad;
        this.Personaje = Personaje;
        this.Id = Id;
    }
    public Nodo getSig() {
        return sig;
    }
    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
