package exercicio4;

public class Teste {
    public static void main(String[] args) {
        
    

    Animal animal = new Animal ();
    animal.setAlimenta("Todo animal se alimenta");
    animal.setLocomove("Todo animal se locomove");

    Cachorro cachorro = new Cachorro();
    cachorro.setAlimenta("Cachorro como ração de cachorro");
    cachorro.setLocomove("Cachorro usa 4 patas");
    cachorro.setLatido(" Cachorro faz au au");

    Animal poodle = new Cachorro();
    poodle.setAlimenta("Come ração de cachorro");
    poodle.setLocomove("Usa 4 patas");
    
}
}
