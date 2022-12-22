/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author baran
 */
public interface DAO<T> {

    public void ekle(T entity);

    public void sil(T entity);

    public void güncelle(T entity);

    public List<T> listelle();
}
