package com.treino.web.demo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUId = 1L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable cause) {
        super(msg,cause);
    }
}
