package uz.magichands.universaldictionary.domain.audit;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.Instant;
import java.util.Date;

@MappedSuperclass
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@EntityListeners(AuditingEntityListener.class)
public class DateAudit {

    @CreatedDate
    @Column(nullable = false, updatable = false)
    @JsonFormat(pattern = "YYYY-MM-dd hh:mm:ss")
    private Instant createdAt;
    @LastModifiedDate
    @Column(nullable = false)
    @JsonFormat(pattern = "YYYY-MM-dd hh:mm:ss")
    private Instant updatedAt;

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
