package com.javainuse.step;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {

	@Override
	public String process(String data) throws Exception {
		
		Long starttime = System.currentTimeMillis();
		System.out.println("Process Start milliseconds " + starttime);
		for(int i=0;i<1452000;i++) {
			System.out.println("i values are: " + i);
		}
		System.out.println("Process End milliseconds " + System.currentTimeMillis());
		Long endtime = System.currentTimeMillis();
		Long milliseconds = System.currentTimeMillis();
		int seconds = (int) (milliseconds / 1000) % 60 ;
		int minutes = (int) ((milliseconds / (1000*60)) % 60); 
		int hours = (int) ((milliseconds / (1000*60*60)) % 24);
		Long elapsedTime = starttime - endtime;
		seconds = (int) (elapsedTime / 1000) % 60 ;
		System.out.println("Process End Calculated milliseconds,Seconds,Minutes,Hours " + elapsedTime + " Seconds-" + seconds);
		return data.toUpperCase();
	}

}
