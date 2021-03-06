package com.igorcoura.documentmanager.domain.models.document;

import com.igorcoura.documentmanager.domain.entities.BaseEntity;
import com.igorcoura.documentmanager.domain.entities.DocumentCategory;
import com.igorcoura.documentmanager.domain.entities.DocumentStatus;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentModel {

    private Long id;
    private Long idEntity;
    private String nameDocument;
    private String category;
    private String status;
    private String fileLink;
    private LocalDate archivingDate;
    private LocalDate dueDate;

}
