package uz.magichands.universaldictionary.domain;

import uz.magichands.universaldictionary.domain.audit.UserDateAudit;

import javax.persistence.*;

@Entity
public class UserWord extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    private Word word;

    private boolean isLearnt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public boolean isLearnt() {
        return isLearnt;
    }

    public void setLearnt(boolean learnt) {
        isLearnt = learnt;
    }
}
