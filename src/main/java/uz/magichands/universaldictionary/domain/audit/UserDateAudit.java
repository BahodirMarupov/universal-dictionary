package uz.magichands.universaldictionary.domain.audit;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class UserDateAudit extends DateAudit{

    @CreatedBy
    @Column(updatable = false,nullable = false)
    private Long createBy;
    @Column(nullable = false)
    @LastModifiedBy
    private Long updatedBy;

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }
}
