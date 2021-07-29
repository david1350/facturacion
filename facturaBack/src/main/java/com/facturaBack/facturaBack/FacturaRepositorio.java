package com.facturaBack.facturaBack;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface FacturaRepositorio extends Repository<Factura, Integer>{

	List<Factura> findAll();
	Factura findOne(int id);
	Factura save(Factura f);
	void delete(Factura f);
	
}
