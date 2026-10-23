package com.gqs.aula.tdd;

import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public static class Resultado {
        private boolean valida;
        private List<String> erros;

        public Resultado(boolean valida, List<String> erros) {
            this.valida = valida;
            this.erros = erros;
        }

        public boolean isValida() {
            return valida;
        }

        public List<String> getErros() {
            return erros;
        }
    }

        public static Resultado
    validar(String senha) {
        List<String> erros = new ArrayList<>();

        if (senha.length() < 8) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

        boolean valida = erros.isEmpty();

        return new Resultado(valida, erros);

    }


}