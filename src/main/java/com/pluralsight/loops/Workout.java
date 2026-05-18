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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Workout{");
        sb.append("workout name='").append(exerciseType).append('\'');
        sb.append(", day of week='").append(dayOfWeek).append('\'');
        sb.append(", calories burned=").append(caloriesBurned);
        sb.append('}');
        return sb.toString();
    }
}
