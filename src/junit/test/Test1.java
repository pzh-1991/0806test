package junit.test;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.offcn.crm.interfaces.MathCaculator;

public class Test1 {
	@Test
	public void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		MathCaculator bean = ac.getBean(MathCaculator.class);
		bean.multiply(214748364	,214748364);
	}
	
	
	
}
