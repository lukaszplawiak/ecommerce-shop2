package com.lukaszplawiak.ecommerceshop.dao;

import com.lukaszplawiak.ecommerceshop.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//@CrossOrigin("http://localhost:4200") - bo skonfigurowane w MyDataRestConfig
@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer> {

    List<State> findByCountryCode(@Param("code") String code);
}
