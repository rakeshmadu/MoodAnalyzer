package com.mood;

public class MoodAnalyser {

	public String moodAnalyse(String message){
		
		String words[] = message.split(" ");
		if (words[3].equalsIgnoreCase("sad"))
			return "SAD";
		return "HAPPY";
	}
}
