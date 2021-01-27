echo Start
echo %JAVA_HOME%
"%JAVA_HOME%\bin\xjc" 
"%JAVA_HOME%\bin\xjc" -p bg.cv.model -d generated -target 2.0 cv.xsd
pause