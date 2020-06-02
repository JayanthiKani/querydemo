package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "QM_QUERYDETAILS")
public class QmQueryDetail {
	
	
    @Id
	@NotNull
	@Column(name = "QUERYID")
	private long queryid;
	@NotNull
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "QUERYDETAILID")
	private long querydetailid;
    @Column(name = "DETAILS")
	private String details;
    @Column(name = "EMPUSERNAME")
	private String empusername;
    @Column(name = "LLUSERNAME")
	private String llusername  ;
    @Column(name = "LASTUPDATEDDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
	private Date lastupdateddatetime ;
    @Column(name = "ASSIGNED_TO")
	private String assignedTo;
    @Column(name = "CALLFROM_TYPE")
	private String callfromType;
    @Column(name = "CALLFROM_NAME")
	private String callfromName;
    @Column(name = "CALLFROM_NUMBER")
	private String callfromNumber;
    
    @OneToOne(fetch=FetchType.LAZY)
    private  QmQuery qmQuery;
    
	public long getQueryid() {
		return queryid;
	}
	public void setQueryid(long queryid) {
		this.queryid = queryid;
	}
	public long getQuerydetailid() {
		return querydetailid;
	}
	public void setQuerydetailid(long querydetailid) {
		this.querydetailid = querydetailid;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getEmpusername() {
		return empusername;
	}
	public void setEmpusername(String empusername) {
		this.empusername = empusername;
	}
	public String getLlusername() {
		return llusername;
	}
	public void setLlusername(String llusername) {
		this.llusername = llusername;
	}
	public Date getLastupdateddatetime() {
		return lastupdateddatetime;
	}
	public void setLastupdateddatetime(Date lastupdateddatetime) {
		this.lastupdateddatetime = lastupdateddatetime;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getCallfromType() {
		return callfromType;
	}
	public void setCallfromType(String callfromType) {
		this.callfromType = callfromType;
	}
	public String getCallfromName() {
		return callfromName;
	}
	public void setCallfromName(String callfromName) {
		this.callfromName = callfromName;
	}
	public String getCallfromNumber() {
		return callfromNumber;
	}
	public void setCallfromNumber(String callfromNumber) {
		this.callfromNumber = callfromNumber;
	}
	public QmQuery getQmQuery() {
		return qmQuery;
	}
	public void setQmQuery(QmQuery qmQuery) {
		this.qmQuery = qmQuery;
	}
	
    
    
    
    

}
