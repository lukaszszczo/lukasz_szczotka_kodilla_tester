del C:\Java\build\libs\*.jar
call gradlew build
if -e C:\Java\build\libs\*.jar goto fail
cd C:
mkdir project
copy C:\Java\build\libs\*.jar C:\Java\build\libs\project\*.jar
goto end


:fail
echo fail

:end