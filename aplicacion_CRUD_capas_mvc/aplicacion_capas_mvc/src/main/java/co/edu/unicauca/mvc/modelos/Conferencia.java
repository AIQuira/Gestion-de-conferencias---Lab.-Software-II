package co.edu.unicauca.mvc.modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que representa una conferencia científica.
 * Contiene información sobre el nombre, fechas, costo de inscripción y 
 * listas de artículos enviados y revisores asignados a la conferencia.
 */
public class Conferencia {

    /**
     * ID único para identificar la conferencia.
     */
    private int idConferencia;

    /**
     * Nombre de la conferencia.
     */
    private String nombre;

    /**
     * Fecha de inicio de la conferencia.
     */
    private Date fechaInicio;

    /**
     * Fecha de finalización de la conferencia.
     */
    private Date fechaFin;

    /**
     * Costo de inscripción para la conferencia.
     */
    private float costoInscripcion;

    /**
     * Lista de artículos enviados a la conferencia.
     */
    private ArrayList<Articulo> articulosEnviados;

    /**
     * Lista de revisores asignados a la conferencia.
     */
    private ArrayList<Revisor> revisores;

    /**
     * Constructor para crear una conferencia con los datos iniciales.
     * 
     * @param nombre Nombre de la conferencia.
     * @param fechaInicio Fecha de inicio de la conferencia.
     * @param fechaFin Fecha de finalización de la conferencia.
     * @param costoInscripcion Costo de inscripción de la conferencia.
     */
    public Conferencia(String nombre, Date fechaInicio, Date fechaFin, float costoInscripcion) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoInscripcion = costoInscripcion;
        this.articulosEnviados = new ArrayList<>();
        this.revisores = new ArrayList<>();
    }

    /**
     * Obtiene el ID único de la conferencia.
     * 
     * @return El ID de la conferencia.
     */
    public int getIdConferencia() {
        return idConferencia;
    }

    /**
     * Establece el ID único de la conferencia.
     * 
     * @param idConferencia El ID a asignar a la conferencia.
     */
    public void setIdConferencia(int idConferencia) {
        this.idConferencia = idConferencia;
    }

    /**
     * Obtiene el nombre de la conferencia.
     * 
     * @return El nombre de la conferencia.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la conferencia.
     * 
     * @param nombre El nombre a asignar a la conferencia.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de inicio de la conferencia.
     * 
     * @return La fecha de inicio de la conferencia.
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece la fecha de inicio de la conferencia.
     * 
     * @param fechaInicio La fecha de inicio a asignar.
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene la fecha de finalización de la conferencia.
     * 
     * @return La fecha de finalización de la conferencia.
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * Establece la fecha de finalización de la conferencia.
     * 
     * @param fechaFin La fecha de finalización a asignar.
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Obtiene el costo de inscripción para la conferencia.
     * 
     * @return El costo de inscripción de la conferencia.
     */
    public float getCostoInscripcion() {
        return costoInscripcion;
    }

    /**
     * Establece el costo de inscripción para la conferencia.
     * 
     * @param costoInscripcion El costo a asignar.
     */
    public void setCostoInscripcion(float costoInscripcion) {
        this.costoInscripcion = costoInscripcion;
    }

    /**
     * Obtiene la lista de artículos enviados a la conferencia.
     * 
     * @return Una lista de artículos enviados.
     */
    public ArrayList<Articulo> getArticulosEnviados() {
        return articulosEnviados;
    }

    /**
     * Establece la lista de artículos enviados a la conferencia.
     * 
     * @param articulosEnviados La lista de artículos a asignar.
     */
    public void setArticulosEnviados(ArrayList<Articulo> articulosEnviados) {
        this.articulosEnviados = articulosEnviados;
    }

    /**
     * Obtiene la lista de revisores asignados a la conferencia.
     * 
     * @return Una lista de revisores asignados.
     */
    public ArrayList<Revisor> getRevisores() {
        return revisores;
    }

    /**
     * Establece la lista de revisores asignados a la conferencia.
     * 
     * @param revisores La lista de revisores a asignar.
     */
    public void setRevisores(ArrayList<Revisor> revisores) {
        this.revisores = revisores;
    }

    /**
     * Agrega un artículo a la lista de artículos enviados a la conferencia.
     * 
     * @param articulo El artículo a agregar.
     * @return true si el artículo fue agregado con éxito, false de lo contrario.
     */
    public boolean agregarArticuloAConferencia(Articulo articulo) {
        return articulosEnviados.add(articulo);
    }

    /**
     * Agrega un revisor a la lista de revisores de la conferencia.
     * 
     * @param revisor El revisor a agregar.
     * @return true si el revisor fue agregado con éxito, false de lo contrario.
     */
    public boolean agregarRevisoresAConferencia(Revisor revisor) {
        return revisores.add(revisor);
    }

    /**
     * Retorna una representación en cadena de la conferencia (su nombre).
     * 
     * @return El nombre de la conferencia.
     */
    @Override
    public String toString() {
        return this.nombre;
    }
}
