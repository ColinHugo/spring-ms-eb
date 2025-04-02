package com.eazybytes.cards.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/* Para mapear los valores a los atributos, se necesita la anotación con el prefijo
El prefijo "cards" viene del valor que está en el archivo application.yml y deben coincidir los nombres
Se necesita poner la anotación @EnableConfigurationProperties( PojoClass ) en la clase principal para leer los valores */
@ConfigurationProperties( prefix = "cards" )
@Getter
@Setter
public class CardsContactInfoDto {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;

}
