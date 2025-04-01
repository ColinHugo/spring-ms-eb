package com.eazybytes.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/*
Bean con el nombre auditAwareImpl (mismo nombre de la clase)
Se pasa el mismo tipo del atributo updatedBy a la interfaz AuditorAware
Como se está auditando, se necesita poner la anotación @EntityListeners en el entity que contiene los atributos correspondientes
*/
@Component( "auditAwareImpl" )
public class AuditAwareImpl implements AuditorAware< String > {

    @Override
    public Optional< String > getCurrentAuditor() {
        // lógica a implementar para obtener el usuario actual
        return Optional.of( "ACCOUNTS_MS" );
    }

}