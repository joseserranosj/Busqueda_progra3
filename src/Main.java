//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Lista c=new Lista();
    c.agregar(new Repartidor("ANA",18,10,"171858"));
    c.agregar(new Repartidor("JUAN",18,10,"171859"));
    c.agregar(new Repartidor("PEPE",18,10,"171850"));
    c.agregar(new Repartidor("DARIO",18,10,"171851"));
    c.agregar(new Repartidor("LUCIA",18,10,"171852"));
    c.agregar(new Repartidor("TERE",18,10,"171853"));
    c.agregar(new Repartidor("MARTA",18,10,"171854"));
    int indice=c.buscar(10);
    if (indice != -1) {
        System.out.println("Se encuentra en indice: "+indice);
    }else{
        System.out.println("No se encuentra");
    }
}
