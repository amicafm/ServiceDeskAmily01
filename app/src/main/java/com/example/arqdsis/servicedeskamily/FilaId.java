package com.example.arqdsis.servicedeskamily;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Created by arqdsis on 21/03/2018.
 */

public enum FilaId {

    DESKTOP (1000, "Desktops", "desktops");

    public int numero;
    public String nome;
    public String icone;


    FilaId (int numero, String nome, String icone){
        this.numero = numero;
        this.nome = nome;
        this.icone = icone;

    }

}
