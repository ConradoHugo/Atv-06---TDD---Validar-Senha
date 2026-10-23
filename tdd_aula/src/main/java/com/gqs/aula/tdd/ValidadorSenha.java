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

        int quantidadeDigitos = 0;

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);

            if(Character.isDigit(caractere)) {
                quantidadeDigitos++;
            }
        }

        if (quantidadeDigitos < 2) {
            erros.add("A senha deve conter pelo menos 2 digitos");
        } 

        boolean temMaiuscula = false;

        for (int i = 0; i < senha.length(); i++) {
            if(Character.isUpperCase(senha.charAt(i))){

                temMaiuscula = true;
                break;
            }
        }

        if (!temMaiuscula) {
            erros.add("A senha deve conter pelo menos uma letra maiuscula");

        }

        boolean valida = erros.isEmpty();

        return new Resultado(valida, erros);
        
    
        
    
    }
}