package imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImcTest {

    Imc imc;

    @BeforeEach
    void setUp(){
        imc = new Imc();
    }

    @Test
    void deveRetornarImcFemininoAbaixoDoPeso(){
        imc.setPeso(19);
        imc.setAltura(1);
        imc.setSexo(true);
        assertEquals("Abaixo do peso", imc.calculaImc());
    }

    @Test
    void deveRetornarImcFemininoNoPesoNormal(){
        imc.setPeso(25.7);
        imc.setAltura(1);
        imc.setSexo(true);
        assertEquals("No peso Normal", imc.calculaImc());
    }

    @Test
    void deveRetornarImcFemininoMarginalmenteAcimadoPeso(){
        imc.setPeso(27.2);
        imc.setAltura(1);
        imc.setSexo(true);
        assertEquals("Marginalmente acima do peso", imc.calculaImc());
    }
    @Test
    void deveRetornarImcFemininoAcimaDoPesoIdeal(){
        imc.setPeso(32.2);
        imc.setAltura(1);
        imc.setSexo(true);
        assertEquals("Acima do peso ideal", imc.calculaImc());
    }

    @Test
     void deveRetornarImcFemininoObseso(){
        imc.setPeso(32.3);
        imc.setAltura(1);
        imc.setSexo(true);
        assertEquals("Obeso", imc.calculaImc());
    }

    @Test
    void deveRetornarImcMasculinoAbaixoDoPeso(){
        imc.setPeso(20.6);
        imc.setAltura(1);
        imc.setSexo(false);
        assertEquals("Abaixo do peso", imc.calculaImc());
    }

    @Test
    void deveRetornarImcMasculinoNoPesoNormal(){
        imc.setPeso(26.3);
        imc.setAltura(1);
        imc.setSexo(false);
        assertEquals("No peso Normal", imc.calculaImc());
    }

    @Test
    void deveRetornarImcMasculinoMarginalmenteAcimadoPeso(){
        imc.setPeso(27.7);
        imc.setAltura(1);
        imc.setSexo(false);
        assertEquals("Marginalmente acima do peso", imc.calculaImc());
    }
    @Test
    void deveRetornarImcMasculinoAcimaDoPesoIdeal(){
        imc.setPeso(31);
        imc.setAltura(1);
        imc.setSexo(false);
        assertEquals("Acima do peso ideal", imc.calculaImc());
    }

    @Test
    void deveRetornarImcMasculinoObseso(){
        imc.setPeso(31.1);
        imc.setAltura(1);
        imc.setSexo(false);
        assertEquals("Obeso", imc.calculaImc());
    }

}