package com.pluralsight.loops;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Workout> workouts = getWorkouts();
        printWorkouts(workouts);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter workout name: ");
        String workoutName = scan.nextLine();

        List<Workout> matchingWorkouts = getMatchingWorkouts(workouts, workoutName);
        System.out.println("The average calories burned is: " + calculateAverageCaloriesBurned(matchingWorkouts));
        System.out.println("The highest number of calories is: " + highestCalories(matchingWorkouts));
        System.out.println("The lowest number of calories is: " + lowestCalories(matchingWorkouts));

    }

    private static int highestCalories(List<Workout> workouts) {
//        int themostCalories = 0;
//
//        for (Workout workout : workouts) {
//            if (workout.getCaloriesBurned() > themostCalories) {
//                themostCalories = workout.getCaloriesBurned();
//            }
//        }
        return workouts.stream()
                .map(Workout::getCaloriesBurned)
                .max(Integer::compare)
                .orElse(0);

//        return workouts.stream()
//                .max(Comparator.comparing(Workout::getCaloriesBurned))
//                .map(Workout::getCaloriesBurned)
//                .orElse(0);

    }

    private static int lowestCalories(List<Workout> workouts){
        return workouts.stream()
                .map(Workout::getCaloriesBurned)
                .min(Integer::compare)
                .orElse(0);
    }

    private static void printWorkouts(List<Workout> workouts){
        for(Workout workout : workouts){
            System.out.println(workout);
        }
    }

    private static double calculateAverageCaloriesBurned(List<Workout> workouts) {
//        int totalBurnedCalories = 0;
//        for(Workout workout : workouts){
//            totalBurnedCalories += workout.getCaloriesBurned();
//        }
        return workouts.stream()
                .mapToDouble(Workout::getCaloriesBurned)
                .sum();
    }

    private static List<Workout> getMatchingWorkouts(List<Workout> workouts, String workoutName) {
        List<Workout> matchingWorkouts = new ArrayList<>();
//        for(Workout workout : workouts){
//            if(workout.getExerciseType().equalsIgnoreCase(workoutName)){
//                matchingWorkouts.add(workout);
//            }
//        }
        return workouts.stream()
                .filter(w -> w.getExerciseType().equalsIgnoreCase(workoutName))
                .toList();
    }

    private static List<Workout> getWorkouts() {
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
        return workouts;
    }
}
