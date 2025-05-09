package br.com.fiap.checkpoint1.repository;

import br.com.fiap.checkpoint1.model.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Pacientes, Long> {
}
