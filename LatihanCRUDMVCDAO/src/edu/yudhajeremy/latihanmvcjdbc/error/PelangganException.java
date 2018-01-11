/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.yudhajeremy.latihanmvcjdbc.error;

/**
 *
 * @author
 * Nama     : Yudha Jeremy Yudhistira
 * NIM      : 10116554
 * Kelas    : PBO - 12
 */
public class PelangganException extends Exception {

    /**
     * Creates a new instance of <code>PelangganExection</code> without detail
     * message.
     */
    public PelangganException() {
    }

    /**
     * Constructs an instance of <code>PelangganExection</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganException(String msg) {
        super(msg);
    }
}
