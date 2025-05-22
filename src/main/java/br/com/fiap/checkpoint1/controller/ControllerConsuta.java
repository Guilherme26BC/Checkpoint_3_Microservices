package br.com.fiap.checkpoint1.controller;

import br.com.fiap.checkpoint1.dto.consultas.ConsultasRequestCreate;
import br.com.fiap.checkpoint1.dto.consultas.ConsultasResponse;
import br.com.fiap.checkpoint1.model.ConsultaStatus;
import br.com.fiap.checkpoint1.service.ConsultaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("consulta")
public class ControllerConsuta {

@Autowired
    private ConsultaService consultaService;

    @PostMapping
    public ResponseEntity<ConsultasResponse> criarConsulta(ConsultasRequestCreate dto){
    return ResponseEntity.ok().body(new ConsultasResponse().toDto(consultaService.criarConsulta(dto)));
    }
    @GetMapping("/{id}")
    public ResponseEntity<ConsultasResponse> buscarPorId(@PathVariable Long id){
    return consultaService.buscarPorId(id).map(new ConsultasResponse()::toDto)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping
    public ResponseEntity<List<ConsultasResponse>> buscarTodas(){
    return ResponseEntity.ok().body(consultaService.buscarTodos().stream().map(
            c -> new ConsultasResponse().toDto(c)
    ).collect(Collectors.toList()));
    }
    @GetMapping("/query")
    public ResponseEntity<List<ConsultasResponse>> buscarPorStatus(ConsultaStatus consultaStatus){
        return ResponseEntity.ok().body(consultaService.buscarConsultaPorStatus(consultaStatus)
                .stream().map(p->new ConsultasResponse().toDto(p)).collect(Collectors.toList()));
    }

}
