package tn.enis.member.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.enis.member.beans.EvenementBean;
import tn.enis.member.beans.PublicationBean;

import java.util.Optional;

@FeignClient(name = "PUBLICATION-SERVICE")
public interface PublicationProxyService {
    @GetMapping("/api/v1/publications/{id}")
    ResponseEntity<Optional<PublicationBean>> getPublicationById (@PathVariable Long id);
}
