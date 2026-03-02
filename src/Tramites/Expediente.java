package Tramites;
import TDA.Pila;
import TDA.ListaSimple;
import java.time.LocalDateTime;

public class Expediente {
    private String codigo;
    private String prioridad;
    private String asunto;
    private String docReferencia;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String estado;
    private Interesado interesado;
    private ListaSimple<Movimiento> seguimiento;
    private Pila<Movimiento> historial;

    public Expediente(String codigo, String prioridad, String asunto, String referencia, LocalDateTime fecha, Interesado interesado)
 {
        this.codigo = codigo;
        this.prioridad = prioridad;
        this.asunto = asunto;
        this.docReferencia = referencia;
        this.fechaInicio = null;
        this.fechaFin = null;
        this.estado = "En trámite";
        this.interesado = interesado;
        this.seguimiento = new ListaSimple<>();
        this.historial = new Pila<>();
    }

    public String getCodigo() {
        return codigo;
    } 

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDocReferencia() {
        return docReferencia;
    }

    public void setDocReferencia(String docReferencia) {
        this.docReferencia = docReferencia;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Interesado getInteresado() {
        return interesado;
    }

    public void setInteresado(Interesado interesado) {
        this.interesado = interesado;
    }

    public ListaSimple<Movimiento> getSeguimiento() {
        return seguimiento;
    }

    public Pila<Movimiento> getHistorial() {
        return historial;
    }

    public String toString() {
        return codigo + " - " + prioridad + " - " + interesado.getDni();
    }
    
    public void registrarMovimiento(Movimiento mov) {
        seguimiento.insertarAlFinal(mov);
        historial.apilar(mov);
    }
    
    public String mostrarSeguimiento() {
        String texto = "";
        for (Movimiento mov : seguimiento.toList()) {
            texto += mov.toString() + "\n";
        }
        return texto;
    }


}
