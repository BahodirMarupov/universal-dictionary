package uz.magichands.universaldictionary.domain.audit;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;

@MappedSuperclass
@JsonIgnoreProperties(value = {"createdAt","updatedAt"},allowGetters = true)
public class DateAudit {

    @CreatedDate
    @Column(nullable = false,updatable = false)
    @JsonFormat(pattern = "YYYY-MM-dd hh:mm:ss")
    private Timestamp createdAt;
    @LastModifiedDate
    @Column(nullable = false)
    @JsonFormat(pattern = "YYYY-MM-dd hh:mm:ss")
    private Timestamp updatedAt;

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
