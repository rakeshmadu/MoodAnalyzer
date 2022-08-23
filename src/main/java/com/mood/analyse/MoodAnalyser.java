package com.mood.analyse;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser() {
		// TODO Auto-generated constructor stub
	}

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String moodAnalyse() throws NullPointerException{
		try {
			String words[] = message.split(" ");
			if (words[3].equalsIgnoreCase("sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			return "HAPPY";
		}
	}
}
