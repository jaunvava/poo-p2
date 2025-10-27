public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico("Zoo Cidade", "Cidade X", 1000, "08:00-18:00", "Dr. Silva", 3);

        AmbienteAereo aereo = new AmbienteAereo("Aviário", 5, "Setor A", "Quente", "08:00-18:00");
        AmbienteTerrestre terrestre = new AmbienteTerrestre("Savana", 5, "Setor B", "Seco", "08:00-18:00");
        AmbienteAquatico aquatico = new AmbienteAquatico("Aquário", 5, "Setor C", "Úmido", "08:00-18:00");

        Papagaio papagaio = new Papagaio("Loro", 2, 1.2, "Verde");
        Aguia aguia = new Aguia("Águia Real", 5, 3.5, "Marrom");
        Cachorro cachorro = new Cachorro("Rex", 4, 20.0, "Preto");
        Elefante elefante = new Elefante("Dumbo", 10, 500.0, "Cinza");
        Peixe peixe = new Peixe("Nemo", 1, 0.3, "Laranja");
        Golfinho golfinho = new Golfinho("Flipper", 8, 150.0, "Cinza");

        aereo.adicionarAnimal(papagaio);
        aereo.adicionarAnimal(aguia);
        terrestre.adicionarAnimal(cachorro);
        terrestre.adicionarAnimal(elefante);
        aquatico.adicionarAnimal(peixe);
        aquatico.adicionarAnimal(golfinho);

        zoo.adicionarAmbiente(aereo);
        zoo.adicionarAmbiente(terrestre);
        zoo.adicionarAmbiente(aquatico);

        // Demonstração dos métodos
        for (Ambiente ambiente : zoo.getAmbientes()) {
            System.out.println("Ambiente: " + ambiente.getNome() + " (" + ambiente.getTipo() + ")");
            if (ambiente instanceof AmbienteAereo) {
                for (Animal animal : ((AmbienteAereo) ambiente).getAnimais()) {
                    animal.mover();
                    animal.emitirSom();
                    animal.alimentar();
                }
            } else if (ambiente instanceof AmbienteTerrestre) {
                for (Animal animal : ((AmbienteTerrestre) ambiente).getAnimais()) {
                    animal.mover();
                    animal.emitirSom();
                    animal.alimentar();
                }
            } else if (ambiente instanceof AmbienteAquatico) {
                for (Animal animal : ((AmbienteAquatico) ambiente).getAnimais()) {
                    animal.mover();
                    animal.emitirSom();
                    animal.alimentar();
                }
            }
        }
    }
}
