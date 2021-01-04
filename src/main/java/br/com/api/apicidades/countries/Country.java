package br.com.api.apicidades.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " pais ")
public class Country {
    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugueseName;

    @Column(name = "sigla")
    private String code;

    private Integer bacen;

    public Country() {
    }

    public Integer getBacen() {
        return bacen;
    }

    public String getCode() {
        return code;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
