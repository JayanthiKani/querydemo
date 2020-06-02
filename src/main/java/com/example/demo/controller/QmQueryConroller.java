package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.QmQuery;
import com.example.demo.entity.QmQueryDetail;
import com.example.demo.service.QmQueryService;


public class QmQueryConroller {
	
	
	@Autowired  
	QmQueryService qmQueryService;  
	//creating a get mapping that retrieves all the records detail from the database   
	@GetMapping("/qmdetail")  
	private List<QmQuery> getAllQmQuery()   
	{  
	return qmQueryService.getAllRecords();  
	}  
	//creating a get mapping that retrieves the detail of a specific record  
	@GetMapping("/qmdetail/{queryId}")  
	private QmQuery getQmQuery(@PathVariable("queryId") long queryId)   
	{  
	return qmQueryService.getQmQueryByQueryId(queryId);  
	}  
	//creating a delete mapping that deletes a specified reocrd  
	@DeleteMapping("/qmdetail/{queryId}")  
	private void deleteQmQuery(@PathVariable("queryId") int queryId)   
	{  
		qmQueryService.delete(queryId);  
	}  
	//creating post mapping that post the record detail in the database  
	@PostMapping("/qmQuery")  
	private long saveQmQuery(@RequestBody QmQuery qmQuery)   
	{  
		qmQueryService.saveOrUpdate(qmQuery);  
	return qmQuery.getQueryId();  
	}  
	//creating put mapping that updates the query detail   
	@PutMapping("/qmQuery")  
	private QmQuery update(@RequestBody QmQuery qmQuery)   
	{  
		qmQueryService.saveOrUpdate(qmQuery);  
	return qmQuery;  
	}
	
	@GetMapping("/qmQuery/qmdetail/{queryId}")  
	private QmQueryDetail getQueryDetail(@PathVariable("queryId") long queryId)   
	{  
	return qmQueryService.getQueryDetailQueryId(queryId);  
	} 
	

}
