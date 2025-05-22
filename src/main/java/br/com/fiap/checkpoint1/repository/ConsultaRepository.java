package br.com.fiap.checkpoint1.repository;

import br.com.fiap.checkpoint1.model.ConsultaStatus;
import br.com.fiap.checkpoint1.model.Consultas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consultas, Long> {
    public List<Consultas> findByStatus(ConsultaStatus consultaStatus);
    //public List<Profissionais> findByIdAndConsultaStatus(Long id, ConsultaStatus consultaStatus);
    //public List<Consultas> findByIdPacientesAndConsultaStatus(Long id, ConsultaStatus consultaStatus);
}
