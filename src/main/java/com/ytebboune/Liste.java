package com.ytebboune;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Liste qui implémente une fonction de partition
 * Crée à l'occasion d'un exercice maison
 * @author ytebboune
 */

public class Liste {

    /**
     * Fonction permettant de partitionner une liste d'entiers (liste) en une liste de liste fragmentés selon la taille donnée en paramètre.
     * Exemple : partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
     * @param liste
     * @param taille
     * @return une liste de liste d'entiers
     * @throws Exception
     */

    public static List<List<Integer>> partition(List<Integer> liste, Integer taille) throws Exception {

        if (liste == null || liste.isEmpty()) {
            throw new Exception("La liste ne contient rien.");
        } else if (taille <= 0) {
            throw new Exception("La taille est invalide.");
        }

        List<List<Integer>> finalList = new ArrayList<>();

        for (int i = 0; i < liste.size(); i += taille) {
            int end = Math.min(liste.size(), i + taille);
            finalList.add(liste.subList(i, end));
        }

        return finalList;
    }

}