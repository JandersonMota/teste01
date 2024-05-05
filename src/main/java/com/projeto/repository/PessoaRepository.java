package com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
