package Model;

public class Funcionario extends Pessoa {
    private int salario;
    private int valorHoraAura;
    private int cargaHoraria;
    private int DIAS_TRABALHADOS_SEMANA = 5;

    public Funcionario(){}


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int valor) {
        this.cargaHoraria = valor;
    }

    public int getValorHoraAula() {
        return valorHoraAura;
    }

    public void setValorHoraAura(int valorHora) {
        this.valorHoraAura = valorHora;
    }

    public double salario(){
        int sal = ((this.getValorHoraAula() * this.getCargaHoraria()) * DIAS_TRABALHADOS_SEMANA) * 4;
        return salario;
    }
}
