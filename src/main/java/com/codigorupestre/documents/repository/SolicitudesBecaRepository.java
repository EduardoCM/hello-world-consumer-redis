package com.codigorupestre.documents.repository;

import com.codigorupestre.documents.domain.SolicitudBeca;
import com.redis.om.spring.repository.RedisDocumentRepository;

public interface SolicitudesBecaRepository extends RedisDocumentRepository<SolicitudBeca, String> {

}
