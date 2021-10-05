package controlador;

import java.util.List;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Mensaje;
import pojos.Prenda;

public class PrendaDAO {
     
    public static List<Prenda>getAllPrendas(){
      List<Prenda> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        if(conn != null){
            try{
                list=conn.selectList("Prenda.getAllPrendas");
            } catch (Exception ex){
                ex.printStackTrace();
            } finally{
                conn.close();
            }
        }
        return list;  
    }
    
    public static List<Prenda>getPrendasByIdPrenda(Integer idPrenda){
        List<Prenda> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        if(conn != null){
            try{
                list=conn.selectList("Prenda.getPrendaById", idPrenda);
            } catch (Exception ex){
                ex.printStackTrace();
            } finally{
                conn.close();
            }
        }
        return list;
    }
    
    public static Mensaje registrarPrenda(Integer idPrenda, Integer idCategoria, Integer piezas, String serie, Integer porcentajePrestamo,Integer idSubcategoria, String descripcion){
        Mensaje resultado;
        Prenda p = new Prenda(idPrenda,idCategoria,piezas,serie,porcentajePrestamo,idSubcategoria,descripcion);
        SqlSession conn = MyBatisUtil.getSession();
        try{
            conn.insert("Prenda.registrarPrenda",p);
            conn.commit();
            resultado = new Mensaje("Prenda registrada exitosamente", false);
        } catch (Exception ex){
            resultado = new Mensaje(ex.getMessage(),true);
        } finally {
            conn.close();
        }
        return resultado;
    }
    
}
