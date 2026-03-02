package Tramites;
import java.time.LocalDateTime;

public class Movimiento {
    private String origen;
    private String destino;
    private String estado;
    private LocalDateTime fecha;

    public Movimiento(String origen, String destino, String estado, LocalDateTime fecha) {
        this.origen = origen;
        this.destino = destino;
        this.estado = estado;
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return fecha + ": " + origen + " → " + destino + " (" + estado + ")";
    }
}
