package domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class MembersVO {

	private int memberId;
	private String fistName;
	private String lastName;
	private String gender;
	private Timestamp dob;
	private String email;
}
