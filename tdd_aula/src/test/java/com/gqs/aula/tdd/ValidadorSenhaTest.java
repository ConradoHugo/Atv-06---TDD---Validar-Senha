package com.gqs.aula.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
    void deveRejeitarSenhaComMenosDeOitoCaracteres () {
        ValidadorSenha.Resultado resultado = ValidadorSenha.validar ("Senha@123");

        assertTrue(resultado.isValida());

    assertTrue(resultado.getErros().contains("A senha deve ter pelo menos 8 caracteres"));
}


}