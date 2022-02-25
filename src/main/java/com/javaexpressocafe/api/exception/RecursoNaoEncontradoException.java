package com.javaexpressocafe.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



/**
 * Classe handler de erros ocorridos nas requisições HTTP
 * @author Matheus Marques
 * @since 20/02/2022
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNaoEncontradoException extends RuntimeException{

    public RecursoNaoEncontradoException() {
        super();
    }
    public RecursoNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
    public RecursoNaoEncontradoException(String message) {
        super(message);
    }
    public RecursoNaoEncontradoException(Throwable cause) {
        super(cause);
    }
}
