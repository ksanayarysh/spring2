package com.ya;

public class BaseballCoach implements Coach{
    private FortuneService fortureService;

    public BaseballCoach(FortuneService fortureService) {
        this.fortureService = fortureService;
    }

    public String getDailyWorkout(){
        return "Spend 13 min";
    }
}
