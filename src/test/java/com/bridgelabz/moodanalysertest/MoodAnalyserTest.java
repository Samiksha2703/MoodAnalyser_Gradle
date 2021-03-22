package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalizer;
import com.bridgelabz.moodanalyser.MoodAnalysisException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

    MoodAnalizer moodAnalizer;

    @Test
    public void moodAnalysis_WhenMessageCotainSAD_ShouldReturn_SAD() {
        moodAnalizer = new MoodAnalizer("I am in sad Mood");
        String mood = null;
        try {
            mood = moodAnalizer.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void moodAnalysis_WhenMessageDoNotCotainSAD_ShouldReturn_HAPPY() {
        moodAnalizer = new MoodAnalizer("I am in Any Mood");
        String mood = null;
        try {
            mood = moodAnalizer.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void moodAnalysis_WhenNullMood_ShouldThrowException() {
        moodAnalizer = new MoodAnalizer(null);
        try {
            moodAnalizer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals("Please enter proper message", e.getMessage());
        }
    }

    @Test
    public void moodAnalysis_WhenNoMessage_ShoulThrowException(){
        moodAnalizer = new MoodAnalizer(" ");
        try {
            moodAnalizer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals("Please enter proper message", e.getMessage());
        }
    }
}
