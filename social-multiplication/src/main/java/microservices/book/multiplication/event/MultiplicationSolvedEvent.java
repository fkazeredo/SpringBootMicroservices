package microservices.book.multiplication.event;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class MultiplicationSolvedEvent implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final Long multiplicationResultAttemptId;
	private final Long userId;
	private final boolean correct;

}
