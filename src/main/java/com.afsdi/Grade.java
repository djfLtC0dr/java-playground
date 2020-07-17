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
}