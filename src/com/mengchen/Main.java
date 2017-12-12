package com.mengchen;

public class Main {

    public static void main(String[] args) {
        calculateScore("Mengchen", 500);
        calculateScore(100);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println(playerName + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player" + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player" + " does not have a score ");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            return (feet * 12 + inches) * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        } else {
            double feet = inches / 12;
            inches %= 12;
            calcFeetAndInchesToCentimeters(feet, inches);
        }
    }



}
