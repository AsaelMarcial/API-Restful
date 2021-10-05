
package ws;

import static controlador.PrendaDAO.getAllPrendas;
import static controlador.PrendaDAO.getPrendasByIdPrenda;
import static controlador.PrendaDAO.registrarPrenda;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import pojos.Mensaje;
import pojos.Prenda;


@Path("prendas")
public class PrendaWS {



    @Path("allbd")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prenda>getAll(){
        return getAllPrendas();
    }
    
    @Path("byId/{idprenda}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prenda>getPrendasById(
            @PathParam("idprenda")Integer idprenda){
        return getPrendasByIdPrenda(idprenda);
    }
    
    @POST
    @Path("registro")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje registroPrenda(
    @FormParam("idPrenda") Integer idPrenda,
    @FormParam("idCategoria") Integer idCategoria,
    @FormParam("piezas") Integer piezas,
    @FormParam("serie") String serie,
    @FormParam("porcentajePrestamo") Integer porcentajePrestamo,
    @FormParam("idSubcategoria") Integer idSubcategoria,
    @FormParam("descripcion") String descripcion){
        return registrarPrenda(idPrenda, idCategoria, piezas, serie, porcentajePrestamo, idSubcategoria, descripcion);
    }
}
