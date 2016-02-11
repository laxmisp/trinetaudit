/**
 * 
 */
package com.trinet.audit.entity;

import java.io.Serializable;

/**
 * @author laxmi_pabbaraju
 * It represents  the  data item in the entity
 */
public class AuditData  implements Serializable{
	
	private String columnName;
	private String oldValue;
	private String newValue;
	
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getOldValue() {
		return oldValue;
	}
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}
	public String getNewValue() {
		return newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
	

}
