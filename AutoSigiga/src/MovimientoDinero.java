public class MovimientoDinero {
    private float monto;
    private float montos;
    private String concepto;
    private String usuario;

    public MovimientoDinero(float monto, float montos, String concepto, String usuario) {
        this.monto = monto;
        this.montos = montos;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getMontos() {
        return montos;
    }

    public void setMontos(float montos) {
        this.montos = montos;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
