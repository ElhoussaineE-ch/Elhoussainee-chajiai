package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatStream {
    /** La creation de stream  */

    /**
    // Créer un stream à partir du tableau
    Integer[] myArray = {1, 2, 3, 4, 5};
    Stream<Integer> myStream = Stream.of(myArray);

    // Créer un sous-stream à partir d'une liste
    List<String> myList = Arrays.asList("a", "b", "c", "d", "e");
    Stream<String> subStream = myList.subList(1, 4).stream();

    //Créer un stream à partir d'un fournisseur de données
    Stream<Double> randomStream = Stream.generate(Math::random);

    // Créer un stream infini en utilisant un prédicat Seed c'est la veleur de depar
    Stream<Integer> myStream = Stream.iterate(1, n -> n <= 10, n -> n + 1); // Crée une séquence d'entiers de 1 à 10
        myStream.limit(10).forEach(System.out::println);

    // Créer un stream de caractères à partir d'une chaîne
    String myString = "Hello, World!";
    IntStream charStream = myString.chars();

    // Créer un stream à partir des lignes d'un fichier
    Stream<String> linesStream = Files.lines(Paths.get("mon_fichier.txt"));

    // Créer un stream pour une séquence numérique
    Stream<Integer> myStream = Stream.iterate(1, n -> n + 2); // Crée une séquence d'entiers impairs : 1, 3, 5, 7, ...

    // Créer un stream à partir d'un générateur
    Stream<Integer> myStream = Stream.generate(() -> new Random().nextInt(100));

    // Créer un stream à partir de valeurs individuelles
    Stream<Integer> myStream = Stream.of(1, 2, 3, 4, 5);


     ppppppp


    // Supprimer les doublons des âges
    List<Integer> uniqueAges = ages.stream().distinct().collect(Collectors.toList());
        System.out.println("Âges uniques : " + uniqueAges);

    // Limiter le nombre de personnes à afficher à 3
        personStream.limit(3)
                .forEach(person -> System.out.println("Personne : " + person));

    // Sauter les 2 premiers âges et afficher les suivants
    List<Integer> skippedAges = ages.stream().skip(2).collect(Collectors.toList());
        System.out.println("Âges après avoir sauté les 2 premiers : " + skippedAges);


    // Vérifier si au moins une personne est de genre FEMME
    boolean anyFemale = personStream.anyMatch(person -> person.getGenre() == Genre.FEMME);

    // Vérifier si toutes les personnes sont de genre HOMME
    boolean allMale = personStream.allMatch(person -> person.getGenre() == Genre.HOMME);

    // Vérifier si aucune personne n'est de genre INCONNU
    boolean noneUnknown = personStream.noneMatch(person -> person.getGenre() == Genre.INCONNU);


     **/

}
