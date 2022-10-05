package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Ave {
    private Integer peso;
    private Boolean isVoador;
    private String nomeEspecie;
    private String cor;
    private Date dataNascimento;
    private Boolean isDomestico;

    public Ave() {
        peso = 0;
        nomeEspecie = "";
    }
}