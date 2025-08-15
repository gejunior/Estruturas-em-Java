/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.dao;

import br.com.dio.domain.GenericDomain;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 * @author Genilson Junior
 * @param <T>
 */
public abstract class GenericDAO<ID, T extends GenericDomain<ID>>  {
    private final List<T> db = new ArrayList<>();
    
    public T save(T domain){
        db.add(domain);
        return domain;
    }
    
//    public T update(T domain){
//        var stored = db.stream().filter(d -> d.equals(domain))
//                //passar uma exceção pra quando n tiver cadastrado
//                .findFirst().orElseThrow();
//        
//        db.remove(stored);
//        return save(domain);
//    }
    
    public boolean delete(T domain){
        return db.remove(domain);
    }
    
    public Optional<T> find(Predicate<T> filterCallback){
        return db.stream().filter(filterCallback).findFirst();
    }

    public List<T> findAll() {
        return db;
    }
    
    public int count(){
        return db.size();
    }
}
