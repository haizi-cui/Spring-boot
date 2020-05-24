<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>鸽子</title>
</head>
<body>
    { 马燕鸽是我对象 }
    <table  border="1" cellpadding="3" cellspacing="0" style="width: 60%;margin:auto">
        <tr>
            <th>姓名</th>
            <th>编号</th>
            <th>年龄</th>
        </tr>
        <#list xiaomalist as user>
            <tr>
                <td>${(user.username)!''}</td>
                <td>${(user.usersex)!''}</td>
                <td>${(user.userage)!''}</td>
            </tr>
        </#list>
    </table>
</body>
</html>