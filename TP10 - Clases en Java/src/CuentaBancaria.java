public class CuentaBancaria {
    int saldo;
    int num_cuenta;

    public int retirar(int retiro) {
        if (saldo >= retiro) {
            saldo = saldo - retiro;
            return saldo;
        } else {
            System.out.println("Fondos insuficientes");
            return 0;
        }
    }

    public int depositar(int deposito) {
        saldo = saldo + deposito;
        return saldo;
    }
}
