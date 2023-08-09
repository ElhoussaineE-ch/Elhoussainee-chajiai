package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.nio.file.Files;
import java.nio.file.Paths;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        B1 b1= new B1();
        A a = new A();
        a.setB(b1);
        a.cla();













        System.out.println("StreamAPI");
        /** La creation de stream  */
        Stream<Person> personStream = Stream.of(new Person("Ali","oki",12,Genre.HOMME),
                                                new Person("moha","ait ali",44,Genre.HOMME),
                                                new Person("hanan","oklo",24,Genre.FEMME),
                                                new Person("raja","iniy",44,Genre.FEMME),
                                                new Person("raja","lolik",54,Genre.FEMME),
                                                new Person("safa","iniy",23,Genre.FEMME),
                                                new Person("omar","SAD",16,Genre.FEMME),
                                                new Person("youssef","qas",14,Genre.FEMME),
                                                new Person("lho","saoki",14,Genre.HOMME));
        /**  mapToInt  sum */
        //int sommeAges = personStream.mapToInt(Person::getAge).sum();

        /**  count */
       // long nombreHommes = personStream.filter(person -> person.getGenre() == Genre.HOMME).count();


        /**  Map */
        List<Integer> ages =personStream.map(Person::getAge).collect(Collectors.toList());

        /**  Reduce */
        // Utiliser reduce pour obtenir l'âge maximal
        //Optional<Integer> maxAge = ages.stream().reduce(Integer::max);

        /**  Max */
        // Person qui es agé
        //Optional<Person> p = personStream.max((p1,p2)->Integer.compare(p1.getAge(),p2.getAge()));
       // Optional<Integer> o = ages.stream().max((o1, o2) ->{ return Integer.compare(o1,o2);});
        //System.out.println(o);

        /**  Sorted */
        // personStream.sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);
        // Stream<Person> personnesTrieParAge = personStream.sorted(Comparator.comparingInt(Person::getAge));


        /**  Filter */
        // Filtrer les personnes de genre HOMME ||  genre HOMME and AGE > 20
        // personStream.filter(person -> person.getGenre() == Genre.HOMME).forEach(person -> System.out.println("Personne : " + person));
        // personStream.filter(person -> (person.getGenre() == Genre.FEMME && person.getAge()>20)).forEach(person -> System.out.println("Personne : " + person));

        /**  distinct */
        // Supprimer les doublons des âges
        //List<Integer> uniqueAges = ages.stream().map(ag-> ag+12).distinct().collect(Collectors.toList());
        //System.out.println(uniqueAges);

        /**  limit */
        // Limiter le nombre de personnes à afficher à 3
        //personStream.limit(10).forEach(person -> System.out.println("Personne : " + person));

        /**  skip  sauté */
        // Sauter les 2 premiers âges et afficher les suivants
        //List<Integer> skippedAges = ages.stream().skip(2).collect(Collectors.toList());
        //System.out.println("Âges après avoir sauté les 2 premiers : " + skippedAges);

        /**  filter  findFirst */
        //Trouver la personne avec le prénom "raja" (premier match) :
       // Optional<Person> personneAvecPrenomRaja = personStream.filter(person -> person.getName().equals("raja")).findFirst();
        //System.out.println(personneAvecPrenomRaja);

        /**  concat  deux stream */
        //Stream<Person> autrePersonStream = Stream.of(new Person("MOha","oki",12,Genre.HOMME),
        //                                          new Person("Hamo","ait ali",44,Genre.HOMME),
        //                                          new Person("Hmad","oklo",24,Genre.FEMME));
        //Stream<Person> personnesConcatenees = Stream.concat(personStream, autrePersonStream);
        //personnesConcatenees.forEach(System.out::println);

        /**  ERREUR ------------------------------------------------------------>*/
        //La lsite des nomes complet
      //  Stream<String> nameCpmlet = personStream.map(p -> p.getName() + " " + p.getPrenom());   // 1
        //List<String> s = nameCpmlet.collect(Collectors.toList());  // 2
       // System.out.println(s);


        /**  GroupBy Mais avec Map*/
        //put(K key, V value): Ajoute une paire clé-valeur à la map.
        //get(Object key): Récupère la valeur associée à une clé donnée.
        //containsKey(Object key): Vérifie si la clé spécifiée est présente dans la map.
        //containsValue(Object value): Vérifie si la valeur spécifiée est présente dans la map.
        //remove(Object key): Supprime la paire clé-valeur associée à la clé donnée.
        //size(): Renvoie le nombre de paires clé-valeur dans la map.
        //isEmpty(): Vérifie si la map est vide.
        //keySet(): Renvoie un ensemble de toutes les clés dans la map.
        //values(): Renvoie une collection de toutes les valeurs dans la map.
        //entrySet(): Renvoie un ensemble de toutes les paires clé-valeur (Map.Entry) dans la map.

       // Map<Genre, List<Person>> personnesParGenre = personStream.collect(Collectors.groupingBy(Person::getGenre));
        //System.out.println(personnesParGenre.get(Genre.HOMME));


        /**  anyMatch, allMatch, noneMatch */
        // Verifier c'est un condition appliquer AU MOIN à un element de la liste comme filtre
        // Vérifier si au moins une personne est de genre FEMME
       // boolean anyFemale = personStream.anyMatch(person -> person.getGenre() == Genre.FEMME);

        // Verifier c'est un condition appliquer AU TOUS elements de la liste comme filtre
        // Vérifier si toutes les personnes sont de genre HOMME
        //boolean allMale = personStream.allMatch(person -> person.getGenre() == Genre.HOMME);
        //System.out.println("allMale "+allMale);

        // Vérifier si aucune personne n'est de genre INCONNU
        //boolean noneUnknown = personStream.noneMatch(person -> person.getGenre() == Genre.FEMME);
        //System.out.println("no "+noneUnknown);

        // Vérifier si aucune personne n'a plus de 45 ans.
        //boolean b = personStream.map(Person::getAge).noneMatch(p->p>45); // 1 methode
        //boolean c = personStream.noneMatch(p->p.getAge()>45); // 2 methode
        //System.out.println("c "+c);
    }

}