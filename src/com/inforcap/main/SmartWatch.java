package com.inforcap.main;


import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args){
        int[]pasos;
        if (args.length > 0) {
            pasos = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                pasos[i]=Integer.parseInt(args[i]);
            }
            ArrayList<Integer>pasosfiltrados= clearSteps(pasos);
                if (pasosfiltrados.size()>0){
                    System.out.println("El promedio de pasos de de : " + promedio(pasosfiltrados));
            }
                else {
                    System.out.println("No se puede determinar el promedio. \n Valores no cumplen con parametros. ");
                }

        }
        else {
            System.out.println("No se registro actividad...");
        }
    }

    static Integer promedio(ArrayList<Integer>pasos) {
        int acumpasos = 0;
        for (Integer i : pasos) {
            acumpasos += i;
        }
        return acumpasos / pasos.size();
    }

    static ArrayList<Integer> clearSteps(int[]pasos){
        ArrayList<Integer>pasosFiltrados=new ArrayList<>();
        for (int i=0;i< pasos.length;i++){
            if (pasos[i] >=200 && pasos[i]<100000){
                pasosFiltrados.add(pasos[i]);
            }
        }
        return pasosFiltrados;

    }
}

