public class Main {
    public static void main(String[] args) {
        Cliente alvaro = new Cliente();
        alvaro.setCpf("002.003.004-11");
        alvaro.setNome("Alvaro");

        //System.out.println(alvaro);
        Conta contaA = new Conta(alvaro,02,5000);
        //System.out.println(contaA.cliente.getCpf());

        Conta contaA1 = new ContaCorrente(alvaro);

        //System.out.println(contaA1);

        Conta contaA2 = new Poupanca(alvaro);

        contaA1.depositar(1000);
        contaA1.transferir(250,contaA2);

        


    }
}
