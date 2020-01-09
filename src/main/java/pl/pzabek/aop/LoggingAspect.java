package pl.pzabek.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//	@Before("execution(* pl.pzabek.Samochod.*(..))")
//	@Before("execution(* pl.pzabek.Samochod.debug(..))")
//	public void logBefore(JoinPoint joinPoint) {
//
//		System.out.println("logBefore() is running!: " + joinPoint.getSignature().getName());
//	}

//	@After("execution(* pl.pzabek.Samochod.debug(..))")
//	public void logAfter(JoinPoint joinPoint) {
//
//		System.out.println("logAfter() is running!: " + joinPoint.getSignature().getName());
//	}

//	@Around("execution(* pl.pzabek.Samochod.*(..))")
//	public void logAroundAllMethods(ProceedingJoinPoint joinPoint) {
//		System.out.println("logAroundAllMethods " + joinPoint.getSignature().getName() + "Before");
//		try {
//			joinPoint.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		System.out.println("logAroundAllMethods " + joinPoint.getSignature().getName() +"After");
//
//	}
//    @Around("execution(* com.howtodoinjava.app.service.impl.EmployeeManagerImpl.*(..))")
//    public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable 
//    {
//        System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
//        try {
//            joinPoint.proceed();
//        } finally {
//            //Do Something useful, If you have
//        }
//        System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": After Method Execution");
//    }

//    @Before("execution(* Samochod.setName(..))")
//    public void logBeforeV1(JoinPoint joinPoint) 
//    {
//        System.out.println("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
//    }
//     
//    @Before("execution(* EmployeeManager.*(..))")
//    public void logBeforeV2(JoinPoint joinPoint) 
//    {
//        System.out.println("EmployeeCRUDAspect.logBeforeV2() : " + joinPoint.getSignature().getName());
//    }
//     
//    @After("execution(* EmployeeManager.getEmployeeById(..))")
//    public void logAfterV1(JoinPoint joinPoint) 
//    {
//        System.out.println("EmployeeCRUDAspect.logAfterV1() : " + joinPoint.getSignature().getName());
//    }
//     
//    @After("execution(* EmployeeManager.*(..))")
//    public void logAfterV2(JoinPoint joinPoint) 
//    {
//        System.out.println("EmployeeCRUDAspect.logAfterV2() : " + joinPoint.getSignature().getName());
//    }
}