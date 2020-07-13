package com.afsdi;

class Grade {
    String evalGrade(int input) {
        String stringReturn = "";

        int A = 90;
        int B = 80;
        int C = 70;
        int D = 60;

        if (input >= A) {
            stringReturn = "A";
        } else if (input >= B && input < A) {
            stringReturn = "B";
        } else if (input >= C && input < B) {
            stringReturn = "C";
        } else if (input >= D && input < C) {
            stringReturn = "D";
        } else stringReturn = "F";
        return stringReturn;
    }

    public static void main(String[] args) {
        if (args.length < 1 || Integer.parseInt(args[0]) < 0 || Integer.parseInt(args[0]) > 100) {
            System.out.println("Please provide a valid grade between 0 & 100");
        } else {
            System.out.println(new Grade().evalGrade(Integer.parseInt(args[0])));
        }
    }
}