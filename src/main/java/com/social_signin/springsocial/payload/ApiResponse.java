package com.social_signin.springsocial.payload;

public class ApiResponse<T> {

    private boolean success;
    private String message;
    //private T result;

    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
        //this.result = result;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /*public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }*/
}
