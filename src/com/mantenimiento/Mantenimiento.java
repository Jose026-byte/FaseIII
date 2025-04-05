package com.mantenimiento;

public class Mantenimiento {
    private String maquina;
    private String tipo; // preventivo o correctivo
    private String descripcion;
    private String fecha;

    public Mantenimiento(String maquina, String tipo, String descripcion, String fecha) {
        this.maquina = maquina;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Máquina: " + maquina + " | Tipo: " + tipo + " | Descripción: " + descripcion + " | Fecha: " + fecha;
    }
}
