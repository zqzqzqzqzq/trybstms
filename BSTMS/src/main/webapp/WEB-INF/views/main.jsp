<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.3.1.js"></script>
<script type="text/javascript">
	$(function(){
		//按钮添加时间
		$("#main_bt_gm").click(function(){
			getMoney();
		});
	})
	
	
	//取款操作
	function getMoney(){
		window.location.href="gm";
	}
</script>
</head>
<body>
  <input type="button" id="main_bt_gm" value="取款">
</body>
</html>