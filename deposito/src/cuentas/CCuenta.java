package cuentas;
public class CCuenta {

/**Representación de una cuenta corriente
 * @author Victor Manuel
 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Obtiene el nombre
     * @return el nombre del titular
     */
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el numero de cuenta
	 * @return el numero de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Obtiene el saldo actual de la cuenta
 * @return saldo actual de la cuenta
 */
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtiene el interes de la cuenta
	 * @return el tipo de interes de la cuenta
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Devuelve el estado de la cuenta
	 * @return saldo de la cuenta
	 */
	public double estado()
    {
        return saldo;
    }

	
	/**
	 * Ingresa una cantidad en la cuenta
	 * @param cantidad cantidad a ingresar
	 * @throws Exception cantidad es negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad
     * @param cantidad cantidad a retirar
     * @throws Exception si cantidad es insuficiente o negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
