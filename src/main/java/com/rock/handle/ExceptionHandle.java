package com.rock.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rock.domain.Result;
import com.rock.exception.GirlException;
import com.rock.util.ResultUtil;

@ControllerAdvice
public class ExceptionHandle {

	private final  static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result handler(Exception e) {
		if( e  instanceof GirlException) {
			GirlException girlException = (GirlException) e;
			return ResultUtil.error(girlException.getCode(), girlException.getMessage());
		}else {
			return ResultUtil.error(-1, "未知错误");
		}

	}

}
