package br.com.fiap.checkpoint1.repository;

import br.com.fiap.checkpoint1.model.Consultas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consultas, Long> {
}
