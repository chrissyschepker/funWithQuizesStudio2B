package com.company;

public abstract class Question {
    private String question;
    public Question (String className){
        question = ;
        //return question;
    }



    //contains a question method
    public String question(){
        return question;
    }

    //and has abstract answer method (each class has to create their own instance of this method
    public abstract String answer();
}
