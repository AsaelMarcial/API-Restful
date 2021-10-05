
package pojos;


public class Prenda {
    Integer idPrenda;
    Integer idCategoria;
    Integer piezas;
    String serie;
    Integer porcentajePrestamo;
    Integer idSubcategoria;
    String descripcion;

    public Prenda() {
    }

    public Prenda(Integer idPrenda, Integer idCategoria, Integer piezas, String serie, Integer porcentajePrestamo, Integer idSubcategoria, String descripcion) {
        this.idPrenda = idPrenda;
        this.idCategoria = idCategoria;
        this.piezas = piezas;
        this.serie = serie;
        this.porcentajePrestamo = porcentajePrestamo;
        this.idSubcategoria = idSubcategoria;
        this.descripcion = descripcion;
    }

    public Integer getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(Integer idPrenda) {
        this.idPrenda = idPrenda;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getPiezas() {
        return piezas;
    }

    public void setPiezas(Integer piezas) {
        this.piezas = piezas;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getPorcentajePrestamo() {
        return porcentajePrestamo;
    }

    public void setProcentajePrestamo(Integer porcentajePrestamo) {
        this.porcentajePrestamo = porcentajePrestamo;
    }

    public Integer getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    
}
