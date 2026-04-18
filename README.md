template to a csharp Interpreter


java -jar antlr-4.9.2-complete.jar -visitor cs.g4


javac --release 25 -cp .:antlr-4.9.2-complete.jar *.java



java -cp .:antlr-4.9.2-complete.jar Interpreter my.cs

