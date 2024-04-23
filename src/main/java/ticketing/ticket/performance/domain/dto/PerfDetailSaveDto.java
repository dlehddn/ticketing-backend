package ticketing.ticket.performance.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class PerfDetailSaveDto {
    private String artist;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    private LocalDateTime startTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    private LocalDateTime endTime;

    private Integer price;

    public PerfDetailSaveDto(String artist, LocalDateTime startTime, LocalDateTime endTime, Integer price) {
        this.artist = artist;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }
}
