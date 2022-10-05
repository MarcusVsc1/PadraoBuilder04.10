import builder.AveBuilder;
import model.Ave;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class AveBuilderTest {


    @Test
    public void pesoVazioTest(){
        try {
            AveBuilder aveBuilder = new AveBuilder();
            Ave ave = aveBuilder
                    .setIsVoador(false)
                    .setCor("Vermelho")
                    .setNomeEspecie("Cacatua")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ave precisa ter peso válido",e.getMessage());
        }
    }

    @Test
    public void nomeEspecieVazioTest(){
        try {
            AveBuilder aveBuilder = new AveBuilder();
            Ave ave = aveBuilder
                    .setIsVoador(false)
                    .setCor("Vermelho")
                    .setPeso(50)
                    .setDataNascimento(new Date(System.currentTimeMillis()))
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ave precisa ter nome válido",e.getMessage());
        }
    }

    @Test
    public void buildCorretoTest(){

        AveBuilder aveBuilder = new AveBuilder();
        Ave ave = aveBuilder
                .setIsVoador(false)
                .setCor("Vermelho")
                .setPeso(50)
                .setNomeEspecie("Cacatua")
                .setIsDomestico(true)
                .build();

        assertNotNull(ave);

    }

}
