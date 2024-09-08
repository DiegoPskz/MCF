package Implementacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import Entidad.Factura;
import Interface.IFactura;

public class FacturaImpl implements IFactura {

	private List<Factura> facturas = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();
    
	@Override
	public Factura crearFactura(Factura factura) {
		factura.setId(counter.incrementAndGet());
        factura.setFecha(LocalDate.now());
        facturas.add(factura);
        return factura;	
	}

	@Override
	public List<Factura> listarFacturas() {
		return facturas;
	}

	@Override
	public Factura obtenerFacturaPorId(Long id) {
		return facturas.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null); 
	}

	@Override
	public Factura actualizarFactura(Long id, Factura facturaActualizada) {
		  Factura factura = obtenerFacturaPorId(id);
	        if (factura != null) {
	            factura.setMonto(facturaActualizada.getMonto());
	            factura.setClienteId(facturaActualizada.getClienteId());
	            factura.setFecha(facturaActualizada.getFecha());
	        }
	        return factura;	
	}

	@Override
	public void eliminarFactura(Long id) {
		facturas.removeIf(f -> f.getId().equals(id));
	}


}
