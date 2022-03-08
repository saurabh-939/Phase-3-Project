<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>

</head>
<body>
<form:form method="post" modelAttribute="product" action="/SpringMVCHibernateCRUDExample/addProduct">
<table>
		<tr>
			<th colspan="2">Products</th>
		</tr>
		<tr>
		<form:hidden path="id" />
          <td><form:label path="productName">Product Name:</form:label></td>
          <td><form:input path="productName" size="30" maxlength="30"></form:input></td>
        </tr>
		<tr>
			    <td><form:label path="qty">Quantity:</form:label></td>
          <td><form:input path="qty" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="update"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Product List</h3>
<c:if test="${!empty listOfProducts}">
	<table class="tg">
	<tr>
		<th width="120">Id</th>
		<th width="120">Product Name</th>
		<th width="120">Qty</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfProducts}" var="product">
		<tr>
			<td>${product.id}</td>
			<td>${product.productName}</td>
			<td>${product.qty}</td>
			<td><a href="<c:url value='/updateProduct/${product.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteProduct/${product.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
