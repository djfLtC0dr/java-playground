package com.afsdi;

public class SumOfPositivesCLI {
/*
For this checkpoint you must build a command-line application that:

Takes numbers as arguments.
Prints out the sum of the positive numbers.
For example:

java -jar build/libs/SumOfPositivesCLI.jar -5 6 8 -3 0
# => prints 14

java -jar build/libs/SumOfPositivesCLI.jar 5 7 8 -7 -2
# => prints 20

java -jar build/libs/SumOfPositivesCLI.jar
# => prints 0

java -jar build/libs/SumOfPositivesCLI.jar -1 0 0
# => prints 0

 */
    int sumPosNbrs = 0;

    int sumPosNbrArgs(int[] Nbrs) {

        if (Nbrs.length == 0) {
            return sumPosNbrs;
        }

        for (int i = 0; i < Nbrs.length; i++) {
            if (Nbrs[i] > 0) {
                sumPosNbrs += Nbrs[i];
            }
        }

        return sumPosNbrs;
    }
}