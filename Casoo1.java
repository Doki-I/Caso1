/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7caso1;

/**
 *
 * @author Aulas Heredia
 */

import javax.swing.JOptionPane;

public class Casoo1 {

    static class Factura {
        String nombre;
        String mes;
        String cliente;
        int codigoFactura;
        double montoFactura;
        int mesFactura;
        int añoFactura;
        boolean pagada;
//Variables guardadas para la factura
        public Factura(String nombre, String mes, String cliente, int codigoFactura,
                       double montoFactura, int mesFactura, int añoFactura) {
            this.nombre = nombre;
            this.mes = mes;
            this.cliente = cliente;
            this.codigoFactura = codigoFactura;
            this.montoFactura = montoFactura;
            this.mesFactura = mesFactura;
            this.añoFactura = añoFactura;
            this.pagada = false;
        }

        public void marcarComoPagada() {
            this.pagada = true;
        }
    }

    public static void main(String[] args) {
        Factura facturaEjemplo = new Factura("Ejemplo S.A.", "Enero", "Cliente A", 1, 1500.00, 1, 2024);
//Factura de ejemplo
        JOptionPane.showMessageDialog(null, "Nombre: " + facturaEjemplo.nombre +
                "\nMes: " + facturaEjemplo.mes +
                "\nCliente: " + facturaEjemplo.cliente +
                "\nCódigo de Factura: " + facturaEjemplo.codigoFactura +
                "\nMonto de la Factura: $" + facturaEjemplo.montoFactura +
                "\nMes de la Factura: " + facturaEjemplo.mesFactura +
                "\nAño de la Factura: " + facturaEjemplo.añoFactura +
                "\nEstado de la Factura: " + (facturaEjemplo.pagada ? "Pagada" : "No Pagada"));

        facturaEjemplo.marcarComoPagada();
//Con esto se marcaría si esta pagada o no 
        JOptionPane.showMessageDialog(null, "Estado de la Factura después del pago: " +
                (facturaEjemplo.pagada ? "Pagada" : "No Pagada"));
    }
}
