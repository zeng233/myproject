package com.myspring.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @description: 注入各种集合，property属性里面分别使用<list>,<set>,<map>,<props>标签
 * 
 * <bean id="collection" class="com.myspring.model.CollectionObject">
 *  <property name="list">
 *			<list>
 *				<value>lista</value>
 *				<value>listb</value>
 *			</list>
 *		</property>
 *	</bean>
 * 
 * @createtime: 2014-1-2 上午11:00:58
 * 
 * @author zenghua
 * 
 * @version 1.0
 */

public class CollectionObject extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7490994719355292374L;

	private List<String> list;
	private Set<String> set;
	private Map<String, Object> map;
	private Properties properties;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
