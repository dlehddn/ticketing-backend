package ticketing.ticket.member.domain.dto;
import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberResponse {
    private Long memberId;
    private String name;
    private String email;

    @Builder
    public MemberResponse(Long memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }
}
