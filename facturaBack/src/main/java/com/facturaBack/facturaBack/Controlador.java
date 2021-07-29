package com.facturaBack.facturaBack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/fact"})
public class Controlador {
	
	@Autowired
	FacturaService service;
	
	@GetMapping
	public List<Factura>listar(){
		return service.listar();
	}

}
