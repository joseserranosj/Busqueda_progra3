public class Repartidor {
    private int codigo;
    private  String cedula;
    private String nombre;
    private int edad;
    private float calificacion;

    public Repartidor(String nombre, int edad, float calificacion, String cedula) {
        codigo=Integer.MAX_VALUE;
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Repartidor" +
                "codigo:" + codigo +
                ", cedula:" + cedula +
                ", nombre:" + nombre +
                ", edad:" + edad +
                ", calificacion:" + calificacion +"\n";    }
}
