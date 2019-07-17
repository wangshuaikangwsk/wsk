<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="/static/css/index2.css">
    <script type="text/javascript" src="/static/jquery-1.8.0.min.js"></script>
    <script type="text/javascript">


    </script>
</head>
<body>
<form action="getStudentList" method="post">
<#--<input type="text" name="mohu" value="${mohu}">-->
<#--<button>模糊查询</button>-->
</form>
<table>
    <tr>
        <td><input type="checkbox" name="ccc" onclick="qx()">全选</td>
        <td>ID</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>班级</td>
        <td>地址</td>
    </tr>

<#list mapStudentList as ma>
     <tr>
         <td><input type="checkbox" name="check" value="${ma.id}"></td>
         <td>${ma.id}</td>
         <td>${ma.name}</td>
         <td>${ma.age}</td>
         <td>${ma.cname}</td>
         <td>${ma.address}</td>
     </tr>
</#list>
<#--<tr>-->
<#--<td colspan="11">${page.page}当前${page.cpage}页/共${page.pagecount}页</td>-->
<#--</tr>-->
</table>

</body>
</html>