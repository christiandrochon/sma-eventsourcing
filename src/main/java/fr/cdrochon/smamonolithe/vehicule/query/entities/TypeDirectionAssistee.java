package fr.cdrochon.smamonolithe.vehicule.query.entities;

import lombok.*;

import javax.persistence.Embeddable;
import java.util.Arrays;
import java.util.Collection;
@Embeddable
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TypeDirectionAssistee {
    
    Collection<String> directionAssistee = Arrays.asList("HYDRAULIQUE", "ELECTRIQUE", "SANS_DIRECTION_ASSISTEE");
    
}
