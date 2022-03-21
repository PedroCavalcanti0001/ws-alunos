package br.com.pedroeugenio.wsalunos.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionInterceptor {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> checkExceptions(Exception exception) {
        String msg = exception.getLocalizedMessage() != null ? exception.getLocalizedMessage() : exception.getMessage();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
    }
}
