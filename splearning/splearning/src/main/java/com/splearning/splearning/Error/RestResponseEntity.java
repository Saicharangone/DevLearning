package com.splearning.splearning.Error;

import com.splearning.splearning.entity.ErrorMsg;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntity extends ResponseEntityExceptionHandler {


    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<ErrorMsg> departmentNotFound(DepartmentNotFoundException departmentNotFoundException, WebRequest webRequest){

        ErrorMsg errorMsg=new ErrorMsg(HttpStatus.NOT_FOUND ,departmentNotFoundException.getMessage());

        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMsg);







    }

}
