package com.douglassantos.springgof.repository;

import com.douglassantos.springgof.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
