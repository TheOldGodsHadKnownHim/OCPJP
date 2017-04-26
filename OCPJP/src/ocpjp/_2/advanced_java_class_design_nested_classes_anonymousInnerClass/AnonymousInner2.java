package ocpjp._2.advanced_java_class_design_nested_classes_anonymousInnerClass;

public class AnonymousInner2 {
	
	interface SaleTodayOnly {
		int dollarsOff();
	}
	
	public int pay(){
		return admission (30, new SaleTodayOnly() {
			
			@Override
			public int dollarsOff() {
				return 5;
			}
		});
	}
	public int admission(int basePrice, SaleTodayOnly saleTodayOnly){
		return basePrice - saleTodayOnly.dollarsOff();
	}
}
