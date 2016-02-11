package com.trinet.audit.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.trinet.audit.controller.AuditController;
import com.trinet.audit.entity.AuditEvent;
import com.trinet.audit.response.AuditReport;
import com.trinet.audit.response.AuditResponse;

@Repository
/*
 * Dao Implementer class for  auditDao.
 */
public class AuditDaoImpl implements AuditDao {
	
	 private static Logger LOGGER  =  Logger.getLogger(AuditDaoImpl.class);
	 
	 /**
	  * This method is used to save Audit details .
	  */
	@Override
	public AuditResponse insertAuditDocument(List<AuditEvent> auditEvent) {

		LOGGER.info("Inside AuditDAO save......");
		if (auditEvent != null && !auditEvent.isEmpty())
			System.out.println(auditEvent.get(0));

		AuditResponse auditResponse = new AuditResponse();
		auditResponse.setStatusCode("200");
		auditResponse.setAuditException(null);

		return auditResponse;
	}

	
	/**
	 * this  method is used to retrieve the audit details for the report.
	 * 
	 */
	@Override
	public AuditReport queryAuditDocument(List<AuditEvent> auditEvent) {
		
		return null;
	}

	

}
