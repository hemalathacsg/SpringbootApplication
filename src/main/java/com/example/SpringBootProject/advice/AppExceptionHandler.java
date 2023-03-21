package com.example.SpringBootProject.advice;
import com.example.SpringBootProject.NoSuchIdPresentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class AppExceptionHandler {
    @ExceptionHandler(NoSuchIdPresentException.class)
    public ResponseEntity<ErrorType> handleIdNotFound(NoSuchIdPresentException ex){
       return new ResponseEntity<ErrorType>(new ErrorType(ex.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
