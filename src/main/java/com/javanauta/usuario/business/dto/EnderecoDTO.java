package com.javanauta.usuario.business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTO {

    private String rua;
    private String cidade;
    private String complemento;
    private String numero;
    private String estado;
    private String cep;

}
