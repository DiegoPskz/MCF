package Entidad;

import java.time.LocalDate;

public class Factura {
	
	    private Long id;
	    private Long clienteId;
	    private Double monto;
	    private LocalDate fecha;
		public Factura(Long id, Long clienteId, Double monto, LocalDate fecha) {
			super();
			this.id = id;
			this.clienteId = clienteId;
			this.monto = monto;
			this.fecha = fecha;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getClienteId() {
			return clienteId;
		}
		public void setClienteId(Long clienteId) {
			this.clienteId = clienteId;
		}
		public Double getMonto() {
			return monto;
		}
		public void setMonto(Double monto) {
			this.monto = monto;
		}
		public LocalDate getFecha() {
			return fecha;
		}
		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}
	    
	    
	  
}
