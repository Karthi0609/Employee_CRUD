package com.example.employee.dto;

public class ApiResponse {
    private boolean success;
    private String message;

    // Constructor
    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    // Getters
    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    // Optionally, setters if you need to modify
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
