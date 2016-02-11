/**
 * 
 */
package com.trinet.audit.dao;

import java.util.List;

import com.trinet.audit.entity.AuditEvent;
import com.trinet.audit.response.AuditReport;
import com.trinet.audit.response.AuditResponse;

/**
 * @author laxmi_pabbaraju
 *
 */
public interface AuditDao {
	
	public AuditResponse insertAuditDocument(List<AuditEvent> auditEvent);
	public AuditReport queryAuditDocument(List<AuditEvent> auditEvent);

}
