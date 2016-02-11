package com.trinet.audit.service;

import java.util.List;
import java.util.Map;

import com.trinet.audit.dao.AuditDao;
import com.trinet.audit.entity.AuditEvent;
import com.trinet.audit.response.AuditReport;
import com.trinet.audit.response.AuditResponse;

public interface AuditService {

	public AuditResponse   insertAuditDocument(List<AuditEvent> auditTrail);
	public AuditReport  queryAuditDocument( Map auditQueryInputMap);
	
	

	
}
