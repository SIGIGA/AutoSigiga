package edu.udea.main.controlador;

import edu.udea.main.business.GestorEmpresa;
import edu.udea.main.model.Empresa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmpresaControlador {
    private GestorEmpresa gestorEmpresa = new GestorEmpresa();
    @GetMapping("/Empresas")
    public ResponseEntity<ArrayList<Empresa>> getEmpresas(){
        return new ResponseEntity<>(gestorEmpresa.getEmpresas(), HttpStatus.ACCEPTED);
    }

}
