package com.example.vers_database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Teste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeste;

    private LocalDateTime dataRealizado;
    private Boolean satisfatoriedade;
    private Integer numeroPiezos;

    public Teste() {}

    public Teste(LocalDateTime dataRealizado, Boolean satisfatoriedade, Integer numeroPiezos) {
        this.dataRealizado = dataRealizado;
        this.satisfatoriedade = satisfatoriedade;
        this.numeroPiezos = numeroPiezos;
    }

    // Getters e Setters
    public Long getIdTeste() {
        return idTeste;
    }

    public void setIdTeste(Long idTeste) {
        this.idTeste = idTeste;
    }

    public LocalDateTime getDataRealizado() {
        return dataRealizado;
    }

    public void setDataRealizado(LocalDateTime dataRealizado) {
        this.dataRealizado = dataRealizado;
    }

    public Boolean getSatisfatoriedade() {
        return satisfatoriedade;
    }

    public void setSatisfatoriedade(Boolean satisfatoriedade) {
        this.satisfatoriedade = satisfatoriedade;
    }

    public Integer getNumeroPiezos() {
        return numeroPiezos;
    }

    public void setNumeroPiezos(Integer numeroPiezos) {
        this.numeroPiezos = numeroPiezos;
    }
}
