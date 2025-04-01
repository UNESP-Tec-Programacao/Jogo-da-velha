package br.unesp.jogodavelha.backend.exceptionHandlers;

import br.unesp.jogodavelha.backend.exceptions.PersonException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PersonExceptionHandler {

    @ExceptionHandler(PersonException.class)
    public ResponseEntity<Object> handlePersonException(PersonException exception){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("Error: " + exception.getMessage());
    }
}
