@echo off
if [%1]==[] goto ERR_PARAM

SET project_name=%1
cmd /c mvn archetype:generate -DgroupId=com.example -DartifactId=%project_name% -Dpackage=%project_name% -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
pushd %project_name%
rmdir /s /q src\test
echo cmd /c mvn compile>>run.cmd
echo if ERRORLEVEL 1 exit /b>>run.cmd
echo java -cp target\classes %project_name%.App>>run.cmd
popd
exit /b

:ERR_PARAM
echo 使い方: create-java-project.cmd [作成するプロジェクト名]
exit /b -1
