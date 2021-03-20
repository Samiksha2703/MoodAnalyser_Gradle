package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void testmoodAnalysis() {

        MoodAnalizer moodAnalizer = new MoodAnalizer();

        String mood = moodAnalizer.analyseMood("This is the sad message");

        Assertions.assertEquals("SAD", mood);
    }
}
