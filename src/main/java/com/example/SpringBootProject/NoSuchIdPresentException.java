package com.example.SpringBootProject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class NoSuchIdPresentException extends RuntimeException{
    private String message;
    public NoSuchIdPresentException(){
        super();
    }
    public NoSuchIdPresentException(String message){
        super(message);
    }
}
