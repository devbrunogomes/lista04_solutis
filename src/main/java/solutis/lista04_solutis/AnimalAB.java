/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.lista04_solutis;

/**
 *
 * @author bsgom
 */
public abstract class AnimalAB implements AnimalIF {
    public String nome;
    public String tipoAnimal;
    public int idade;
    public String habitat;
    public int altura;
    public int peso;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int altura, int peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }
    
    

    @Override
    public void comer() {
        System.out.println("Animal esta comendo");
    }

    @Override
    public void moverse() {
        System.out.println("Animal esta se movimentando");
    }

    @Override
    public void dormir() {
        System.out.println("Animal esta dormindo");
    }

}
