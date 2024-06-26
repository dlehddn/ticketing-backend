package ticketing.ticket.membercoupon.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ticketing.ticket.common.entity.BaseEntity;
import ticketing.ticket.coupon.domain.entity.Coupon;
import ticketing.ticket.member.domain.entity.Member;

@Entity
@Setter
@Getter
public class MemberCoupon extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberCouponId;

    @ManyToOne
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    public MemberCoupon() {
    }

    @Builder
    public MemberCoupon(Coupon coupon, Member member) {
        this.coupon = coupon;
        this.member = member;
    }
}
