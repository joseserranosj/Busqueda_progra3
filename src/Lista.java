import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Repartidor> arreglo;
    private int contador=1;

    public Lista(){
        arreglo=new ArrayList<>();
    }

    public void agregar(Repartidor dato){
        dato.setCodigo(contador++);
        arreglo.add(dato);
    }

    public String listar(){
        StringBuilder sb=new StringBuilder();
        for(Repartidor r:arreglo)
            sb.append(r.toString());
        return sb.toString();

    }

    public int buscar(int codigo){
        int i=0;
        int s=arreglo.size()-1;
        int centro;
        while (i<=s){
            centro=(i+s)/2;
            if(arreglo.get(centro).getCodigo()==codigo){
                return centro;
            } else if (codigo<arreglo.get(centro).getCodigo()) {
                s=centro-1;

            }else{
                i=centro+1;
            }
        }
        return -1;

    }
}
