package com.mood.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mood.analyse.MoodAnalyser;

public class MoodTest {

	@Test
	public void moodSad() {
		MoodAnalyser mood = new MoodAnalyser("I am in Sad Mood");
		assertEquals("SAD", mood.moodAnalyse());

	}

	@Test
	public void moodHappy() {
		MoodAnalyser mood = new MoodAnalyser("I am in any Mood");
		assertEquals("HAPPY", mood.moodAnalyse());

	}
}
