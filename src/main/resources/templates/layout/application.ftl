<#macro tonado>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" lang="en">
    <head>
        <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1">
        <title>Tonado</title>
        <#--<link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/tonado.css">
        <script src="js/bootstrap.min.js"></script>-->
        <link rel="stylesheet" href="/webjars/bootstrap/3.3.0/css/bootstrap.min.css">
        <script src="/webjars/jquery/1.11.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <#nested>
    </body>
</html>
</#macro>