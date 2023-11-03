package Crud.Crud.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import Crud.Crud.empresa.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    
}
