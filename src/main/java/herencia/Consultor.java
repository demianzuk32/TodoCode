package herencia;

public class Consultor extends Persona{
    
    String nombreConsultora;
    String num_consultor;

    public Consultor() {
    }

    public Consultor(String nombreConsultora, String num_consultor, int id, String dni, String nombre, String apellidos, String domicilio, String telefono) {
        super(id, dni, nombre, apellidos, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.num_consultor = num_consultor;
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public String getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(String num_consultor) {
        this.num_consultor = num_consultor;
    }
    
    
    
}
