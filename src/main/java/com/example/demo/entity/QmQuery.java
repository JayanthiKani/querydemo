package com.example.demo.entity;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "QM_QUERY")
public class QmQuery {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    @NotNull
	@Column(name = "QUERYID")
	private Long queryId;
    @Size(min = 1, max = 30)
	@Column(name = "INDUSID")
	private String indusId ; 
    @Size(max = 100)
	@Column(name = "CATEGORY")
	private String category ;
	@Column(name = "DATERAISED")
	private Date dateRaised; 
	@Column(name = "STATUS")
	private Long status ;
    @Size(max = 100)
	@Column(name = "EMPUSERNAME")
	private String empuserName;
    @Size(max = 100)
	@Column(name = "LLUSERNAME")
	private String lluserName  ;
	@Size(max = 100)
	@Column(name = "ASSIGNEDTO")
	private String assignedto ;
	@Size(max = 100)
	@Column(name = "LASTUPDATEDBY")
	private String lastUpdatedBy;
	@Column(name = "LASTUPDATEDDATETIME")
	private Date lastUpdatedDateTime ;
	@Size(max = 50)
	@Column(name = "ASSIGNEDDEPARTMENT")
	private String assigneddepartment;
	@Size(max = 30)
	@Column(name = "QUERYTYPE")
	private String queryType;
	@Size(max = 30)
	@Column(name = "PRIORITY")
	private String priority; 	
	
	@Size(max = 150)
	@Column(name = "SUBCATEGORY")
	private String subCategory ;
	
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "QUERYID", unique = true)
	private QmQueryDetail qmQueryDetail;
	
	/**
	 * @return the queryId
	 */
	public Long getQueryId() {
		return queryId;
	}
	/**
	 * @param queryId the queryId to set
	 */
	public void setQueryId(Long queryId) {
		this.queryId = queryId;
	}
	/**
	 * @return the indusId
	 */
	public String getIndusId() {
		return indusId;
	}
	/**
	 * @param indusId the indusId to set
	 */
	public void setIndusId(String indusId) {
		this.indusId = indusId;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the dateRaised
	 */
	public Date getDateRaised() {
		return dateRaised;
	}
	/**
	 * @param dateRaised the dateRaised to set
	 */
	public void setDateRaised(Date dateRaised) {
		this.dateRaised = dateRaised;
	}
	/**
	 * @return the status
	 */
	public Long getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Long status) {
		this.status = status;
	}
	/**
	 * @return the empuserName
	 */
	public String getEmpuserName() {
		return empuserName;
	}
	/**
	 * @param empuserName the empuserName to set
	 */
	public void setEmpuserName(String empuserName) {
		this.empuserName = empuserName;
	}
	/**
	 * @return the lluserName
	 */
	public String getLluserName() {
		return lluserName;
	}
	/**
	 * @param lluserName the lluserName to set
	 */
	public void setLluserName(String lluserName) {
		this.lluserName = lluserName;
	}
	/**
	 * @return the assignedto
	 */
	public String getAssignedto() {
		return assignedto;
	}
	/**
	 * @param assignedto the assignedto to set
	 */
	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}
	/**
	 * @return the lastUpdatedBy
	 */
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	/**
	 * @param lastUpdatedBy the lastUpdatedBy to set
	 */
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	/**
	 * @return the lastUpdatedDateTime
	 */
	public Date getLastUpdatedDateTime() {
		return lastUpdatedDateTime;
	}
	/**
	 * @param lastUpdatedDateTime the lastUpdatedDateTime to set
	 */
	public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}
	/**
	 * @return the assigneddepartment
	 */
	public String getAssigneddepartment() {
		return assigneddepartment;
	}
	/**
	 * @param assigneddepartment the assigneddepartment to set
	 */
	public void setAssigneddepartment(String assigneddepartment) {
		this.assigneddepartment = assigneddepartment;
	}
	/**
	 * @return the queryType
	 */
	public String getQueryType() {
		return queryType;
	}
	/**
	 * @param queryType the queryType to set
	 */
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}
	/**
	 * @return the subCategory
	 */
	public String getSubCategory() {
		return subCategory;
	}
	/**
	 * @param subCategory the subCategory to set
	 */
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public QmQueryDetail getQmQueryDetail() {
		return qmQueryDetail;
	}
	public void setQmQueryDetail(QmQueryDetail qmQueryDetail) {
		this.qmQueryDetail = qmQueryDetail;
	}   
	
	
	
	
	
	

}