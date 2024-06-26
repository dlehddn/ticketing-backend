package ticketing.ticket.membercoupon.exception;

import lombok.Getter;
import ticketing.ticket.common.error.BusinessException;
import ticketing.ticket.common.error.errorcodes.ErrorCode;

@Getter
public class DuplicatedCouponException extends BusinessException {
    public DuplicatedCouponException(Throwable cause, ErrorCode errorCode) {
        super(cause, errorCode);
    }
}
