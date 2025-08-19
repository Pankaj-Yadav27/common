package com.common.dto;

import java.time.LocalDateTime;

public class AuditableBaseDTO {
    protected LocalDateTime createdAt=LocalDateTime.now();
    protected Boolean deleted=false;
    protected LocalDateTime updatedAt=LocalDateTime.now();

    public AuditableBaseDTO() {
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
