@echo off
if [%1]==[] goto ERR_PARAM

SET project_name=%1
cmd /c mvn archetype:generate -DgroupId=%project_name% -DartifactId=%project_name% -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
rmdir /s /q %project_name%\src\test
exit /b

:ERR_PARAM
echo �g����: create-java-project.cmd [�쐬����v���W�F�N�g��]
exit /b -1
