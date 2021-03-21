package com.bridgelabz.moodanalyser;

public class MoodAnalizer {

    public String analyseMood(String message) {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e) {
            return "HAPPY";
        }
    }
}
