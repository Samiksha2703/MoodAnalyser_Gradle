package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    MoodAnalizer moodAnalizer = new MoodAnalizer();

    @Test
    public void moodAnalysis_WhenMessageCotainSAD_ShouldReturn_SAD() {

        String mood = moodAnalizer.analyseMood("I am in Sad Mood");

        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void moodAnalysis_WhenMessageDoNotCotainSAD_ShouldReturn_HAPPY() {

        String mood = moodAnalizer.analyseMood("I am in Any Mood");

        Assertions.assertEquals("HAPPY", mood);
    }
}
