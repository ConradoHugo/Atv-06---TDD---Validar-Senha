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

    @Test
    void deveExigirPeloMenosDoisDigitos() {
        ValidadorSenha.Resultado resultado =

    ValidadorSenha.validar("Senha@ab");

        assertFalse(resultado.isValida());

    assertTrue(resultado.getErros().contains("A senha deve conter pelo menos 2 digitos"));
    }

    @Test
    void deveExigirPeloMenosUmaLetraMaiuscula() {
        ValidadorSenha.Resultado resultado = 

        ValidadorSenha.validar("senha@123");

        assertFalse(resultado.isValida());

        assertTrue(resultado.getErros().contains("A senha deve conter pelo menos uma letra maiuscula"));
    }

}