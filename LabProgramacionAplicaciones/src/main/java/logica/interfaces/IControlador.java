/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logica.interfaces;

/**
 *
 * @author lucho
 */
public interface  IControlador {
    
    void test();
    boolean existeDepartamento(String nombre);
    void altaDepartamento(String nombre, String descripcion, String url);
}