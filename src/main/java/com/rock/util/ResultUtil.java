package com.rock.util;

import com.rock.domain.Result;

public class ResultUtil {

	
	public static Result  success(Object object) {
		Result result = new Result();
		result.setCode(0);
		result.setmString("成功");
		result.setData(object);
		return result;
	}
	public static Result success() {
		return success(null);
	}
	public static Result error(Integer code,String msg) {
		Result result = new Result();
		result.setCode(code);
		result.setmString(msg);
		return result;
	}
}
