package com.amitph.spring.tutorials.springdatajdbc.repo;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query("select * from student where last_name = :lName")
    List<Student> findByLastName(@Param("lName") String lastName);

}