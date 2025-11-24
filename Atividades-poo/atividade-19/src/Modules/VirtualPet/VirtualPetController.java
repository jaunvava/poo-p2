package Modules.VirtualPet;

import Enums.EspecieEnum;
import Modules.VirtualPet.Errors.VirtualPetErros;
import Modules.VirtualPet.Exceptions.VirtualPetException;

public class VirtualPetController {
    private VirtualPetModel pet;

    public VirtualPetController() {
        this.pet = null;
    }

    public boolean existePet() {
        return pet != null && pet.getNome() != null && pet.getEspecie() != null;
    }

    public void adotar(String nome, EspecieEnum especie) throws VirtualPetException {
        if (existePet()) {
            throw new VirtualPetException(VirtualPetErros.jaPossuiPet);
        }
        this.pet = new VirtualPetModel(nome, especie);
    }

    public boolean statusFome() {
        if (pet == null) {
            return false;
        }
        return pet.isFome();
    }

    public void alimentarPet() throws VirtualPetException {
        if (!statusFome()) {
            throw new VirtualPetException(VirtualPetErros.jaComeu);
        }
        pet.alimentar();
    }

    public boolean statusLimpeza() {
        if (pet == null) {
            return true;
        }
        return pet.isSujo();
    }

    public void limparPet() throws VirtualPetException {
        if (!statusLimpeza()) {
            throw new VirtualPetException(VirtualPetErros.jaEstaLimpo);
        }
        pet.limpar();
    }

    public void brincarComPet() {
        if (pet != null && !pet.isFome()) {
            pet.brincar();
            System.out.println("Você brincou com " + pet.getNome() + "! Ele está feliz, limpo e alimentado!");
        } else {
            System.out.println("Seu pet está com fome e sem energia para brincar. Alimente-o primeiro!");
        }
    }

    public VirtualPetModel getPet() {
        return pet;
    }
}
