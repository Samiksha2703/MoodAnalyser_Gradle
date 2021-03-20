package com.bridgelabz.moodanalyser;

public class MoodAnalizer {

    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
