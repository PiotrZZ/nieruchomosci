package pl.pzabek.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* pl.pzabek.Samochod.setName(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

    @Before("execution(* Samochod.setName(..))")
    public void logBeforeV1(JoinPoint joinPoint) 
    {
        System.out.println("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
    }
     
    @Before("execution(* EmployeeManager.*(..))")
    public void logBeforeV2(JoinPoint joinPoint) 
    {
        System.out.println("EmployeeCRUDAspect.logBeforeV2() : " + joinPoint.getSignature().getName());
    }
     
    @After("execution(* EmployeeManager.getEmployeeById(..))")
    public void logAfterV1(JoinPoint joinPoint) 
    {
        System.out.println("EmployeeCRUDAspect.logAfterV1() : " + joinPoint.getSignature().getName());
    }
     
    @After("execution(* EmployeeManager.*(..))")
    public void logAfterV2(JoinPoint joinPoint) 
    {
        System.out.println("EmployeeCRUDAspect.logAfterV2() : " + joinPoint.getSignature().getName());
    }
	
}