/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.domain;

import java.util.Objects;

/**
 *
 * @author Genilson Junior
 */
public abstract class GenericDomain<T> {
    private T id;

    public GenericDomain(T id) {
        this.id = id;
    }

    public GenericDomain() {}

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GenericDomain<?> other = (GenericDomain<?>) obj;
        return Objects.equals(this.id, other.id);
    }
}
