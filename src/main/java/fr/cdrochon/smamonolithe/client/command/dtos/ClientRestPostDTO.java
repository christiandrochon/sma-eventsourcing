package fr.cdrochon.smamonolithe.client.command.dtos;

import fr.cdrochon.smamonolithe.client.query.entities.AdresseClient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ClientRestPostDTO {
//    private String id;
    private String nomClient;
    private String prenomClient;
    private String mailClient;
    private String telClient;
    //FIXME: mettre une adresse DTO ?
    private AdresseClient adresseClient;
}
