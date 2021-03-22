package com.bridgelabz.moodanalyser;

public class MoodAnalizer {

    private String userMessage;

    public MoodAnalizer(String userMessage){
        this.userMessage = userMessage;
   }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (userMessage.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(Exception e) {
            throw new MoodAnalysisException("Please enter proper message");
        }
    }
}
