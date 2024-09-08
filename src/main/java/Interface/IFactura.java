package Interface;

import java.util.List;

import Entidad.Factura;

public interface IFactura {
	 Factura crearFactura(Factura factura);
	    List<Factura> listarFacturas();
	    Factura obtenerFacturaPorId(Long id);
	    Factura actualizarFactura(Long id, Factura factura);
	    void eliminarFactura(Long id);
}
