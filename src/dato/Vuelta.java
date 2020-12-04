/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato;

/**
 *
 * @author nat22
 */
public class Vuelta {

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the nVuelta
     */
    public String getnVuelta() {
        return nVuelta;
    }

    /**
     * @param nVuelta the nVuelta to set
     */
    public void setnVuelta(String nVuelta) {
        this.nVuelta = nVuelta;
    }

    /**
     * @return the minutos
     */
    public String getMinutos() {
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    /**
     * @return the segundos
     */
    public String getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(String segundos) {
        this.segundos = segundos;
    }
    private String id;
    private String fecha;
    private String nVuelta;
    private String minutos;
    private String segundos;
    
    
    public Vuelta(String pid,String pfecha,String pnvuelta,String min,String seg){
    
        this.setId(pid);
        this.setFecha(pfecha);
        this.setnVuelta(pnvuelta);
        this.setMinutos(min);
        this.setSegundos(seg);
       
    }
 public void addVuelta(){try {} catch (Exception e) {}}
 public void writeFile(){try {} catch (Exception e) {}}


 public void versiesnumero(){try {} catch (Exception e) {}}
 public void buscardatos(){try {} catch (Exception e) {}}
 public void versiesfecha(){try {} catch (Exception e) {}}
 public void aunmentarArreglo(){try {} catch (Exception e) {}}
 public void existencia(){try {} catch (Exception e) {}}




}




 
