echo Deprecated
echo Essaye de generer classes java a partir du xsd
echo Utiliser plutot maven pour generer les classes (voir pom.xml ci-joint)
echo   
echo %JAVA_HOME%
"%JAVA_HOME%\bin\xjc" 
"%JAVA_HOME%\bin\xjc" -p bg.cv.model -d generated -target 2.0 src/main/ressources/xsd/cv.xsd
pause