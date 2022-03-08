
<html>
<head>
</head>
<body>


<form action=""  method="get"onsubmit="setURL(this)">
<h1>Search Product</h1>
	<label>Enter ID:</label>
    <input type="text" id="urlVal" />
    <input type="submit" value="search" />
</form>
<script type="text/javascript">
function setURL(form) {
    form.action="updateProduct/"+form.urlVal.value;
    console.log(form.action);
  
}
</script>
</body>
</html>