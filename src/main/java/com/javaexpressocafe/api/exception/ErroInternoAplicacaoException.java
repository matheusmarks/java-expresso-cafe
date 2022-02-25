package com.javaexpressocafe.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Classe handler de erros ocorridos nas requisições HTTP
 * @author Matheus Marques
 * @since 20/02/2022
 */

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ErroInternoAplicacaoException extends Exception {

    public ErroInternoAplicacaoException() {
        super();
    }
    public ErroInternoAplicacaoException(String message, Throwable cause) {
        super(message, cause);
    }
    public ErroInternoAplicacaoException(String message) {
        super(message);
    }
    public ErroInternoAplicacaoException(Throwable cause) {
        super(cause);
    }
}
