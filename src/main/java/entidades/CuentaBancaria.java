package entidades;

public class CuentaBancaria {

    private int id;
    private long saldo;
    private String nmrocuenta;
    private Persona persona;

    public CuentaBancaria(int id, long saldo, String nmrocuenta, Persona persona) {
        this.id = id;
        this.saldo = saldo;
        this.nmrocuenta = nmrocuenta;
        this.persona = persona;
    }

    public void ingresarDinero(long dinero) {
        if (dinero > 0) {
            saldo += dinero;
        }
    }

    public boolean retirarDinero(long dinero) {
        if (dinero > saldo) {
            return false; // No se puede retirar más de lo disponible
        } else {
            saldo -= dinero;
            return true; // Retiro exitoso
        }
    }

    public long getSaldo() {
        return saldo;
    }

    public String getNmrocuenta() {
        return nmrocuenta;
    }
}
