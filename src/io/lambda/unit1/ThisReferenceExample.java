package io.lambda.unit1;

/*
 * In case of anonymous inner class this reference has been override by anonymous inner class instance but in case of lambda 
 * it does not happens, inside the lambda it points the same this reference that this reference points outside the lambda. 
 */
public class ThisReferenceExample {

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println("Value of i is "+ i);
				System.out.println(this);
			}
			
			@Override
			public String toString(){
				return "This is the "+ this.getClass().getName()+" class.";
			}
		});
		System.out.println("--------------------");
		thisReferenceExample.doProcess(10, i->{
			System.out.println("Value of i is "+ i);
			//System.out.println(this);
		});
	}

	public void doProcess(int i, Process p){
		p.process(i);
		System.out.println(this);
	}
	
	public String toString(){
		return "This is the "+ this.getClass().getName()+" class.";
	}
}
