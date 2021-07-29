package com.facturaBack.facturaBack;

import java.util.List;

import com.facturaBack.facturaBack.Factura;

public interface FacturaService {

	List<Factura>listar();
	Factura listar(int id);
	Factura crear(Factura f);
	Factura editar(Factura f);
	Factura borrar(int id);
	
}
