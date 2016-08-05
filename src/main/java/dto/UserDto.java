package dto;

import lombok.Data;

@Deprecated
@Data
public class UserDto {

	private long id;
	private String username;
	private String password;
}
