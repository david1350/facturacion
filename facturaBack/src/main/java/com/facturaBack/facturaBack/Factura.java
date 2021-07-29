package com.facturaBack.facturaBack;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="factura")
public class Factura {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num_factura;
	
	@Column
	private int num_cliente;
	
	@Column
	private Date fecha;

	public int getNum_factura() {
		return num_factura;
	}

	public void setNum_factura(int num_factura) {
		this.num_factura = num_factura;
	}

	public int getNum_cliente() {
		return num_cliente;
	}

	public void setNum_cliente(int num_cliente) {
		this.num_cliente = num_cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}