# congenial-winner
Multi module console game application using Maven, Spring Framework 5, Java, and Lombok.

Used software project management tool, Maven, to manage build automation because
- it makes build process easier,
- provides a unform build system
- provides guidelines for best practices development
- allows transparent migration to new features and
- provides quality project information.

Used xml and Annotation based configuration to build Java based configuration classes, which centralize most annotation classes, 
also for type safety and a clean seperation of concerns(xml's)

Reasons for using Annotation based configurations:
- shorter more concise code
- ensures type safety

Reasons for using xml based configurations:
- seperate concerns( since configuration is outside of Java classes)
- whole configuration is just a few lines so if changes are needed there's no need to recompile
- helps centralize configuration metadata
- more verbose

Added Qualifiers, annotations that can be applied to beans, which are used to fine-tune annotation based autowiring.

Implmented Lombok Getters and Setters to clean up code.
