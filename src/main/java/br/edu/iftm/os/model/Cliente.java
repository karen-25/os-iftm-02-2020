package br.edu.iftm.os.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente implements Serializable {
    private Integer id;
    private String nomeFantasia;
    private String sobrenome_razao;
    private LocalDate dataNascimento;
    private LocalTime dataCadastro;
    private String cpf_cnpj;
    private String rg_inscricao;
    private String email;
    private String sexo;
    
}
