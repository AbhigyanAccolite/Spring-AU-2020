package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@interface ExampleAnno{
    String firstWord();
    String secondWord();
}


@ExampleAnno(firstWord = "Example", secondWord = "Anno")
public class AnnotationExample {
	
	 
	public static void main(String[] args) {
		
		AnnotationExample obj = new AnnotationExample();
		
	}
	 
	

}
