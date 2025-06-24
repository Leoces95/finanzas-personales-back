package com.finanzas.finanzas_personales.dtos;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GeneralResponseDto {
    private boolean success;         // true o false
    private String message;          // Mensaje para el usuario o desarrollador
    private String severity;         // "INFO", "WARNING", "ERROR"
    private Object data;                  // Objeto de respuesta (DTO, lista, etc.)
    private String timestamp;        // Marca de tiempo (opcional pero útil)
}
