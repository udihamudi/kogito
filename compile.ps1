# Example: Play a 500Hz tone for 500 milliseconds after the command finishes
mvn clean package -Pcontainer  ; powershell -c "[System.Console]::Beep(500, 500)"