package com.codigorupestre;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codigorupestre.documents.domain.SolicitudBeca;
import com.codigorupestre.documents.repository.SolicitudesBecaRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class SolicitudBecaRepositoryTest {
	

	@Autowired
	private SolicitudesBecaRepository repository;
	
	/*
	 * Given: Teniendo los datos capturados y correctos desde
	 * la aplicacion mobil o la aplicacion web se envia una solicitud de beca
	 * para guardar en base dedatos mongo
	 * 
	 * When: Se envie la solicitud de guardado
	 * 
	 * Then: Se almacena en nuestra base de datos el registro
	 */
	@Test
	public void crearSolicitudTest() {
		
		log.info("Inicia prueba");
		
		SolicitudBeca solicitud = new SolicitudBeca();
		solicitud.setNombre("Eduardo Castillo Mendoza");
		solicitud.setEscuela("tesji");
		solicitud.setBeca("Estado del arte del desarrollo de software dos");
		
		repository.save(solicitud);
		
		log.info("Finaliza prueba");
		
		
	}

}

