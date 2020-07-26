package com.resttemplate.ibbdata.repository;

import com.resttemplate.ibbdata.model.Park;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkRepository extends CrudRepository<Park, Long> {
}
