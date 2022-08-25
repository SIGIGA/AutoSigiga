package edu.udea.main.business;

import edu.udea.main.model.Empresa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GestorEmpresa {
    private ArrayList<Empresa> empresas;

    public GestorEmpresa() {
        this.empresas = new ArrayList<Empresa>();

        this.empresas.add(new Empresa("AutoSIGIGA","Av Pcpal 3","98765","9876"));
    }

    public ArrayList<Empresa> getEmpresas() {
        return this.empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }
}
