package br.com.fiap.checkpoint1.repository;

import br.com.fiap.checkpoint1.model.ConsultaStatus;
import br.com.fiap.checkpoint1.model.Consultas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consultas, Long> {
    public List<Consultas> findByStatus(ConsultaStatus consultaStatus);

}
