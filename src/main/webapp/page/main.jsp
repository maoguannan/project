<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style>
    .c1{text-align: center}
    input[name=sousuo]{height: 20px}
    input[name=s1]{height: 26px}
    .c2 .u1 li{position: relative;float: left;
        list-style-type: none;text-align: center;
    }
    .c2 ul li a{text-decoration: none;width:100px;height: 30px;
        display: block;text-align: center;}
    .c2 ul{padding-left: 480px;}
    .c3{text-align: center}
    .c4 .u2 li table{text-decoration: none;position: relative;float: left;
        list-style-type: none;text-align: center;}
     .c4 .u2{list-style-type: none;padding-left: 600px;}
    table{border: solid;width:150px;height: 200px}
    .t5{width:150px;height: 80px}
    </style>
 <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>"> 
<script src="js/jquery-2.1.4.js"></script>
<script type="text/javascript">
	$(function (){
		$.getJSON("user/findByType1.lovo",add1);
	});
	function add1(data) {
		var $table1 = $("table[class=t1]");
		$table1.empty();
		var head="<tr><th>用户名</th><th>性别</th><th>年龄</th><th>籍贯</th><th>操作</th></tr>";
		$table1.append(head);
		$.each(data,function(i,e){
 			var userName = e.userName;
 			var passWord =e.passWord;
 			var sex = e.sex;
 			var age=e.age;
 			var address=e.address;
 			var tr = "<tr><td><a href='user/tiaozhuan.lovo?userName="+ userName +"'>" + userName + "</a></td><td>" + sex + "</td><td>" + age + "</td><td>" + address + "</td><td><a href='user/tiaozhuan.lovo?userName="+ userName +"'>删除</a></td></tr>";
 			$table1.append(tr);
 		});
	}
</script>   
</head>
<body>
    <div class="c4">
                <table class="t1">
                </table>
    </div>
    <br>

</body>
</html>