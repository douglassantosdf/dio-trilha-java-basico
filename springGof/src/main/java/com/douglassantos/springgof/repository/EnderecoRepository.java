package com.douglassantos.springgof.repository;

import com.douglassantos.springgof.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
