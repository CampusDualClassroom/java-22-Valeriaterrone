package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> customList = new ArrayList<>();

        // se añade los elementos dados a la lista
        customList.add("GKFFD");
        customList.add("TNANA");
        customList.add("MPMSL");
        customList.add("PSWME");
        customList.add("LZMLF");
        customList.add("JYEBV");
        customList.add("YELNT");
        customList.add("JSNKR");
        customList.add("JFESF");
        customList.add("TMJLL");
        return customList; // luego la devolvemos ya poblada
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {   // recorremos la lista
            // Imprimimos el índice y el valor del elemento en esa posición de la lista
            System.out.println("Índice: " + i + " - Valor: " + customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        // Añadimos el elemento y devolvemos el valor booleano de la operación (true si se añade correctamente)
        return customList.add(element);
    }

    public static void main(String[] args) {
        // Crear la lista y poblarla
        List<String> customList = createArrayList();

        // Añadir un nuevo elemento "AAAAA"
        addElementToList(customList, "AAAAA");

        // Imprimir los elementos y sus índices
        printElementsAndIndex(customList);
    }


}
