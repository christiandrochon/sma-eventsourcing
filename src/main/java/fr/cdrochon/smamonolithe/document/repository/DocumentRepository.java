package fr.cdrochon.smamonolithe.document.repository;

import fr.cdrochon.smamonolithe.document.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
