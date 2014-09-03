@echo off
:: This script installs JediTerm library as Maven artifact into local repository

:: Usage ./install-jediterm-artifact "path_to_jediterm_build_directory/jediterm-terminal-2.0.jar"

set JAR_PATH=%1

if "%JAR_PATH%"=="" (
    echo Please provide path to jediterm-terminal-2.0.jar as script argument
    exit /b
)

mvn install:install-file -Dfile=%JAR_PATH% -DgroupId=com.jediterm -DartifactId=jediterm-terminal -Dversion=2.0 -Dpackaging=jar
