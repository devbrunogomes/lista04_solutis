/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.lista04_solutis;

/**
 *
 * @author bsgom
 */
public class Elefante extends AnimalTerrestreAB {

    //atributos
    private int comidaIngerida;
    private int caminhoPercorrido;
    private int horasDormidas;

    //Construtor
    public Elefante(String nome, String tipoAnimal, int idade, String habitat, int qntdDePatas, int altura, int peso) {
        super(nome, tipoAnimal, idade, habitat, qntdDePatas, altura, peso);
    }

    //Getters
    public void getComidaIngerida() {
        System.out.println("Porcoes de comidas Ingeridas: " + this.comidaIngerida);
    }

    public void getCaminhoPercorrido() {
        System.out.println(this.nome + " ja deu um total de " + this.caminhoPercorrido + " passos!");
    }

    public void getHorasDormidas() {
        System.out.println(this.nome + " dormiu um total de: " + this.horasDormidas + " horas!");
    }

    //Metodos
    public void status() {
        getCaminhoPercorrido();
        getComidaIngerida();
        getHorasDormidas();
    }
    
    @Override
    public void comer() {
        System.out.println(this.nome + " comeu uma porcao de comida");
        this.comidaIngerida++;

    }

    @Override
    public void moverse() {
        System.out.println(this.nome + " andou um passo!");
        this.caminhoPercorrido++;
    }

    @Override
    public void dormir() {
        System.out.println(this.nome + " esta dormindo!");
        this.horasDormidas++;

    }
}
