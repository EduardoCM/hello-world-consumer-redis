package com.codigorupestre.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codigorupestre.documents.domain.SolicitudBeca;
import com.codigorupestre.documents.repository.SolicitudesBecaRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SolicitudesBecasListener {
	
	@Autowired
	private SolicitudesBecaRepository repository;
	
	@RabbitListener(queues = "q.codigorupestre.becas.tableros")
	public void recibirSolicitudesBecas(SolicitudBeca solicitudBeca) {
		log.info("Solicitud de beca recibida {} ", solicitudBeca);
		repository.save(solicitudBeca);
	}

}
