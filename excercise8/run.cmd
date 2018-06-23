cmd /c mvn compile
if ERRORLEVEL 1 exit /b
java -cp target\classes excercise8.App
