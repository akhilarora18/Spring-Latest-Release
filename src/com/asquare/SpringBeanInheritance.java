package com.asquare;

public class SpringBeanInheritance {
    private String message;
    private String parentMessage;

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getParentMessage() {
        System.out.println("Parent's Message : " + parentMessage);;
    }

    public void setParentMessage(String parentMessage) {
        this.parentMessage = parentMessage;
    }
}
