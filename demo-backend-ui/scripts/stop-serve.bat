wmic process where (commandline like "%%angular-cli%%" and not name="wmic.exe") delete
