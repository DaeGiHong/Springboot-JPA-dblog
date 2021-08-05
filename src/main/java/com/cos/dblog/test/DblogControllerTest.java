package com.cos.dblog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cos.dblog 패키지 이해를 스캔해서 모든 파일을 메모리에 new 하는 것은 아니구요 
//특정 어노테이션이 붙어있는 클래스 파일을 new해서 IoC 스프링 컨테이너에 관리해줍니다.
@RestController 
public class DblogControllerTest {
	
	@GetMapping("/test/hello")
	public String Hello() {
		return "<h1>Hello!</h1>";
	}

}
