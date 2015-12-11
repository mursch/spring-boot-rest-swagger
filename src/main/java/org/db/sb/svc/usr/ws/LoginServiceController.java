package org.db.sb.svc.usr.ws;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.db.sb.svc.usr.ws.dto.UserLoginRequest;
import org.db.sb.svc.usr.ws.dto.UserLoginResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Component
@RestController
@RequestMapping("/api/user")
public class LoginServiceController {

	@RequestMapping(
			path = "/v1/login",
			method = RequestMethod.POST)
	@ApiOperation(
			value = "User login",
			notes = "Comment",
			response = UserLoginResponse.class)
	@ApiResponses({
		@ApiResponse(code = 400, message = "error: 400 - Validation Error")
	})
	public UserLoginResponse login(@RequestBody @ApiParam(value = "The user login information.") @NotNull @Valid UserLoginRequest userLoginRequest) {
		return UserLoginResponse.create("test");
	}

}
