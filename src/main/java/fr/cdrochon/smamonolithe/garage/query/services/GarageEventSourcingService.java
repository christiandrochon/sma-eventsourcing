package fr.cdrochon.smamonolithe.garage.query.services;

import org.axonframework.eventsourcing.eventstore.DomainEventStream;

public interface GarageEventSourcingService {
    
    /**
     * Renvoi les events d'un garage identifié par son id
     * @param id
     * @return
     */
    DomainEventStream eventsByGarageId(String id);
}
