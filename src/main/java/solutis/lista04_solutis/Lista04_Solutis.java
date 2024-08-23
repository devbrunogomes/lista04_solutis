package solutis.lista04_solutis;

public class Lista04_Solutis {

    public static void main(String[] args) {
        /**
         * Os objetos a seguir demonstrarão que a ordem de heranças e
         * implementaçao estao corretas ao ser necessario passar a quantidade de
         * patas como parametro no momento de criar um nova instancia
         */

        System.out.println("Nova Instancia de Cachorro:");
        Cachorro cachorroTeste = new Cachorro("Maylon", "Mamifero", 14, "Domestico", 4, 60, 10);
        cachorroTeste.moverse();
        cachorroTeste.comer();        
        cachorroTeste.dormir();
        cachorroTeste.status();

        System.out.println("\nNova Instancia de Gato: ");
        Gato gatoTeste = new Gato("Garfield", "Mamifero", 5, "Domestico", 4, 50, 6);
        gatoTeste.moverse();
        gatoTeste.comer();        
        gatoTeste.dormir();
        gatoTeste.status();

        System.out.println("\nNova Instancia de Elefante: ");
        Elefante elefanteTeste = new Elefante("Dumbo", "Mamifero", 15, "Selvagem", 4, 210, 600);
        elefanteTeste.moverse();
        elefanteTeste.comer();        
        elefanteTeste.dormir();
        elefanteTeste.status();

        System.out.println("\nNova Instancia de Leao");
        Leao leaoTeste = new Leao("George", "Mamifero", 5, "Selvagem", 4, 85, 100);
        leaoTeste.moverse();
        leaoTeste.comer();        
        leaoTeste.dormir();
        leaoTeste.status();

        System.out.println("\n==========================");

        /**
         * Os objetos a seguir demonstrarão que a ordem de heranças e
         * implementaçao esta correta ao evocar o metodo moverse, e a saída for
         * um meio de locomocao condizente ao tipo de animal que está sendo
         * instanciado.
         *
         * Outra forma de demonstrar a acertividade é que a qntdDeAsas e
         * envergaduraAsa são atributos exclusivos da classe AnimalVoadorAB.
         */
        System.out.println("\nNova Intancia de Peixe: ");
        Peixe peixeTeste = new Peixe("Nemo", "Marinho", 1, "Mar", 25, 1);
        peixeTeste.moverse(); //saída: Animal está nadando!

        System.out.println("\nNova Instancia de Pombo: ");
        Pombo pomboTeste = new Pombo("Leslie", "Ave", 2, "Selvagem", 2, 35, 45, 2);
        pomboTeste.moverse(); //saída: Animal está Voando!
    }
}
