package tp1.ejercicio3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String comision;
    private String email;
    private String direccion;

    public Estudiante(String nombre, String apellido, String comision, String email, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.comision = comision;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String tusDatos(){
        String aux= "Nombre = "+ getNombre()+"\nApellido = "+getApellido()+"\nComision = "+getComision()+"\nEmail = "+ getEmail()+
                "\nDireccion = "+getDireccion();
        return aux;
    }
}
