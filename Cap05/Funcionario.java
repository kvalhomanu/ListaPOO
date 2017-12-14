package banco;

public class Funcionario {
    String nome;
    String setor;
    double salario;
    String data;
    String RG;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
    public void recebeAumento(double aumento){
        this.salario = salario + aumento;
    }

    public double calculaGanhoAnual(){
        return this.salario*12;
    }
    
    public void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("setor: " + this.setor);
        System.out.println("salario: " + this.salario);
        System.out.println("data: " + this.data);
        System.out.println("RG: " + this.RG);
        this.calculaGanhoAnual();
    }
}