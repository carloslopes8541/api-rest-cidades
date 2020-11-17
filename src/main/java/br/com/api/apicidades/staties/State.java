package br.com.api.apicidades.staties;

import br.com.api.apicidades.countries.Country;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity( name = "State" )
@Table( name = "estado" )
@TypeDefs({@TypeDef( name  =  " jsonb " , typeClass  =  JsonBinaryType.class)})
public  class State {


    @Id
    private long id;

    @Column( name  =  " nome " )
    private String name;

    private  String uf;

    private Integer ibge;


    //@Column (name = "pais")
    //private Integer countryId;

  //  2º - @ManyToOne
    @ManyToOne
    @JoinColumn ( name  =  "pais" , referencedColumnName  =  "id" )
    private Country country;

    @Type( type  =  " jsonb " )
    @Basic ( fetch  =  FetchType . LAZY )
    @Column ( name  =  " ddd " , columnDefinition  =  " jsonb " )
    private  List< Integer> ddd;

    public State() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public List<Integer> getDdd() {
        return ddd;
    }

   public Country getCountry() {
        return country;
    }

  //  public  Integer getCountryID(){
   //     return countryId;
  //  }


}

