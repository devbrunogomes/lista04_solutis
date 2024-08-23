package solutis.lista04_solutis;

/**
 *
 * @author bsgom
 */
public abstract class AnimalVoadorAB extends AnimalAB {

    public int qntdAsas;
    public int envergaduraAsa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int qntdAsas, int envergaduraAsa, int altura, int peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.qntdAsas = qntdAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    @Override
    public void moverse() {
        System.out.println("Animal Voador esta Voando!");
    }

    @Override
    public void comer() {
        super.comer();
    }

}
