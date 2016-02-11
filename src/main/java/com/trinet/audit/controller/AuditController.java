/**
 * 
 */
package com.trinet.audit.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trinet.audit.entity.AuditData;
import com.trinet.audit.entity.AuditEvent;
import com.trinet.audit.response.AuditResponse;
import com.trinet.audit.service.AuditService;

/**
 * @author laxmi_pabbaraju
 *  controller  class for audit service
 */
@RestController
public class AuditController {

	
	 private static Logger LOGGER  =  Logger.getLogger(AuditController.class);
	 
	@Autowired
	private AuditService auditService;
	
	/**
	 * Request mapping method  
	 * @return a json  with  welcome message
	 */
	 @RequestMapping("/")
	 public String index() {
		 
			AuditEvent auditEvent = new AuditEvent();

			List<AuditData> auditDataList = new ArrayList<AuditData>();
			AuditData auditData1 = new AuditData();
			AuditData auditData2 = new AuditData();

			auditData1.setColumnName("SALARY");
			auditData1.setOldValue("10000");
			auditData1.setNewValue("20000");

			auditData2.setColumnName("MANAGER");
			auditData2.setOldValue("Ramu");
			auditData2.setNewValue("Somu");

			auditDataList.add(auditData1);
			auditDataList.add(auditData2);

			auditEvent.setUserId("1001");
			auditEvent.setCompanyId("16301");
			auditEvent.setRemoteClientIp("127.0.0.1");
			auditEvent.setEnttryName("PERSISTENT_HYD");
			auditEvent.setRecordIdentfierName("EMP_ID");
			auditEvent.setRecordIdentfierValue("7970");
			auditEvent.setCriticalFieldName("EMP_NAME");
			auditEvent.setCriticalFieldValue("Laxmi");
			auditEvent.setTimeStamp(new Date().getTime());
			auditEvent.setServerId("Tech_support_copmuter");
			auditEvent.setAction("Update");
			auditEvent.setBlob(false);
			auditEvent.setApplicationName("Trinet_Employee");
			auditEvent.setMethodName("employeeDetails");
			auditEvent.setUiPage("user_frist_page");
			auditEvent.setBrowserInfo("ChromBrowser");
			auditEvent.setOsInfo("Windows7Enterprise");
			auditEvent.setMobileInfo("Samsung");
			auditEvent.setAuditData(auditDataList);

			List<AuditEvent> auditEventList = new ArrayList<AuditEvent>();
			auditEventList.add(auditEvent);
			
			
			ObjectMapper mapperObj = new ObjectMapper();
			String jsonStr = "";
			
			try {
				AuditResponse auditResponse = auditService.insertAuditDocument(auditEventList);
				jsonStr = mapperObj.writeValueAsString(auditResponse);
				LOGGER.info("Audit Response ::" + jsonStr );
			} catch (JsonProcessingException e) {
				
				LOGGER.error(e);
			}
			
		
	        return "Welcome to Audit service!!!" +jsonStr;
	    }
	 
	
}
