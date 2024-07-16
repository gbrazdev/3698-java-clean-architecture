package br.com.alura.codechella.domain.entities.validation;

import java.util.regex.Pattern;

public class ValidaEmail{
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean emailValido(String email) {
        return pattern.matcher(email).matches();
    }


}
