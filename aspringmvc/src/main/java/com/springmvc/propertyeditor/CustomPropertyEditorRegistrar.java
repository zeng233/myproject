package com.springmvc.propertyeditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.springmvc.model.User;

/**
 * description: TODO
 *
 * createtime: 2012-12-13 上午11:05:54
 *
 * @author zenghua
 * @version 1.0
 */

public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

	public void registerCustomEditors(PropertyEditorRegistry registry) {
		// it is expected that new PropertyEditor instances are created
		registry.registerCustomEditor(User.class, new MyEditor());
		// you could register as many custom property editors as are required
		// here...
	}

}
