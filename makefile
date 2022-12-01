JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	moduloReg/Ubicacion.java \
	moduloReg/Libro.java \
	Main.java

default: classes

Main:Main.java
	java Main

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class 
	$(RM) moduloReg/*.class