public class Conta implements IConta {

        private static final int AGENCIA = 007;

        protected int numero;
        protected int saldo;
        protected Cliente cliente;

    public Conta(Cliente cliente, Integer numero,Integer saldo) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;

    }

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    
     void mostrarInformacoes(){
        System.out.println("Titular: " +   this.cliente.getNome());
        System.out.println("Agência: " +   this.AGENCIA);
        System.out.println("Número: " +   this.numero);
        System.out.println("Saldo: " +   this.saldo);
    }
}

        

