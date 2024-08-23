/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.lista04_solutis;

/**
 *
 * @author bsgom
 */
public abstract class AnimalMarinhoAB extends AnimalAB {

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, int altura, int peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    @Override
    public void moverse() {
        System.out.println("Animal Marinho esta Nadando!");
    }

    @Override
    public void comer() {
        super.comer();
    }

    

    
    
}
