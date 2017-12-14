package banco;

public class Empresa {
    private Funcionario[] empregados;
    private String CNPJ;
    private int cont;

    public Empresa() {
        this.cont = 0;
        empregados = new Funcionario[10];
    }

    public void adiciona(Funcionario pessoa) {
        if (cont == empregados.length) {
            System.out.println("Array esta cheio");
        } else {
            empregados[cont] = pessoa;
            cont++;
        }
    }

    public void mostraEmpregados() {
        for (int i = 0; i < cont; i++) {
            System.out.println("\nFuncionario N." + (i+1) + "\n");
            empregados[i].mostra();
        }
    }

    public boolean contem(Funcionario pessoa) {
        for (int i = 0; i < cont; i++) {
            if (pessoa == empregados[i]) {
                return true;
            }
        }
        return false;
    }
}