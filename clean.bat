@echo off
chcp 65001
set currentPath=%cd%
del /S %currentPath%\*.class
REM echo Today is %date% %time%
REM pause