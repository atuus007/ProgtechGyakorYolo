/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamek;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author Ati
 */
public class Streamek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Persons> persons = Arrays.asList(
                new Persons("Péter", "Tóth", 23, 70, false),
                new Persons("Szilvia", "Tóth", 33, 55, true),
                new Persons("Sándor", "Tóth", 43, 110, true),
                new Persons("Ferenc", "Tóth", 23, 70, false),
                new Persons("Mónika", "Kovács", 24, 45, false),
                new Persons("Béni", "Egressi", 23, 97, true),
                new Persons("Ferenc", "Németh", 30, 88, false),
                new Persons("Csaba", "Tóth", 56, 60, false),
                new Persons("Angéla", "Tóth", 78, 56, true),
                new Persons("Barbi", "Tóth", 16, 56, false),
                new Persons("Keleti", "Ilyés", 12, 30, false),
                new Persons("Tamás", "Tóth", 23, 70, false)
        );

        List<Persons> eredmeny;
        eredmeny = persons
                .stream()
                .filter(p -> p.getEletkor() > 30)
                .filter(p -> p.isHazas())
                .collect(Collectors.toList());
        System.out.println(eredmeny.toString());
        
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = collection
                .stream()
                .map(String::toUpperCase)
                .collect(toList());
        System.out.println(expected);
        System.out.println("=======================================\n");
        collection.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("=======================================\n");
        expected.stream()
                .forEach(System.out::println);
        System.out.println("=======================================\n");
        persons.stream()
                .filter(s->s.getEletkor()>70)
                .filter(s->s.isHazas())
                .map(s->s.getTestSuly()*1.2)
                .forEach(System.out::println);
        System.out.println("=======================================\n");
        persons.stream()
               .max(Comparator.comparing(s->s.getTestSuly()))
               .ifPresent(System.out::println);
         System.out.println("=======================================\n");
        persons.stream()
                .filter(p->p.getEletkor()<18)
                .map(s->{
                    return s.getV_nev()+" "+s.getK_nev()+" "+s.getEletkor();
                })
                .sorted()
                .forEach(System.out::println);
        System.out.println("=======================================\n");
    Collections.sort(collection, 
            (String s1, String s2)->{
                return (s1.length()-s2.length());
            });
    System.out.println("=======================================\n");
    persons.stream()
            .filter(p->p.getV_nev().startsWith("T"))
            .map(s->{return s.getEletkor()+" "+s.getTestSuly();})
            .forEach(System.out::println);
    System.out.println("=======================================\n");   
    Integer ossz= persons
            .stream()
            .reduce(0, (eletkor, p)->eletkor+=p.getEletkor(), 
                    (s1,s2)->s1+s2);
    System.out.println(ossz);
    } 
}
