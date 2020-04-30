package com.shu.crm.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class BeanUtil {

	private static final Logger logger = LoggerFactory.getLogger(BeanUtil.class);


	/**
	 * 把具有相同字段和类型的bean进行转换
	 * @param source
	 * @param targetClass
	 * @param <T>
	 * @return
	 */
	public static <T> T convert(Object source, Class<T> targetClass) {
		T target = null;

		if(source != null) {
			try {
				target = targetClass.newInstance();
				BeanUtils.copyProperties(source, target);
			}catch (Exception e) {
				logger.error("convert bean is error",e);
			}

		}

		return target;
	}

	/*****
	 * list bean对象转换 相同字段和类型进行转换
	 * @param sourceList
	 * @param targetClass
	 * @param <T>
	 * @return
	 */
	public static <T> List<T> convertList(List sourceList, Class<T> targetClass) {
		List<T> targetList = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(sourceList)) {
			sourceList.forEach(source -> {
				targetList.add(convert(source, targetClass));
			});
		}
		return targetList;
	}


	/****
	 * 分页对象类型转换
	 * @param sourcePage
	 * @param targetClass
	 * @param <T>
	 * @return
	 */
	public static <T> IPage<T> convertPage(IPage sourcePage, Class<T> targetClass) {
		IPage<T> dtoPage = new Page<>();
		if (sourcePage != null) {
			dtoPage.setSize(sourcePage.getSize());
			dtoPage.setTotal(sourcePage.getTotal());
			dtoPage.setCurrent(sourcePage.getCurrent());
			dtoPage.setPages(sourcePage.getPages());
			dtoPage.setRecords(convertList(sourcePage.getRecords(), targetClass));
		}
		return dtoPage;
	}

	public static <T> T convert(Object source, Class<T> targetClass , String[] ignoreProperties) {
		T target = null;

		if(source != null) {
			try {
				target = targetClass.newInstance();
				BeanUtils.copyProperties(source, target,ignoreProperties);
			}catch (Exception e) {
				logger.error("convert bean is error",e);
			}

		}

		return target;
	}

	public static void setFieldValue(Object object, String fieldName, Object value) {
		Field field = ReflectionUtils.findField(object.getClass(), fieldName);
		if (field == null) {
			throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + object + "]");
		}
		ReflectionUtils.makeAccessible(field);
		ReflectionUtils.setField(field, object, value);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getFieldValue(Object object, String fieldName) {
		Field field = ReflectionUtils.findField(object.getClass(), fieldName);
		if (field == null) {
			throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + object + "]");
		}
		ReflectionUtils.makeAccessible(field);
		return (T) ReflectionUtils.getField(field, object);
	}
}

