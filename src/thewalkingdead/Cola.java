package thewalkingdead;
public class Cola {
    private int tope = -1;
    private Nodo inicio, cola;

    public Cola() {
        inicio = null;
        cola = null;
    }
    public boolean EMPTY() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    public void insert(int valor, String nombreActor, String Edad, String Personaje, String Id) {
        Nodo nuevo = new Nodo(valor, nombreActor, Edad, Personaje, Id);
        if (inicio == null) {
            inicio = cola = nuevo;
        } else {
            Nodo act = inicio;
            while (act.getSig() != null) {
                act = act.getSig();
            }
            act.setSig(nuevo);
            cola = nuevo;
        }
        tope++;
    }
    public int extract() {
         if (!EMPTY()) {
            if (inicio == cola) {
                inicio = cola = null;
            } else {
                inicio = inicio.sig;
            }
            tope--;
            return inicio.getValor();
        } else 
            System.out.println("La lista esta vaciaaaa");
            return -1;
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
                System.out.println("Primera aparicion  : \t" + act.Id);
                System.out.println("\t***************---------**********************");
                act = act.getSig();
            }
        } else {
            System.out.println("La lista no contiene elementos");
        }
    }
    public int Check() {
        return tope + 1;
    }
}
