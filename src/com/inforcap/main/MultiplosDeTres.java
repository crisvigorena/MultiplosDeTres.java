package com.inforcap.main;

import java.util.ArrayList;

public class MultiplosDeTres {
    public static void main(String[] args) {
        ArrayList<Integer>numeros = new ArrayList<>();
        if (args.length >0){
            for (int i =0;i< args.length;i++){
                numeros.add(Integer.parseInt(args[i]));
            }
            System.out.println("La suma de sus numeros es: " + suma(numeros));
            System.out.println("El promedio de sus numeros es: " + promedio(numeros));

        }
        else {
            System.out.println("No se pudo calcular la suma ya que los valores no cumplen con los parametros. \nIntente nuevamente! ");
        }

    }
    static Integer suma (ArrayList<Integer>numeros){
        int acumnumeros =0;
        for (Integer i:numeros){
        if ( i % 3 ==0){
            acumnumeros +=i;
            }
        }
        return acumnumeros;

    }
    static Integer promedio (ArrayList<Integer>numeros){
        int contador = 0;
        int sumanumeros = 0;
        for (Integer i:numeros){
            if (i %3 ==0 ){
                sumanumeros+=i;
                contador ++;
            }
        }
        return sumanumeros/contador;
    }
}
