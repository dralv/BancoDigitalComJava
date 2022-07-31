public class Poupanca extends Conta{
    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    public void contaInfos(){
        super.mostrarInformacoes();
    }
}
