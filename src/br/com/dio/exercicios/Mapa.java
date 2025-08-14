/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.exercicios;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Genilson Junior
 */
public class Mapa {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("joao@joao.com", new User("Joao", 21));
        users.put("junin@junin.com", new User("junin", 23));
        users.put("ana@ana.com", new User("ana", 32));
        users.put("leo@leo.com", new User("leo", 32));

//        System.out.println(users.containsKey("leo@leo.com"));
//        System.out.println(users.containsValue(new User("leo", 32)));
        
//        System.out.println(users.remove("leo@leo.com", new User("leo", 32)));
//        users.replace("leo", new User("leo", 33));
//        System.out.println("usando getOrDefault: " + users.getOrDefault("leo@leo.com", new User(" ", -1))); 
//        System.out.println("usando somente get: " + users.get("leo@leo.com"));
        users.merge("", new User("", -1), (user, user2) -> {
            System.out.println(user);
            System.out.println(user2);
            return user;
        });
        System.out.println("");
    }
}
