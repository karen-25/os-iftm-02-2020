package br.edu.iftm.os.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Endereco {
    private Integer id;
    private String descricao;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private Cliente cliente_id;
}