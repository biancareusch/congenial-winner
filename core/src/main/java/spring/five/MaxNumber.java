package spring.five;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER,ElementType.METHOD}) //indicates context in which the annotation type is applicable
@Retention(RetentionPolicy.RUNTIME) //indicates how long annotations are to be retained
@Qualifier // used to annotate custom annotation
public @interface MaxNumber {

}
