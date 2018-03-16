package com.unibave.microservice.disciplina;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DisciplinaDTO {

    String nome;
    Integer cargaHoraria;
    @JsonFormat(pattern = "dd/MM/yyyy")
    Date dataInicio;
    List<String> alunosMatriculados;

}
