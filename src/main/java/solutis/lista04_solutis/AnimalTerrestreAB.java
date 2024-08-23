/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.lista04_solutis;

/**
 *
 * @author bsgom
 */
public class AnimalTerrestreAB extends AnimalAB {
    public int qntdDePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, int qntdDePatas , int altura, int peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.qntdDePatas = qntdDePatas;
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    @Override
    public void moverse() {
        System.out.println("Animal esta Andando!");
    }

    @Override
    public void comer() {
        super.comer();
    }
    
}
