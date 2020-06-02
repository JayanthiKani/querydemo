package com.example.demo.repository;




import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.QmQuery;
import com.example.demo.entity.QmQueryDetail;




@Repository
public interface QmQueryRepository extends CrudRepository<QmQuery, Long> {
	
    List<QmQuery> findByQueryId(long queryId);

	void deleteByQueryId(long id);
	
	List<QmQueryDetail> findByQmQueriesQmQueryDetailQueryId(long queryId);
	
	


}
