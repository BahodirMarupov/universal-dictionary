package uz.magichands.universaldictionary.domain;

import uz.magichands.universaldictionary.domain.audit.UserDateAudit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String contentType;

    private byte[] content;
}
