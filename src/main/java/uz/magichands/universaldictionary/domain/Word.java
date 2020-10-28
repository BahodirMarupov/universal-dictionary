package uz.magichands.universaldictionary.domain;

import uz.magichands.universaldictionary.domain.audit.UserDateAudit;

import javax.persistence.*;

@Entity
public class Word extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nameUz;
    @Column(nullable = false)
    private String nameEn;

    private String description;

}
