RD /S /Q C:\Builds\GeoportalServer\10.2_CSWClients\Sources\AppLogger\trunk
RD /S /Q C:\Builds\GeoportalServer\10.2_CSWClients\Sources\Geoportal\trunk\src\gpt\search\profiles


XCOPY C:\Repositories\geoportal-server\components\desktop\AppLogger\trunk\*.* C:\Builds\GeoportalServer\10.2_CSWClients\Sources\AppLogger\trunk /E /I /Y
XCOPY C:\Repositories\geoportal-server\geoportal\src\gpt\search\profiles\*.* C:\Builds\GeoportalServer\10.2_CSWClients\Sources\Geoportal\trunk\src\gpt\search\profiles /E /I /Y

RD /S /Q C:\Builds\GeoportalServer\10.2_CSWClients\Sources\CswClient\addins
RD /S /Q C:\Builds\GeoportalServer\10.2_CSWClients\Sources\CswClient\branches
RD /S /Q C:\Builds\GeoportalServer\10.2_CSWClients\Sources\CswClient\tags