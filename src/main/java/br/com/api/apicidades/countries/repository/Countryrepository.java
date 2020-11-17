package br.com.api.apicidades.countries.repository;

import br.com.api.apicidades.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Countryrepository extends JpaRepository<Country, Long> {

}
