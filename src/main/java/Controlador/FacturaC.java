package Controlador;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import Entidad.Factura;

@RestController
@RequestMapping("/facturas")
public class FacturaC {

	 private final FacturaC facturaService;

	    public FacturaC(FacturaC facturaService) {
	        this.facturaService = facturaService;
	    }

	    @PostMapping
	    public Factura crearFactura(@RequestBody Factura factura) {
	        return facturaService.crearFactura(factura);
	    }

	    @GetMapping
	    public List<Factura> listarFacturas() {
	        return facturaService.listarFacturas();
	    }

	    @GetMapping("/{id}")
	    public Factura obtenerFactura(@PathVariable Long id) {
	        return facturaService.obtenerFactura(id);
	    }

	    @PutMapping("/{id}")
	    public Factura actualizarFactura(@PathVariable Long id, @RequestBody Factura factura) {
	        return facturaService.actualizarFactura(id, factura);
	    }

	    @DeleteMapping("/{id}")
	    public void eliminarFactura(@PathVariable Long id) {
	        facturaService.eliminarFactura(id);
	    }
}
