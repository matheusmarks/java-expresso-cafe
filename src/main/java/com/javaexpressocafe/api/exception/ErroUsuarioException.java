package com.javaexpressocafe.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Classe handler de erros ocorridos nas requisições HTTP
 * @author Matheus Marques
 * @since 20/02/2022
 */

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ErroUsuarioException extends Exception {

    public ErroUsuarioException() {
        super();
    }
    public ErroUsuarioException(String message, Throwable cause) {
        super(message, cause);
    }
    public ErroUsuarioException(String message) {
        super(message);
    }
    public ErroUsuarioException(Throwable cause) {
        super(cause);
    }
}
