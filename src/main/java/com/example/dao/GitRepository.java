package com.example.dao;



import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.model.Git;
@Repository
public interface GitRepository extends JpaRepository<Git, Serializable>{
	@Query(value="select * from git where name=?", nativeQuery = true)
	public List<Git> fingByName(String name);
	
	public List<Git> findByCity(String city);

}
