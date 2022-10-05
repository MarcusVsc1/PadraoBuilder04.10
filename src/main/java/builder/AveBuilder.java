package builder;

import model.Ave;

import java.util.Date;

public class AveBuilder {

    private Ave ave;

    public AveBuilder() {
        this.ave = new Ave();
    }

    public Ave build() {
        if (this.ave.getPeso() <= 0){
            throw new IllegalArgumentException("Ave precisa ter peso válido");
        }
        if (this.ave.getNomeEspecie().equals("")){
            throw new IllegalArgumentException("Ave precisa ter nome válido");
        };
        return ave;
    }

    public AveBuilder setPeso(Integer peso){
        this.ave.setPeso(peso);
        return this;
    }

    public AveBuilder setNomeEspecie(String nomeEspecie){
        this.ave.setNomeEspecie(nomeEspecie);
        return this;
    }

    public AveBuilder setIsVoador(Boolean isVoador){
        this.ave.setIsVoador(isVoador);
        return this;
    }

    public AveBuilder setCor(String cor){
        this.ave.setCor(cor);
        return this;
    }

    public AveBuilder setDataNascimento(Date dataNascimento){
        this.ave.setDataNascimento(dataNascimento);
        return this;
    }

    public AveBuilder setIsDomestico(Boolean isDomestico){
        this.ave.setIsDomestico(isDomestico);
        return this;
    }
}
