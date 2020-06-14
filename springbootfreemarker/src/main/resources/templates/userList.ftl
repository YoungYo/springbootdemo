<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello Freemarker</title>
</head>
<body>
    <table border="1" align="center" width="50%">
        <tr>
            <th>Name</th>
            <th>Gender</th>
            <th>Age</th>
        </tr>
        <#list list as user>
            <tr>
                <td>${user.username}</td>
                <td>${user.gender}</td>
                <td>${user.age}</td>
            </tr>
        </#list>
    </table>
</body>
</html>