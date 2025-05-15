package br.com.fiap.checkpoint1.service;

import br.com.fiap.checkpoint1.dto.consultas.ConsultasRequestCreate;
import br.com.fiap.checkpoint1.dto.consultas.ConsultasResponse;
import br.com.fiap.checkpoint1.model.Consultas;
import br.com.fiap.checkpoint1.model.Pacientes;
import br.com.fiap.checkpoint1.model.Profissionais;
import br.com.fiap.checkpoint1.repository.ConsultaRepository;
import br.com.fiap.checkpoint1.repository.PacienteRepository;
import br.com.fiap.checkpoint1.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private ProfissionalRepository profissionalRepository;
    @Autowired
    private PacienteRepository pacienteRepository;

    public Consultas criarConsulta(ConsultasRequestCreate dto){
        Consultas consulta = new Consultas();
        Profissionais profissionais = profissionalRepository.findById(dto.getProfissional_id())
                .orElseThrow(() ->
                        new RuntimeException("Produto inexistente: " + dto.getProfissional_id()));
        consulta.setProfissional(profissionais);
       Pacientes pacientes = pacienteRepository.findById(dto.getPaciente_id()).orElseThrow(() ->
               new RuntimeException("Produto inexistente: " + dto.getPaciente_id()));
        return consulta;
    }
}
