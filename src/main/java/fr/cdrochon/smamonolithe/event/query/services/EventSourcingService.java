package fr.cdrochon.smamonolithe.event.query.services;

import org.axonframework.eventsourcing.eventstore.DomainEventStream;

public interface EventSourcingService {
    
    /**
     * Renvoi les events d'un garage identifié par son id
     * @param id
     * @return
     */
    DomainEventStream eventsByGarageId(String id);
}
