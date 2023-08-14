package com.dixmillescodeurs.poo.hello.service;

import com.dixmillescodeurs.poo.hello.model.dto.VoyageDto;
import com.dixmillescodeurs.poo.hello.model.entities.Voyage;
import com.dixmillescodeurs.poo.hello.repository.VoyageRepository;
import com.dixmillescodeurs.poo.hello.service.mapper.VoyageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniel FOUOMENE
 */
@Service
public class VoyageService {

  @Autowired
  private VoyageRepository voyageRepository;

  @Autowired
  private VoyageMapper voyageMapper;

  public List<VoyageDto> listVoyages() {

   /*List<Voyage> voyages = voyageRepository.findAll();

   List<VoyageDto> voyageDtos = new ArrayList<>();
   for (Voyage voyage : voyages) {
     voyageDtos.add( voyageMapper.toDto(voyage));
   }*/

    //return voyageRepository.findAll().stream().map(voyage -> voyageMapper.toDto(voyage)).collect(Collectors.toList());
    return voyageRepository.findAll().stream().map(voyageMapper::toDto).collect(
        Collectors.toList());
  }

  public Long ajouterVoyage(VoyageDto voyageDto){

    checkNomAlreadyUsed(voyageDto);

    return voyageRepository.save(voyageMapper.toEntity(voyageDto)).getId();
  }

  public boolean supprimerVoyage(String nomVoyage){

    Voyage voyage = voyageRepository.findVoyageByNom(nomVoyage)
        .orElseThrow( ()->new RuntimeException("Code 256 : le voyage que vous voulez supprimer nexiste pas"));

    voyageRepository.deleteById(voyage.getId());

    return true;
  }

  public boolean modifierVoyage( VoyageDto voyageDto){

    Voyage voyage = voyageRepository.findVoyageByNom(voyageDto.getNom())
        .orElseThrow( ()->new RuntimeException("Code 256 : le voyage que vous voulez modifier nexiste pas"));

    voyageMapper.copy(voyageDto,voyage);

    voyageRepository.save(voyage);

    return  true;

  }

  private void checkNomAlreadyUsed(VoyageDto voyageDto) {
    if(voyageRepository.existsByNomIgnoreCase(voyageDto.getNom())){
      throw new RuntimeException("Code 5268 : Il existe dejà un voyage avec ce nom");
    }
  }


  public VoyageDto recupererVoyage(long id) {
        return voyageMapper.toDto(voyageRepository.findById(id).get());
  }
}
