package com.springmvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springmvc.model.User;

/**
 * description: TODO
 *
 * createtime: 2012-12-13 上午09:31:09
 *
 * @author zenghua
 * @version 1.0
 */

public class UserValidator implements Validator {

	/**
	 * 验证是不是目标对象User
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors e) {
//		MessageCodesResolver
//		DataBinder
//		CustomDateEditor
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty and it is requeryed");
		User u = (User) target;
		if (u.getAge() < 0) {
			//negative负数
			e.rejectValue("age", "negativevalue");
		} else if (u.getAge() > 110) {
			e.rejectValue("age", "too.darn.old");
		}
	}

}
