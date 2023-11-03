package Crud.Crud.EmpresaREST;

import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Crud.Crud.Service.EmpresaService;
import Crud.Crud.empresa.Empresa;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping ("/api/empresa/")
public class EmpresaRest {
    
    @Autowired 
    private EmpresaService empresaService;

    @PostMapping
    private ResponseEntity<Empresa> guardar (@RequestBody Empresa empresa){
        Empresa temporal = empresaService.create(empresa);

        try{
            return ResponseEntity.created(new URI("/api/empresa"+temporal.getId_empresa())).body(temporal);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    public ResponseEntity <List<Empresa>> Listartodas(@RequestBody Empresa empresa){
        return ResponseEntity.ok(empresaService.getAllEmpresas());
    }

    @DeleteMapping
    public ResponseEntity<Void> EliminarPerona (@RequestBody Empresa empresa){
        empresaService.delete(empresa);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value="{id}")
    public ResponseEntity<Optional<Empresa>> ListarEmpresaId(@PathVariable ("id_empresa") long id_empresa) {
        return ResponseEntity.ok(empresaService.findById(id_empresa));
    }
    
    }
      






