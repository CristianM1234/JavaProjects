package inhiretance;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegsitro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(Date fechaRegsitri, boolean vip, String nombre, 
            char genero, int edad, String direccion) {
        
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegsitro = fechaRegsitri;
        this.vip = vip;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    public Date getFechaRegsitri() {
        return fechaRegsitro;
    }
    public void setFechaRegsitri(Date fechaRegsitri) {
        this.fechaRegsitro = fechaRegsitri;
    }
    public boolean isVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + "Es VIP: " + this.vip;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(this.idCliente);
        sb.append(", fechaRegsitri=").append(this.fechaRegsitro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }     
}
