package com.pluralsight.loops;

public class Workout {
    private String exerciseType;
    private String dayOfWeek;
    private int caloriesBurned;

    public Workout(String exerciseType, String dayOfWeek, int caloriesBurned) {
        this.exerciseType = exerciseType;
        this.dayOfWeek = dayOfWeek;
        this.caloriesBurned = caloriesBurned;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
