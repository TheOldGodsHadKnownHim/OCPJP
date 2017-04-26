package ocpjp._2.advanced_java_class_design_nested_classes_anonymousInnerClass;

public class AnonymousInner {
	
	abstract class SaleTodayOnly {
		abstract int dollarsOff();
	}
	
	public int determineAdmissionPrice(int basePrice){
		SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {
			
			@Override
			int dollarsOff() {
				return 3;
			}
		};
		return basePrice - saleTodayOnly.dollarsOff();
	}

}
