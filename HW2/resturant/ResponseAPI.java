package com.demo.HW2.resturant;

public class ResponseAPI {

    private String message;

    public ResponseAPI(String message) {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}