import com.ejemplo.models.dto.Compra;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface Ejemplo {
    @SqlQuery("select * from compras where articulo_comprado=?")
    List<Compra> findAllCompras(@Bind String articulo);
}
