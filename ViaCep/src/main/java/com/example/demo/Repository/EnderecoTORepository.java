package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.EnderecoTO;

@Repository
public interface EnderecoTORepository extends JpaRepository<EnderecoTO, Long>{

}
