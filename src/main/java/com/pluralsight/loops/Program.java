package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Workout> workouts = new ArrayList<>();

        workouts.add(new Workout("Running", "Monday", 450));
        workouts.add(new Workout("Yoga", "Monday", 180));
        workouts.add(new Workout("Weightlifting", "Tuesday", 320));
        workouts.add(new Workout("Cycling", "Wednesday", 500));
        workouts.add(new Workout("Running", "Thursday", 400));
        workouts.add(new Workout("Weightlifting", "Thursday", 300));
        workouts.add(new Workout("Swimming", "Friday", 600));
        workouts.add(new Workout("Yoga", "Saturday", 200));
        workouts.add(new Workout("Cycling", "Sunday", 750));
        workouts.add(new Workout("Running", "Sunday", 350));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter workout name: ");
        String workoutName = scan.nextLine();

        List<Workout> matchingWorkouts = getMatchingWorkouts(workouts, workoutName);
    }

    private static List<Workout> getMatchingWorkouts(List<Workout> workouts, String workoutName) {
        List<Workout> matchingWorkouts = new ArrayList<>();
        for(Workout workout : workouts){
            if(workout.getExerciseType().equalsIgnoreCase(workoutName)){
            matchingWorkouts.add(workout);
            }
        }
        return matchingWorkouts;
    }
}
