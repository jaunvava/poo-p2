package Model;

import enums.StatusMatricula;

public class Aluno extends Pessoa {
    private StatusMatricula estadoMatriculado;

    public Aluno(){}

    public void setEstadoMatriculado(StatusMatricula estadoMatriculado) {
        this.estadoMatriculado = estadoMatriculado;
    }

    public String getStatusMatriculado() {

        return this.getMatricula();
    }

}
