//javadoc [options][packages][sources][-subpackages pkg1:pkg2 ...][@argfiles]
javadoc -sourcepath c:\test\APP sample
javadoc -verbose -sourcepath c:\test\APP sample


//jar [options][manifest] out in [in ...]
jar cf myFile.jar *.class
jar xf myFile.jar

//java[options] classfile [args ...]
PocketPackage.HelloWorld
java -jar Test.jar
java -jar Test "Hello"


// javac [ options ][ sourcefiles ][ @argfiles ]

javac PocketPackage\HelloWorld.java
javac -d cL\test -classpath .;c:\javalib\mylib.jar HelloWorld.java

