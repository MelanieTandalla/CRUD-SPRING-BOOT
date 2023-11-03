package Crud.Crud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Crud.Crud.empresa.Empresa;
import Crud.Crud.repositorio.EmpresaRepository;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa create(Empresa empresa){
        return empresaRepository.save(empresa);
    }
    
    public List<Empresa> getAllEmpresas (){
        return empresaRepository.findAll();
    }

    public void delete (Empresa empresa){
        empresaRepository.delete(empresa);
    }

    public Optional<Empresa> findById(Long id_empresa){
        return empresaRepository.findById(id_empresa);
    }

}
