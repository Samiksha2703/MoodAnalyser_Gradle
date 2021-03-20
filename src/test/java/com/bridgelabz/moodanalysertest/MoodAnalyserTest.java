package com.bridgelabz.moodanalysertest;

import com.bridgelabz.moodanalyser.MoodAnalizer;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MoodAnalyserTest {
    private final String inputMessage;
    private final String expectedMood;
    private MoodAnalizer moodAnalizer;

    public MoodAnalyserTest(String inputMessage, String expectedMood){
        super();
        this.inputMessage = inputMessage;
        this.expectedMood = expectedMood;
    }
    
    @Before
    public void initialize(){
        moodAnalizer = new MoodAnalizer();
    }

    @Parameterized.Parameters
            public static Collection<Object[]> input()
    {
        return Arrays.asList(new Object[][] {{"I am in Sad Mood", "SAD"}, {"", "HAPPY"}});
    }

    @Test
    public void moodAnalysis_WhenGivenMessage_ShouldReturn_ExpectedMood() {
        Assertions.assertEquals(expectedMood, moodAnalizer.analyseMood(inputMessage));
    }
}
