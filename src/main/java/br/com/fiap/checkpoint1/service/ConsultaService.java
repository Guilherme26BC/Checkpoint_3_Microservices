package br.com.fiap.checkpoint1.service;

import br.com.fiap.checkpoint1.dto.consultas.ConsultasRequestCreate;
import br.com.fiap.checkpoint1.dto.consultas.ConsultasResponse;
import br.com.fiap.checkpoint1.model.ConsultaStatus;
import br.com.fiap.checkpoint1.model.Consultas;
import br.com.fiap.checkpoint1.model.Pacientes;
import br.com.fiap.checkpoint1.model.Profissionais;
import br.com.fiap.checkpoint1.repository.ConsultaRepository;
import br.com.fiap.checkpoint1.repository.PacienteRepository;
import br.com.fiap.checkpoint1.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private ProfissionalRepository profissionalRepository;
    @Autowired
    private PacienteRepository pacienteRepository;

    public Consultas criarConsulta(ConsultasRequestCreate dto){
//        Consultas consulta = new Consultas();
//        Profissionais profissionais = profissionalRepository.findById(dto.getProfissional_id())
//                .orElseThrow(() ->
//                        new RuntimeException("Produto inexistente: " + dto.getProfissional_id()));
//        consulta.setProfissional(profissionais);
//       Pacientes pacientes = pacienteRepository.findById(dto.getPaciente_id()).orElseThrow(() ->
//               new RuntimeException("Produto inexistente: " + dto.getPaciente_id()));
//
//       consulta.setData_consulta(dto.getData_consulta());
//       consulta.setStatus(ConsultaStatus.MARCADA);
//       consulta.setValor_consulta(dto.getValor_consulta());
//       consulta.setQuantidade_horas(dto.getQuantidade_horas());
//       consulta.setCreated_at(LocalDateTime.now());
//       consulta.setUpdated_at(LocalDateTime.now());

        return consultaRepository.save(dto.toModel(profissionalRepository, pacienteRepository));
    }
    public Optional<Consultas> buscarPorId(Long id){
        return consultaRepository.findById(id);
    }
    public List<Consultas> buscarTodos(){
        return consultaRepository.findAll();
    }

    public List<Consultas> buscarConsultaPorStatus(ConsultaStatus consultaStatus){
        return consultaRepository.findByStatus(consultaStatus);
    }
    public Optional<Consultas> atualizarConsulta(){
        return null;
    }
    public boolean deletarConsulta(){
        return false;
    }



}
