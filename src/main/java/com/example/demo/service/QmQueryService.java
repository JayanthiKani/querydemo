package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.entity.QmQuery;
import com.example.demo.entity.QmQueryDetail;
import com.example.demo.repository.QmQueryRepository;

@Component
public class QmQueryService {

	@Autowired
	private QmQueryRepository qmQueryRepository;

	/*
	 * public List<String> getAllEmpUserName(long queryId) {
	 * 
	 * List<String> result = new ArrayList<String>(); List<QmQuery> qmQuery =
	 * qmQueryRepository.findByQueryId(queryId); for (QmQuery queryList : qmQuery) {
	 * result.add(queryList.getEmpuserName()); } return result; }
	 * 
	 * public void addQmQueryDetail(Long queryId, String indusId, String
	 * empuserName) {
	 * 
	 * 
	 * QmQuery newRecord = new QmQuery(); newRecord.setQueryId(queryId);
	 * newRecord.setIndusId(indusId); newRecord.setEmpuserName(empuserName);
	 * qmQueryRepository.save(newRecord);
	 * 
	 * }
	 * 
	 */

	// getting all record by using the method findaAll() of CrudRepository
	public List<QmQuery> getAllRecords() {
		List<QmQuery> queryqm = new ArrayList<>();
		qmQueryRepository.findAll().forEach(queryqm::add);
		return queryqm;
	}

	// getting a specific record by using the method findByqueryId() of
	// CrudRepository
	public QmQuery getQmQueryByQueryId(long id) {
		return qmQueryRepository.findByQueryId(id).get(1);
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(QmQuery qmQuery) {
		qmQueryRepository.save(qmQuery);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(long id) {
		qmQueryRepository.deleteByQueryId(id);
	}

	// updating a record
	public void update(QmQuery qmQuery, int queryId) {
		qmQueryRepository.save(qmQuery);
	}
	
	public QmQueryDetail getQueryDetailQueryId(long id) {
		return qmQueryRepository.findByQmQueriesQmQueryDetailQueryId(id).get(1);
	}
	
}