package br.com.alura.codechella.domain.entities.validation;

import java.util.regex.Pattern;

public class ValidaCEP{
    private static final String CEP_PATTERN = "^\\d{5}-\\d{3}$";
    private static final Pattern pattern = Pattern.compile(CEP_PATTERN);

    public static boolean cepValido(String cep) {
        return pattern.matcher(cep).matches();
    }


}
