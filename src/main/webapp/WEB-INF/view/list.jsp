<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/index_work.css" />
<link href="<%=request.getContextPath()%>/css/index_work.css"
	rel="stylesheet">
<!-- 引入样式 -->
<link href="/resource/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>

</head>
<body>
	<form action="list" method="post">
		价格范围<input type="text" name="startPrice" value="${vo.startPrice}">--<input
			type="text" name="endPrice" value="${vo.endPrice}"> 百分比<input
			type="text" name="startSales" value="${vo.startSales}">--<input
			type="text" name="endSales" value="${vo.endSales}"> <select
			name="orderName">
			<option value="sales" ${vo.orderName=="sales"?"selected":''}>百分比</option>
			<option value="price" ${vo.orderName=="price"?"selected":''}>价格</option>
		</select> <select name="orderMethod">
			<option value="asc" ${vo.orderMethod=="asc"?"selected":''}>升序</option>
			<option value="desc" ${vo.orderMethod=="desc"?"selected":''}>降序</option>
		</select> <input type="submit" value="查询">

		<table class="table">
			<tr>
				<td>商品编号</td>
				<td>商品名称</td>
				<td>价格</td>
				<td>百分比</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${info.list }" var="goods">
				<tr>
					<td>${goods.id }</td>
					<td>${goods.name }</td>
					<td>${goods.price }</td>
					<td>${goods.sales }</td>
					<td>操作</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="10" align="center">共${info.pageNum }/${info.pages}页--共${info.total }条数据
					<a href="list?pageNum=1">首页</a> <a
					href="list?pageNum=${info.prePage }">上一页</a> <a
					href="list?pageNum=${info.nextPage }">下一页</a> <a
					href="list?pageNum=${info.pages }">尾页</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>