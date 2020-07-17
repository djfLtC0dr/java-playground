package com.afsdi;

public class App {

    public static void main(String[] args) {
        if (args.length < 1) {
            BankAccount ba = new BankAccount(100);
            System.out.println(ba.getBalance());
        } else if (args.length == 1){
            System.out.println(new Grade().evalGrade(Integer.parseInt(args[0])));
        } else {
            if (args != null) {
                int[] argInts = new int[args.length];

                for (int i = 0; i < args.length; i++) {
                    argInts[i] = Integer.parseInt(args[i]);
                }
                System.out.println(new SumOfPositivesCLI().sumPosNbrArgs(argInts));
            } else {
                System.out.println(0);
            }
        }
    }
}