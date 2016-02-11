package com.trinet.audit.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinet.audit.dao.AuditDao;
import com.trinet.audit.entity.AuditEvent;
import com.trinet.audit.response.AuditReport;
import com.trinet.audit.response.AuditResponse;

@Service
public class GenericAuditService implements AuditService {

	
	 private AuditDao auditDao;
	
	 @Autowired
	 public void setAuditDao(AuditDao auditDao) {
		this.auditDao = auditDao;
	}

	@Override
	public AuditResponse insertAuditDocument(List<AuditEvent> auditEvent) {
		
		 System.out.println("Inside Audit...");
		 AuditResponse auditResponse = auditDao.insertAuditDocument(auditEvent);
		 System.out.println("Inside GenericAuditService Response... " + auditResponse);
		 return auditResponse;
	}

	@Override
	public AuditReport queryAuditDocument(Map auditQueryInputMap) {
		// TODO Auto-generated method stub
		return null;
	}

}
