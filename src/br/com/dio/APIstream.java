/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio;

import br.com.dio.classes.Contact;
import static br.com.dio.classes.ContactType.EMAIL;
import static br.com.dio.classes.ContactType.PHONE;
import static br.com.dio.classes.Sex.female;
import static br.com.dio.classes.Sex.male;
import br.com.dio.classes.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Genilson Junior
 */
public class APIstream {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(generateUsers());
        
        var values = users.stream() 
                .filter(u -> u.contacts() != null && u.contacts().isEmpty())
                .toList();
        
        values.forEach(System.out::println);
//        users.sort(Comparator.comparing(User::name, Comparator.reverseOrder()));
        
//        users.forEach(System.out::println);
    }
    
    private static List<User> generateUsers(){
        var contact1 = List.of(
                new Contact("(18)23123-3213", PHONE),
                new Contact("junin@gmail.com", EMAIL)
        );
        var contact2 = List.of(
                new Contact("maria@gmail.com", EMAIL)
        );
        var contact3 = List.of(
                new Contact("(19)12312-3234", PHONE),
                new Contact("@gmail.com", EMAIL)
        );
        var contact4 = List.of(
                new Contact("andreia@gmail.com", EMAIL),
                new Contact("andreia@outlook.com", EMAIL)
        );
        var contact5 = List.of(
                new Contact("(14)23423-7686", PHONE)
        );
        
        var user1 = new User("Junin", 23, male, new ArrayList<>(contact1));
        var user2 = new User("Maria", 39, female, new ArrayList<>(contact2));
        var user3 = new User("Renato", 49, male, new ArrayList<>(contact3));
        var user4 = new User("andreia", 48, female, new ArrayList<>(contact4));
        var user5 = new User("vitor", 20, male, new ArrayList<>(contact5));
        var user6 = new User("frufru", 21, female, new ArrayList<>());
        return List.of(user1, user2, user3, user4, user5, user6);
    }
}
