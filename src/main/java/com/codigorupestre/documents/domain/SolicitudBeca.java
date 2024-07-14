package com.codigorupestre.documents.domain;



import org.springframework.data.annotation.Id;

import com.redis.om.spring.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class SolicitudBeca {
	
	@Id
	private String id;
	
	private String nombre;
	
	private String escuela;
	
	private String beca;
	

}
