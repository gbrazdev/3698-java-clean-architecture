package br.com.alura.codechella.domain.entities.validation;

import java.util.regex.Pattern;

public class ValidaTelefone{
    private static final String PHONE_NUMBER_PATTERN = "^\\d{4}-\\d{4}$";
    private static final Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);

    public static boolean telefoneValido(String phoneNumber) {
        return pattern.matcher(phoneNumber).matches();
    }


}
