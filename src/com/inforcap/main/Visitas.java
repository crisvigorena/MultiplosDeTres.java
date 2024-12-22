package com.inforcap.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Visitas {
    public static void main (String[] args) {
        ArrayList<Integer> visitas =new ArrayList<>();

        if (args.length > 0) {
            for (int a=0; a < args.length;a++) {
                visitas.add(Integer.parseInt(args[a]));
            }
            System.out.println("la media de visitas fue de: " + promedio(visitas));
        }
        else {
            System.out.println("No se registraron visitas");
        }
    }
    static Integer promedio (ArrayList<Integer>cantvisitas){
      int acumvisitas=0;
      for (Integer i : cantvisitas) {
          acumvisitas += i;
      }
          return acumvisitas / cantvisitas.size();

      }
    }

